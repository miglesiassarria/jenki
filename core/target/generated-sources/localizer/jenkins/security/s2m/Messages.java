// CHECKSTYLE:OFF

package jenkins.security.s2m;

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
     * Key {@code AdminCallableMonitor.DisplayName}: {@code Rejected Agent →
     * Master Access Attempt}.
     * 
     * @return
     *     {@code Rejected Agent → Master Access Attempt}
     */
    public static String AdminCallableMonitor_DisplayName() {
        return holder.format("AdminCallableMonitor.DisplayName");
    }

    /**
     * Key {@code AdminCallableMonitor.DisplayName}: {@code Rejected Agent →
     * Master Access Attempt}.
     * 
     * @return
     *     {@code Rejected Agent → Master Access Attempt}
     */
    public static Localizable _AdminCallableMonitor_DisplayName() {
        return new Localizable(holder, "AdminCallableMonitor.DisplayName");
    }

    /**
     * Key {@code MasterKillSwitchWarning.DisplayName}: {@code Disabled Agent
     * → Master Access Control}.
     * 
     * @return
     *     {@code Disabled Agent → Master Access Control}
     */
    public static String MasterKillSwitchWarning_DisplayName() {
        return holder.format("MasterKillSwitchWarning.DisplayName");
    }

    /**
     * Key {@code MasterKillSwitchWarning.DisplayName}: {@code Disabled Agent
     * → Master Access Control}.
     * 
     * @return
     *     {@code Disabled Agent → Master Access Control}
     */
    public static Localizable _MasterKillSwitchWarning_DisplayName() {
        return new Localizable(holder, "MasterKillSwitchWarning.DisplayName");
    }

}
