// CHECKSTYLE:OFF

package hudson.model.queue;

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
     * Key {@code QueueSorter.installDefaultQueueSorter}: {@code Installing
     * default queue sorter}.
     * 
     * @return
     *     {@code Installing default queue sorter}
     */
    public static String QueueSorter_installDefaultQueueSorter() {
        return holder.format("QueueSorter.installDefaultQueueSorter");
    }

    /**
     * Key {@code QueueSorter.installDefaultQueueSorter}: {@code Installing
     * default queue sorter}.
     * 
     * @return
     *     {@code Installing default queue sorter}
     */
    public static Localizable _QueueSorter_installDefaultQueueSorter() {
        return new Localizable(holder, "QueueSorter.installDefaultQueueSorter");
    }

}
