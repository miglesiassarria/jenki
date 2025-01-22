// CHECKSTYLE:OFF

package jenkins.security.csrf;

import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;
import org.kohsuke.accmod.Restricted;


/**
 * Generated localization support class.
 * 
 */
@SuppressWarnings({
    "",
    "PMD",
    "all"
})
@Restricted(org.kohsuke.accmod.restrictions.NoExternalUse.class)
public class Messages {

    /**
     * The resource bundle reference
     * 
     */
    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(Messages.class);

    /**
     * Key {@code CSRFAdministrativeMonitor.displayName}: {@code CSRF
     * Protection Monitor}.
     * 
     * @return
     *     {@code CSRF Protection Monitor}
     */
    public static String CSRFAdministrativeMonitor_displayName() {
        return holder.format("CSRFAdministrativeMonitor.displayName");
    }

    /**
     * Key {@code CSRFAdministrativeMonitor.displayName}: {@code CSRF
     * Protection Monitor}.
     * 
     * @return
     *     {@code CSRF Protection Monitor}
     */
    public static Localizable _CSRFAdministrativeMonitor_displayName() {
        return new Localizable(holder, "CSRFAdministrativeMonitor.displayName");
    }

}
