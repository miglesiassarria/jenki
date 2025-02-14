// CHECKSTYLE:OFF

package hudson.widgets;

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
     * Key {@code BuildHistoryWidget.DisplayName}: {@code Build History}.
     * 
     * @return
     *     {@code Build History}
     */
    public static String BuildHistoryWidget_DisplayName() {
        return holder.format("BuildHistoryWidget.DisplayName");
    }

    /**
     * Key {@code BuildHistoryWidget.DisplayName}: {@code Build History}.
     * 
     * @return
     *     {@code Build History}
     */
    public static Localizable _BuildHistoryWidget_DisplayName() {
        return new Localizable(holder, "BuildHistoryWidget.DisplayName");
    }

}
