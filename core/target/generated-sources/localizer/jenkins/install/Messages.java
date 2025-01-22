// CHECKSTYLE:OFF

package jenkins.install;

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
     * Key {@code SetupWizard_ConfigureInstance_RootUrl_Empty}: {@code The
     * URL cannot be empty}.
     * 
     * @return
     *     {@code The URL cannot be empty}
     */
    public static String SetupWizard_ConfigureInstance_RootUrl_Empty() {
        return holder.format("SetupWizard_ConfigureInstance_RootUrl_Empty");
    }

    /**
     * Key {@code SetupWizard_ConfigureInstance_RootUrl_Empty}: {@code The
     * URL cannot be empty}.
     * 
     * @return
     *     {@code The URL cannot be empty}
     */
    public static Localizable _SetupWizard_ConfigureInstance_RootUrl_Empty() {
        return new Localizable(holder, "SetupWizard_ConfigureInstance_RootUrl_Empty");
    }

    /**
     * Key {@code SetupWizard_ConfigureInstance_RootUrl_Invalid}: {@code The
     * URL is invalid, please ensure you are using http:// or https:// with a
     * valid domain.}.
     * 
     * @return
     *     {@code The URL is invalid, please ensure you are using http:// or
     *     https:// with a valid domain.}
     */
    public static String SetupWizard_ConfigureInstance_RootUrl_Invalid() {
        return holder.format("SetupWizard_ConfigureInstance_RootUrl_Invalid");
    }

    /**
     * Key {@code SetupWizard_ConfigureInstance_RootUrl_Invalid}: {@code The
     * URL is invalid, please ensure you are using http:// or https:// with a
     * valid domain.}.
     * 
     * @return
     *     {@code The URL is invalid, please ensure you are using http:// or
     *     https:// with a valid domain.}
     */
    public static Localizable _SetupWizard_ConfigureInstance_RootUrl_Invalid() {
        return new Localizable(holder, "SetupWizard_ConfigureInstance_RootUrl_Invalid");
    }

    /**
     * Key {@code SetupWizard_ConfigureInstance_ValidationErrors}: {@code
     * Some settings are invalid. See the error messages for details.}.
     * 
     * @return
     *     {@code Some settings are invalid. See the error messages for details.}
     */
    public static String SetupWizard_ConfigureInstance_ValidationErrors() {
        return holder.format("SetupWizard_ConfigureInstance_ValidationErrors");
    }

    /**
     * Key {@code SetupWizard_ConfigureInstance_ValidationErrors}: {@code
     * Some settings are invalid. See the error messages for details.}.
     * 
     * @return
     *     {@code Some settings are invalid. See the error messages for details.}
     */
    public static Localizable _SetupWizard_ConfigureInstance_ValidationErrors() {
        return new Localizable(holder, "SetupWizard_ConfigureInstance_ValidationErrors");
    }

}
