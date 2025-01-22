// CHECKSTYLE:OFF

package hudson.markup;

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
     * Key {@code EscapedMarkupFormatter.DisplayName}: {@code Plain text}.
     * 
     * @return
     *     {@code Plain text}
     */
    public static String EscapedMarkupFormatter_DisplayName() {
        return holder.format("EscapedMarkupFormatter.DisplayName");
    }

    /**
     * Key {@code EscapedMarkupFormatter.DisplayName}: {@code Plain text}.
     * 
     * @return
     *     {@code Plain text}
     */
    public static Localizable _EscapedMarkupFormatter_DisplayName() {
        return new Localizable(holder, "EscapedMarkupFormatter.DisplayName");
    }

}
