/*
 * The MIT License
 *
 * Copyright (c) 2010, InfraDNA, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package hudson.diagnosis;

import hudson.Extension;
import hudson.Util;
import hudson.model.AdministrativeMonitor;
import jenkins.security.stapler.StaplerDispatchable;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.HttpRedirect;
import org.kohsuke.stapler.HttpResponse;
import org.kohsuke.stapler.HttpResponses;
import org.kohsuke.stapler.QueryParameter;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jenkins.model.Jenkins;
import org.kohsuke.stapler.Stapler;
import org.kohsuke.stapler.interceptor.RequirePOST;

/**
 * Looks out for a broken reverse proxy setup that doesn't rewrite the location header correctly.
 *
 * <p>
 * Have the JavaScript make an AJAX call, to which we respond with 302 redirect. If the reverse proxy
 * is done correctly, this will be handled by web methods, but otherwise we'll report that as an error.
 * Unfortunately, {@code XmlHttpRequest} doesn't expose properties that allow the client-side JavaScript
 * to learn the details of the failure, so we have to make do with limited information.
 *
 * @author Kohsuke Kawaguchi
 */
@Extension @Symbol("reverseProxy")
public class ReverseProxySetupMonitor extends AdministrativeMonitor {

    private static final Logger LOGGER = Logger.getLogger(ReverseProxySetupMonitor.class.getName());

    @Override
    public boolean isActivated() {
        // return true to always inject an HTML fragment to perform a test
        return true;
    }

    public HttpResponse doTest() {
        String referer = Stapler.getCurrentRequest().getReferer();
        Jenkins j = Jenkins.getInstance();
        // May need to send an absolute URL, since handling of HttpRedirect with a relative URL does not currently honor X-Forwarded-Proto/Port at all.
        String redirect = j.getRootUrl() + "administrativeMonitor/" + id + "/testForReverseProxySetup/" + (referer != null ? Util.rawEncode(referer) : "NO-REFERER") + "/";
        LOGGER.log(Level.FINE, "coming from {0} and redirecting to {1}", new Object[] {referer, redirect});
        return new HttpRedirect(redirect);
    }

    @StaplerDispatchable
    public void getTestForReverseProxySetup(String rest) {
        Jenkins j = Jenkins.getInstance();
        String inferred = j.getRootUrlFromRequest() + "manage";
        // TODO this could also verify that j.getRootUrl() has been properly configured, and send a different message if not
        if (rest.startsWith(inferred)) { // not using equals due to JENKINS-24014
            throw HttpResponses.ok();
        } else {
            LOGGER.log(Level.WARNING, "{0} vs. {1}", new Object[] {inferred, rest});
            throw HttpResponses.errorWithoutStack(404, inferred + " vs. " + rest);
        }
    }

    /**
     * Depending on whether the user said "yes" or "no", send him to the right place.
     */
    @RequirePOST
    public HttpResponse doAct(@QueryParameter String no) throws IOException {
        if(no!=null) { // dismiss
            disable(true);
            // of course the irony is that this redirect won't work
            return HttpResponses.redirectViaContextPath("/manage");
        } else {
            return new HttpRedirect("https://wiki.jenkins-ci.org/display/JENKINS/Jenkins+says+my+reverse+proxy+setup+is+broken");
        }
    }

    @Override
    public String getDisplayName() {
        return Messages.ReverseProxySetupMonitor_DisplayName();
    }
}

