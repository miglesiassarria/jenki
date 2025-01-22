// CHECKSTYLE:OFF

package hudson.cli;

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
     * Key {@code LoginCommand.FullDescription}: {@code Depending on the
     * security realm, you will need to pass something like:
     * --username USER
     * [ --password PASS | --password-file FILE ]
     * May not be supported in
     * some security realms, such as single-sign-on.
     * Pair with the logout
     * command.
     * The same options can be used on any other command, but unlike
     * other generic CLI options,
     * these come *after* the command
     * name.
     * Whether stored or not, this authentication mode will not let you
     * refer to (e.g.) jobs as arguments
     * if Jenkins denies anonymous users
     * Overall/Read and (e.g.) Job/Read.
     * *Deprecated* in favor of -auth.}.
     * 
     * @return
     *     {@code Depending on the security realm, you will need to pass
     *     something like:
     *     --username USER [ --password PASS | --password-file
     *     FILE ]
     *     May not be supported in some security realms, such as
     *     single-sign-on.
     *     Pair with the logout command.
     *     The same options can be
     *     used on any other command, but unlike other generic CLI options,
     *     these
     *     come *after* the command name.
     *     Whether stored or not, this
     *     authentication mode will not let you refer to (e.g.) jobs as
     *     arguments
     *     if Jenkins denies anonymous users Overall/Read and (e.g.)
     *     Job/Read.
     *     *Deprecated* in favor of -auth.}
     */
    public static String LoginCommand_FullDescription() {
        return holder.format("LoginCommand.FullDescription");
    }

    /**
     * Key {@code LoginCommand.FullDescription}: {@code Depending on the
     * security realm, you will need to pass something like:
     * --username USER
     * [ --password PASS | --password-file FILE ]
     * May not be supported in
     * some security realms, such as single-sign-on.
     * Pair with the logout
     * command.
     * The same options can be used on any other command, but unlike
     * other generic CLI options,
     * these come *after* the command
     * name.
     * Whether stored or not, this authentication mode will not let you
     * refer to (e.g.) jobs as arguments
     * if Jenkins denies anonymous users
     * Overall/Read and (e.g.) Job/Read.
     * *Deprecated* in favor of -auth.}.
     * 
     * @return
     *     {@code Depending on the security realm, you will need to pass
     *     something like:
     *     --username USER [ --password PASS | --password-file
     *     FILE ]
     *     May not be supported in some security realms, such as
     *     single-sign-on.
     *     Pair with the logout command.
     *     The same options can be
     *     used on any other command, but unlike other generic CLI options,
     *     these
     *     come *after* the command name.
     *     Whether stored or not, this
     *     authentication mode will not let you refer to (e.g.) jobs as
     *     arguments
     *     if Jenkins denies anonymous users Overall/Read and (e.g.)
     *     Job/Read.
     *     *Deprecated* in favor of -auth.}
     */
    public static Localizable _LoginCommand_FullDescription() {
        return new Localizable(holder, "LoginCommand.FullDescription");
    }

    /**
     * Key {@code CliProtocol2.displayName}: {@code Jenkins CLI Protocol/2
     * (transport encryption)}.
     * 
     * @return
     *     {@code Jenkins CLI Protocol/2 (transport encryption)}
     */
    public static String CliProtocol2_displayName() {
        return holder.format("CliProtocol2.displayName");
    }

    /**
     * Key {@code CliProtocol2.displayName}: {@code Jenkins CLI Protocol/2
     * (transport encryption)}.
     * 
     * @return
     *     {@code Jenkins CLI Protocol/2 (transport encryption)}
     */
    public static Localizable _CliProtocol2_displayName() {
        return new Localizable(holder, "CliProtocol2.displayName");
    }

    /**
     * Key {@code WaitNodeOnlineCommand.ShortDescription}: {@code Wait for a
     * node to become online.}.
     * 
     * @return
     *     {@code Wait for a node to become online.}
     */
    public static String WaitNodeOnlineCommand_ShortDescription() {
        return holder.format("WaitNodeOnlineCommand.ShortDescription");
    }

    /**
     * Key {@code WaitNodeOnlineCommand.ShortDescription}: {@code Wait for a
     * node to become online.}.
     * 
     * @return
     *     {@code Wait for a node to become online.}
     */
    public static Localizable _WaitNodeOnlineCommand_ShortDescription() {
        return new Localizable(holder, "WaitNodeOnlineCommand.ShortDescription");
    }

    /**
     * Key {@code InstallPluginCommand.InstallingFromUpdateCenter}: {@code
     * Installing {0} from update center}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Installing {0} from update center}
     */
    public static String InstallPluginCommand_InstallingFromUpdateCenter(Object arg0) {
        return holder.format("InstallPluginCommand.InstallingFromUpdateCenter", arg0);
    }

    /**
     * Key {@code InstallPluginCommand.InstallingFromUpdateCenter}: {@code
     * Installing {0} from update center}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Installing {0} from update center}
     */
    public static Localizable _InstallPluginCommand_InstallingFromUpdateCenter(Object arg0) {
        return new Localizable(holder, "InstallPluginCommand.InstallingFromUpdateCenter", arg0);
    }

    /**
     * Key {@code VersionCommand.ShortDescription}: {@code Outputs the
     * current version.}.
     * 
     * @return
     *     {@code Outputs the current version.}
     */
    public static String VersionCommand_ShortDescription() {
        return holder.format("VersionCommand.ShortDescription");
    }

    /**
     * Key {@code VersionCommand.ShortDescription}: {@code Outputs the
     * current version.}.
     * 
     * @return
     *     {@code Outputs the current version.}
     */
    public static Localizable _VersionCommand_ShortDescription() {
        return new Localizable(holder, "VersionCommand.ShortDescription");
    }

    /**
     * Key {@code BuildCommand.CLICause.ShortDescription}: {@code Started
     * from command line by {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Started from command line by {0}}
     */
    public static String BuildCommand_CLICause_ShortDescription(Object arg0) {
        return holder.format("BuildCommand.CLICause.ShortDescription", arg0);
    }

    /**
     * Key {@code BuildCommand.CLICause.ShortDescription}: {@code Started
     * from command line by {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Started from command line by {0}}
     */
    public static Localizable _BuildCommand_CLICause_ShortDescription(Object arg0) {
        return new Localizable(holder, "BuildCommand.CLICause.ShortDescription", arg0);
    }

    /**
     * Key {@code ListJobsCommand.ShortDescription}: {@code Lists all jobs in
     * a specific view or item group.}.
     * 
     * @return
     *     {@code Lists all jobs in a specific view or item group.}
     */
    public static String ListJobsCommand_ShortDescription() {
        return holder.format("ListJobsCommand.ShortDescription");
    }

    /**
     * Key {@code ListJobsCommand.ShortDescription}: {@code Lists all jobs in
     * a specific view or item group.}.
     * 
     * @return
     *     {@code Lists all jobs in a specific view or item group.}
     */
    public static Localizable _ListJobsCommand_ShortDescription() {
        return new Localizable(holder, "ListJobsCommand.ShortDescription");
    }

    /**
     * Key {@code CopyJobCommand.ShortDescription}: {@code Copies a job.}.
     * 
     * @return
     *     {@code Copies a job.}
     */
    public static String CopyJobCommand_ShortDescription() {
        return holder.format("CopyJobCommand.ShortDescription");
    }

    /**
     * Key {@code CopyJobCommand.ShortDescription}: {@code Copies a job.}.
     * 
     * @return
     *     {@code Copies a job.}
     */
    public static Localizable _CopyJobCommand_ShortDescription() {
        return new Localizable(holder, "CopyJobCommand.ShortDescription");
    }

    /**
     * Key {@code ReloadConfigurationCommand.ShortDescription}: {@code
     * Discard all the loaded data in memory and reload everything from file
     * system. Useful when you modified config files directly on disk.}.
     * 
     * @return
     *     {@code Discard all the loaded data in memory and reload everything
     *     from file system. Useful when you modified config files directly on
     *     disk.}
     */
    public static String ReloadConfigurationCommand_ShortDescription() {
        return holder.format("ReloadConfigurationCommand.ShortDescription");
    }

    /**
     * Key {@code ReloadConfigurationCommand.ShortDescription}: {@code
     * Discard all the loaded data in memory and reload everything from file
     * system. Useful when you modified config files directly on disk.}.
     * 
     * @return
     *     {@code Discard all the loaded data in memory and reload everything
     *     from file system. Useful when you modified config files directly on
     *     disk.}
     */
    public static Localizable _ReloadConfigurationCommand_ShortDescription() {
        return new Localizable(holder, "ReloadConfigurationCommand.ShortDescription");
    }

    /**
     * Key {@code OnlineNodeCommand.ShortDescription}: {@code Resume using a
     * node for performing builds, to cancel out the earlier "offline-node"
     * command.}.
     * 
     * @return
     *     {@code Resume using a node for performing builds, to cancel out the
     *     earlier "offline-node" command.}
     */
    public static String OnlineNodeCommand_ShortDescription() {
        return holder.format("OnlineNodeCommand.ShortDescription");
    }

    /**
     * Key {@code OnlineNodeCommand.ShortDescription}: {@code Resume using a
     * node for performing builds, to cancel out the earlier "offline-node"
     * command.}.
     * 
     * @return
     *     {@code Resume using a node for performing builds, to cancel out the
     *     earlier "offline-node" command.}
     */
    public static Localizable _OnlineNodeCommand_ShortDescription() {
        return new Localizable(holder, "OnlineNodeCommand.ShortDescription");
    }

    /**
     * Key {@code MailCommand.ShortDescription}: {@code Reads stdin and sends
     * that out as an e-mail.}.
     * 
     * @return
     *     {@code Reads stdin and sends that out as an e-mail.}
     */
    public static String MailCommand_ShortDescription() {
        return holder.format("MailCommand.ShortDescription");
    }

    /**
     * Key {@code MailCommand.ShortDescription}: {@code Reads stdin and sends
     * that out as an e-mail.}.
     * 
     * @return
     *     {@code Reads stdin and sends that out as an e-mail.}
     */
    public static Localizable _MailCommand_ShortDescription() {
        return new Localizable(holder, "MailCommand.ShortDescription");
    }

    /**
     * Key {@code EnablePluginCommand.MissingDependencies}: {@code Cannot
     * enable plugin {0} as it is missing the dependency {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot enable plugin {0} as it is missing the dependency {1}}
     */
    public static String EnablePluginCommand_MissingDependencies(Object arg0, Object arg1) {
        return holder.format("EnablePluginCommand.MissingDependencies", arg0, arg1);
    }

    /**
     * Key {@code EnablePluginCommand.MissingDependencies}: {@code Cannot
     * enable plugin {0} as it is missing the dependency {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot enable plugin {0} as it is missing the dependency {1}}
     */
    public static Localizable _EnablePluginCommand_MissingDependencies(Object arg0, Object arg1) {
        return new Localizable(holder, "EnablePluginCommand.MissingDependencies", arg0, arg1);
    }

    /**
     * Key {@code SetBuildDescriptionCommand.ShortDescription}: {@code Sets
     * the description of a build.}.
     * 
     * @return
     *     {@code Sets the description of a build.}
     */
    public static String SetBuildDescriptionCommand_ShortDescription() {
        return holder.format("SetBuildDescriptionCommand.ShortDescription");
    }

    /**
     * Key {@code SetBuildDescriptionCommand.ShortDescription}: {@code Sets
     * the description of a build.}.
     * 
     * @return
     *     {@code Sets the description of a build.}
     */
    public static Localizable _SetBuildDescriptionCommand_ShortDescription() {
        return new Localizable(holder, "SetBuildDescriptionCommand.ShortDescription");
    }

    /**
     * Key {@code QuietDownCommand.ShortDescription}: {@code Quiet down
     * Jenkins, in preparation for a restart. Don’t start any builds.}.
     * 
     * @return
     *     {@code Quiet down Jenkins, in preparation for a restart. Don’t start
     *     any builds.}
     */
    public static String QuietDownCommand_ShortDescription() {
        return holder.format("QuietDownCommand.ShortDescription");
    }

    /**
     * Key {@code QuietDownCommand.ShortDescription}: {@code Quiet down
     * Jenkins, in preparation for a restart. Don’t start any builds.}.
     * 
     * @return
     *     {@code Quiet down Jenkins, in preparation for a restart. Don’t start
     *     any builds.}
     */
    public static Localizable _QuietDownCommand_ShortDescription() {
        return new Localizable(holder, "QuietDownCommand.ShortDescription");
    }

    /**
     * Key {@code ListPluginsCommand.ShortDescription}: {@code Outputs a list
     * of installed plugins.}.
     * 
     * @return
     *     {@code Outputs a list of installed plugins.}
     */
    public static String ListPluginsCommand_ShortDescription() {
        return holder.format("ListPluginsCommand.ShortDescription");
    }

    /**
     * Key {@code ListPluginsCommand.ShortDescription}: {@code Outputs a list
     * of installed plugins.}.
     * 
     * @return
     *     {@code Outputs a list of installed plugins.}
     */
    public static Localizable _ListPluginsCommand_ShortDescription() {
        return new Localizable(holder, "ListPluginsCommand.ShortDescription");
    }

    /**
     * Key {@code DisconnectNodeCommand.ShortDescription}: {@code Disconnects
     * from a node.}.
     * 
     * @return
     *     {@code Disconnects from a node.}
     */
    public static String DisconnectNodeCommand_ShortDescription() {
        return holder.format("DisconnectNodeCommand.ShortDescription");
    }

    /**
     * Key {@code DisconnectNodeCommand.ShortDescription}: {@code Disconnects
     * from a node.}.
     * 
     * @return
     *     {@code Disconnects from a node.}
     */
    public static Localizable _DisconnectNodeCommand_ShortDescription() {
        return new Localizable(holder, "DisconnectNodeCommand.ShortDescription");
    }

    /**
     * Key {@code OfflineNodeCommand.ShortDescription}: {@code Stop using a
     * node for performing builds temporarily, until the next "online-node"
     * command.}.
     * 
     * @return
     *     {@code Stop using a node for performing builds temporarily, until the
     *     next "online-node" command.}
     */
    public static String OfflineNodeCommand_ShortDescription() {
        return holder.format("OfflineNodeCommand.ShortDescription");
    }

    /**
     * Key {@code OfflineNodeCommand.ShortDescription}: {@code Stop using a
     * node for performing builds temporarily, until the next "online-node"
     * command.}.
     * 
     * @return
     *     {@code Stop using a node for performing builds temporarily, until the
     *     next "online-node" command.}
     */
    public static Localizable _OfflineNodeCommand_ShortDescription() {
        return new Localizable(holder, "OfflineNodeCommand.ShortDescription");
    }

    /**
     * Key {@code BuildCommand.CLICause.CannotBuildDisabled}: {@code Cannot
     * build {0} because it is disabled.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot build {0} because it is disabled.}
     */
    public static String BuildCommand_CLICause_CannotBuildDisabled(Object arg0) {
        return holder.format("BuildCommand.CLICause.CannotBuildDisabled", arg0);
    }

    /**
     * Key {@code BuildCommand.CLICause.CannotBuildDisabled}: {@code Cannot
     * build {0} because it is disabled.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot build {0} because it is disabled.}
     */
    public static Localizable _BuildCommand_CLICause_CannotBuildDisabled(Object arg0) {
        return new Localizable(holder, "BuildCommand.CLICause.CannotBuildDisabled", arg0);
    }

    /**
     * Key {@code WaitNodeOfflineCommand.ShortDescription}: {@code Wait for a
     * node to become offline.}.
     * 
     * @return
     *     {@code Wait for a node to become offline.}
     */
    public static String WaitNodeOfflineCommand_ShortDescription() {
        return holder.format("WaitNodeOfflineCommand.ShortDescription");
    }

    /**
     * Key {@code WaitNodeOfflineCommand.ShortDescription}: {@code Wait for a
     * node to become offline.}.
     * 
     * @return
     *     {@code Wait for a node to become offline.}
     */
    public static Localizable _WaitNodeOfflineCommand_ShortDescription() {
        return new Localizable(holder, "WaitNodeOfflineCommand.ShortDescription");
    }

    /**
     * Key {@code InstallPluginCommand.InstallingPluginFromStdin}: {@code
     * Installing a plugin from standard input}.
     * 
     * @return
     *     {@code Installing a plugin from standard input}
     */
    public static String InstallPluginCommand_InstallingPluginFromStdin() {
        return holder.format("InstallPluginCommand.InstallingPluginFromStdin");
    }

    /**
     * Key {@code InstallPluginCommand.InstallingPluginFromStdin}: {@code
     * Installing a plugin from standard input}.
     * 
     * @return
     *     {@code Installing a plugin from standard input}
     */
    public static Localizable _InstallPluginCommand_InstallingPluginFromStdin() {
        return new Localizable(holder, "InstallPluginCommand.InstallingPluginFromStdin");
    }

    /**
     * Key {@code InstallPluginCommand.ShortDescription}: {@code Installs a
     * plugin either from a file, an URL, or from update center. }.
     * 
     * @return
     *     {@code Installs a plugin either from a file, an URL, or from update
     *     center. }
     */
    public static String InstallPluginCommand_ShortDescription() {
        return holder.format("InstallPluginCommand.ShortDescription");
    }

    /**
     * Key {@code InstallPluginCommand.ShortDescription}: {@code Installs a
     * plugin either from a file, an URL, or from update center. }.
     * 
     * @return
     *     {@code Installs a plugin either from a file, an URL, or from update
     *     center. }
     */
    public static Localizable _InstallPluginCommand_ShortDescription() {
        return new Localizable(holder, "InstallPluginCommand.ShortDescription");
    }

    /**
     * Key {@code AddJobToViewCommand.ShortDescription}: {@code Adds jobs to
     * view.}.
     * 
     * @return
     *     {@code Adds jobs to view.}
     */
    public static String AddJobToViewCommand_ShortDescription() {
        return holder.format("AddJobToViewCommand.ShortDescription");
    }

    /**
     * Key {@code AddJobToViewCommand.ShortDescription}: {@code Adds jobs to
     * view.}.
     * 
     * @return
     *     {@code Adds jobs to view.}
     */
    public static Localizable _AddJobToViewCommand_ShortDescription() {
        return new Localizable(holder, "AddJobToViewCommand.ShortDescription");
    }

    /**
     * Key {@code DeleteNodeCommand.ShortDescription}: {@code Deletes
     * node(s)}.
     * 
     * @return
     *     {@code Deletes node(s)}
     */
    public static String DeleteNodeCommand_ShortDescription() {
        return holder.format("DeleteNodeCommand.ShortDescription");
    }

    /**
     * Key {@code DeleteNodeCommand.ShortDescription}: {@code Deletes
     * node(s)}.
     * 
     * @return
     *     {@code Deletes node(s)}
     */
    public static Localizable _DeleteNodeCommand_ShortDescription() {
        return new Localizable(holder, "DeleteNodeCommand.ShortDescription");
    }

    /**
     * Key {@code BuildCommand.ShortDescription}: {@code Builds a job, and
     * optionally waits until its completion.}.
     * 
     * @return
     *     {@code Builds a job, and optionally waits until its completion.}
     */
    public static String BuildCommand_ShortDescription() {
        return holder.format("BuildCommand.ShortDescription");
    }

    /**
     * Key {@code BuildCommand.ShortDescription}: {@code Builds a job, and
     * optionally waits until its completion.}.
     * 
     * @return
     *     {@code Builds a job, and optionally waits until its completion.}
     */
    public static Localizable _BuildCommand_ShortDescription() {
        return new Localizable(holder, "BuildCommand.ShortDescription");
    }

    /**
     * Key {@code DeleteViewCommand.ShortDescription}: {@code Deletes
     * view(s).}.
     * 
     * @return
     *     {@code Deletes view(s).}
     */
    public static String DeleteViewCommand_ShortDescription() {
        return holder.format("DeleteViewCommand.ShortDescription");
    }

    /**
     * Key {@code DeleteViewCommand.ShortDescription}: {@code Deletes
     * view(s).}.
     * 
     * @return
     *     {@code Deletes view(s).}
     */
    public static Localizable _DeleteViewCommand_ShortDescription() {
        return new Localizable(holder, "DeleteViewCommand.ShortDescription");
    }

    /**
     * Key {@code InstallPluginCommand.DidYouMean}: {@code {0} looks like a
     * short plugin name. Did you mean ‘{1}’?}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} looks like a short plugin name. Did you mean ‘{1}’?}
     */
    public static String InstallPluginCommand_DidYouMean(Object arg0, Object arg1) {
        return holder.format("InstallPluginCommand.DidYouMean", arg0, arg1);
    }

    /**
     * Key {@code InstallPluginCommand.DidYouMean}: {@code {0} looks like a
     * short plugin name. Did you mean ‘{1}’?}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} looks like a short plugin name. Did you mean ‘{1}’?}
     */
    public static Localizable _InstallPluginCommand_DidYouMean(Object arg0, Object arg1) {
        return new Localizable(holder, "InstallPluginCommand.DidYouMean", arg0, arg1);
    }

    /**
     * Key {@code InstallPluginCommand.InstallingPluginFromLocalFile}: {@code
     * Installing a plugin from local file: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Installing a plugin from local file: {0}}
     */
    public static String InstallPluginCommand_InstallingPluginFromLocalFile(Object arg0) {
        return holder.format("InstallPluginCommand.InstallingPluginFromLocalFile", arg0);
    }

    /**
     * Key {@code InstallPluginCommand.InstallingPluginFromLocalFile}: {@code
     * Installing a plugin from local file: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Installing a plugin from local file: {0}}
     */
    public static Localizable _InstallPluginCommand_InstallingPluginFromLocalFile(Object arg0) {
        return new Localizable(holder, "InstallPluginCommand.InstallingPluginFromLocalFile", arg0);
    }

    /**
     * Key {@code SetBuildDisplayNameCommand.ShortDescription}: {@code Sets
     * the displayName of a build.}.
     * 
     * @return
     *     {@code Sets the displayName of a build.}
     */
    public static String SetBuildDisplayNameCommand_ShortDescription() {
        return holder.format("SetBuildDisplayNameCommand.ShortDescription");
    }

    /**
     * Key {@code SetBuildDisplayNameCommand.ShortDescription}: {@code Sets
     * the displayName of a build.}.
     * 
     * @return
     *     {@code Sets the displayName of a build.}
     */
    public static Localizable _SetBuildDisplayNameCommand_ShortDescription() {
        return new Localizable(holder, "SetBuildDisplayNameCommand.ShortDescription");
    }

    /**
     * Key {@code WhoAmICommand.ShortDescription}: {@code Reports your
     * credential and permissions.}.
     * 
     * @return
     *     {@code Reports your credential and permissions.}
     */
    public static String WhoAmICommand_ShortDescription() {
        return holder.format("WhoAmICommand.ShortDescription");
    }

    /**
     * Key {@code WhoAmICommand.ShortDescription}: {@code Reports your
     * credential and permissions.}.
     * 
     * @return
     *     {@code Reports your credential and permissions.}
     */
    public static Localizable _WhoAmICommand_ShortDescription() {
        return new Localizable(holder, "WhoAmICommand.ShortDescription");
    }

    /**
     * Key {@code GroovyCommand.ShortDescription}: {@code Executes the
     * specified Groovy script. }.
     * 
     * @return
     *     {@code Executes the specified Groovy script. }
     */
    public static String GroovyCommand_ShortDescription() {
        return holder.format("GroovyCommand.ShortDescription");
    }

    /**
     * Key {@code GroovyCommand.ShortDescription}: {@code Executes the
     * specified Groovy script. }.
     * 
     * @return
     *     {@code Executes the specified Groovy script. }
     */
    public static Localizable _GroovyCommand_ShortDescription() {
        return new Localizable(holder, "GroovyCommand.ShortDescription");
    }

    /**
     * Key {@code DeleteJobCommand.ShortDescription}: {@code Deletes
     * job(s).}.
     * 
     * @return
     *     {@code Deletes job(s).}
     */
    public static String DeleteJobCommand_ShortDescription() {
        return holder.format("DeleteJobCommand.ShortDescription");
    }

    /**
     * Key {@code DeleteJobCommand.ShortDescription}: {@code Deletes
     * job(s).}.
     * 
     * @return
     *     {@code Deletes job(s).}
     */
    public static Localizable _DeleteJobCommand_ShortDescription() {
        return new Localizable(holder, "DeleteJobCommand.ShortDescription");
    }

    /**
     * Key {@code CliProtocol.displayName}: {@code Jenkins CLI Protocol/1
     * (unencrypted)}.
     * 
     * @return
     *     {@code Jenkins CLI Protocol/1 (unencrypted)}
     */
    public static String CliProtocol_displayName() {
        return holder.format("CliProtocol.displayName");
    }

    /**
     * Key {@code CliProtocol.displayName}: {@code Jenkins CLI Protocol/1
     * (unencrypted)}.
     * 
     * @return
     *     {@code Jenkins CLI Protocol/1 (unencrypted)}
     */
    public static Localizable _CliProtocol_displayName() {
        return new Localizable(holder, "CliProtocol.displayName");
    }

    /**
     * Key {@code RemoveJobFromViewCommand.ShortDescription}: {@code Removes
     * jobs from view.}.
     * 
     * @return
     *     {@code Removes jobs from view.}
     */
    public static String RemoveJobFromViewCommand_ShortDescription() {
        return holder.format("RemoveJobFromViewCommand.ShortDescription");
    }

    /**
     * Key {@code RemoveJobFromViewCommand.ShortDescription}: {@code Removes
     * jobs from view.}.
     * 
     * @return
     *     {@code Removes jobs from view.}
     */
    public static Localizable _RemoveJobFromViewCommand_ShortDescription() {
        return new Localizable(holder, "RemoveJobFromViewCommand.ShortDescription");
    }

    /**
     * Key {@code SetBuildResultCommand.ShortDescription}: {@code Sets the
     * result of the current build. Works only if invoked from within a
     * build. [deprecated]}.
     * 
     * @return
     *     {@code Sets the result of the current build. Works only if invoked
     *     from within a build. [deprecated]}
     */
    public static String SetBuildResultCommand_ShortDescription() {
        return holder.format("SetBuildResultCommand.ShortDescription");
    }

    /**
     * Key {@code SetBuildResultCommand.ShortDescription}: {@code Sets the
     * result of the current build. Works only if invoked from within a
     * build. [deprecated]}.
     * 
     * @return
     *     {@code Sets the result of the current build. Works only if invoked
     *     from within a build. [deprecated]}
     */
    public static Localizable _SetBuildResultCommand_ShortDescription() {
        return new Localizable(holder, "SetBuildResultCommand.ShortDescription");
    }

    /**
     * Key {@code SessionIdCommand.ShortDescription}: {@code Outputs the
     * session ID, which changes every time Jenkins restarts.}.
     * 
     * @return
     *     {@code Outputs the session ID, which changes every time Jenkins
     *     restarts.}
     */
    public static String SessionIdCommand_ShortDescription() {
        return holder.format("SessionIdCommand.ShortDescription");
    }

    /**
     * Key {@code SessionIdCommand.ShortDescription}: {@code Outputs the
     * session ID, which changes every time Jenkins restarts.}.
     * 
     * @return
     *     {@code Outputs the session ID, which changes every time Jenkins
     *     restarts.}
     */
    public static Localizable _SessionIdCommand_ShortDescription() {
        return new Localizable(holder, "SessionIdCommand.ShortDescription");
    }

    /**
     * Key {@code ConnectNodeCommand.ShortDescription}: {@code Reconnect to a
     * node(s)}.
     * 
     * @return
     *     {@code Reconnect to a node(s)}
     */
    public static String ConnectNodeCommand_ShortDescription() {
        return holder.format("ConnectNodeCommand.ShortDescription");
    }

    /**
     * Key {@code ConnectNodeCommand.ShortDescription}: {@code Reconnect to a
     * node(s)}.
     * 
     * @return
     *     {@code Reconnect to a node(s)}
     */
    public static Localizable _ConnectNodeCommand_ShortDescription() {
        return new Localizable(holder, "ConnectNodeCommand.ShortDescription");
    }

    /**
     * Key {@code InstallPluginCommand.NotAValidSourceName}: {@code {0} is
     * neither a valid file, URL, nor a plugin artifact name in the update
     * center}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is neither a valid file, URL, nor a plugin artifact name in
     *     the update center}
     */
    public static String InstallPluginCommand_NotAValidSourceName(Object arg0) {
        return holder.format("InstallPluginCommand.NotAValidSourceName", arg0);
    }

    /**
     * Key {@code InstallPluginCommand.NotAValidSourceName}: {@code {0} is
     * neither a valid file, URL, nor a plugin artifact name in the update
     * center}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is neither a valid file, URL, nor a plugin artifact name in
     *     the update center}
     */
    public static Localizable _InstallPluginCommand_NotAValidSourceName(Object arg0) {
        return new Localizable(holder, "InstallPluginCommand.NotAValidSourceName", arg0);
    }

    /**
     * Key {@code GetJobCommand.ShortDescription}: {@code Dumps the job
     * definition XML to stdout.}.
     * 
     * @return
     *     {@code Dumps the job definition XML to stdout.}
     */
    public static String GetJobCommand_ShortDescription() {
        return holder.format("GetJobCommand.ShortDescription");
    }

    /**
     * Key {@code GetJobCommand.ShortDescription}: {@code Dumps the job
     * definition XML to stdout.}.
     * 
     * @return
     *     {@code Dumps the job definition XML to stdout.}
     */
    public static Localizable _GetJobCommand_ShortDescription() {
        return new Localizable(holder, "GetJobCommand.ShortDescription");
    }

    /**
     * Key {@code LoginCommand.ShortDescription}: {@code Saves the current
     * credentials to allow future commands to run without explicit
     * credential information. [deprecated]}.
     * 
     * @return
     *     {@code Saves the current credentials to allow future commands to run
     *     without explicit credential information. [deprecated]}
     */
    public static String LoginCommand_ShortDescription() {
        return holder.format("LoginCommand.ShortDescription");
    }

    /**
     * Key {@code LoginCommand.ShortDescription}: {@code Saves the current
     * credentials to allow future commands to run without explicit
     * credential information. [deprecated]}.
     * 
     * @return
     *     {@code Saves the current credentials to allow future commands to run
     *     without explicit credential information. [deprecated]}
     */
    public static Localizable _LoginCommand_ShortDescription() {
        return new Localizable(holder, "LoginCommand.ShortDescription");
    }

    /**
     * Key {@code LogoutCommand.FullDescription}: {@code *Deprecated* in
     * favor of -auth.}.
     * 
     * @return
     *     {@code *Deprecated* in favor of -auth.}
     */
    public static String LogoutCommand_FullDescription() {
        return holder.format("LogoutCommand.FullDescription");
    }

    /**
     * Key {@code LogoutCommand.FullDescription}: {@code *Deprecated* in
     * favor of -auth.}.
     * 
     * @return
     *     {@code *Deprecated* in favor of -auth.}
     */
    public static Localizable _LogoutCommand_FullDescription() {
        return new Localizable(holder, "LogoutCommand.FullDescription");
    }

    /**
     * Key {@code EnablePluginCommand.ShortDescription}: {@code Enables one
     * or more installed plugins transitively.}.
     * 
     * @return
     *     {@code Enables one or more installed plugins transitively.}
     */
    public static String EnablePluginCommand_ShortDescription() {
        return holder.format("EnablePluginCommand.ShortDescription");
    }

    /**
     * Key {@code EnablePluginCommand.ShortDescription}: {@code Enables one
     * or more installed plugins transitively.}.
     * 
     * @return
     *     {@code Enables one or more installed plugins transitively.}
     */
    public static Localizable _EnablePluginCommand_ShortDescription() {
        return new Localizable(holder, "EnablePluginCommand.ShortDescription");
    }

    /**
     * Key {@code CreateNodeCommand.ShortDescription}: {@code Creates a new
     * node by reading stdin as a XML configuration.}.
     * 
     * @return
     *     {@code Creates a new node by reading stdin as a XML configuration.}
     */
    public static String CreateNodeCommand_ShortDescription() {
        return holder.format("CreateNodeCommand.ShortDescription");
    }

    /**
     * Key {@code CreateNodeCommand.ShortDescription}: {@code Creates a new
     * node by reading stdin as a XML configuration.}.
     * 
     * @return
     *     {@code Creates a new node by reading stdin as a XML configuration.}
     */
    public static Localizable _CreateNodeCommand_ShortDescription() {
        return new Localizable(holder, "CreateNodeCommand.ShortDescription");
    }

    /**
     * Key {@code InstallPluginCommand.NoUpdateDataRetrieved}: {@code No
     * update center data is retrieved yet from: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No update center data is retrieved yet from: {0}}
     */
    public static String InstallPluginCommand_NoUpdateDataRetrieved(Object arg0) {
        return holder.format("InstallPluginCommand.NoUpdateDataRetrieved", arg0);
    }

    /**
     * Key {@code InstallPluginCommand.NoUpdateDataRetrieved}: {@code No
     * update center data is retrieved yet from: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No update center data is retrieved yet from: {0}}
     */
    public static Localizable _InstallPluginCommand_NoUpdateDataRetrieved(Object arg0) {
        return new Localizable(holder, "InstallPluginCommand.NoUpdateDataRetrieved", arg0);
    }

    /**
     * Key {@code BuildCommand.CLICause.CannotBuildUnknownReasons}: {@code
     * Cannot build {0} for unknown reasons.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot build {0} for unknown reasons.}
     */
    public static String BuildCommand_CLICause_CannotBuildUnknownReasons(Object arg0) {
        return holder.format("BuildCommand.CLICause.CannotBuildUnknownReasons", arg0);
    }

    /**
     * Key {@code BuildCommand.CLICause.CannotBuildUnknownReasons}: {@code
     * Cannot build {0} for unknown reasons.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot build {0} for unknown reasons.}
     */
    public static Localizable _BuildCommand_CLICause_CannotBuildUnknownReasons(Object arg0) {
        return new Localizable(holder, "BuildCommand.CLICause.CannotBuildUnknownReasons", arg0);
    }

    /**
     * Key {@code CreateViewCommand.ShortDescription}: {@code Creates a new
     * view by reading stdin as a XML configuration.}.
     * 
     * @return
     *     {@code Creates a new view by reading stdin as a XML configuration.}
     */
    public static String CreateViewCommand_ShortDescription() {
        return holder.format("CreateViewCommand.ShortDescription");
    }

    /**
     * Key {@code CreateViewCommand.ShortDescription}: {@code Creates a new
     * view by reading stdin as a XML configuration.}.
     * 
     * @return
     *     {@code Creates a new view by reading stdin as a XML configuration.}
     */
    public static Localizable _CreateViewCommand_ShortDescription() {
        return new Localizable(holder, "CreateViewCommand.ShortDescription");
    }

    /**
     * Key {@code InstallPluginCommand.InstallingPluginFromUrl}: {@code
     * Installing a plugin from {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Installing a plugin from {0}}
     */
    public static String InstallPluginCommand_InstallingPluginFromUrl(Object arg0) {
        return holder.format("InstallPluginCommand.InstallingPluginFromUrl", arg0);
    }

    /**
     * Key {@code InstallPluginCommand.InstallingPluginFromUrl}: {@code
     * Installing a plugin from {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Installing a plugin from {0}}
     */
    public static Localizable _InstallPluginCommand_InstallingPluginFromUrl(Object arg0) {
        return new Localizable(holder, "InstallPluginCommand.InstallingPluginFromUrl", arg0);
    }

    /**
     * Key {@code InstallPluginCommand.NoUpdateCenterDefined}: {@code Note
     * that no update center is defined in this Jenkins.}.
     * 
     * @return
     *     {@code Note that no update center is defined in this Jenkins.}
     */
    public static String InstallPluginCommand_NoUpdateCenterDefined() {
        return holder.format("InstallPluginCommand.NoUpdateCenterDefined");
    }

    /**
     * Key {@code InstallPluginCommand.NoUpdateCenterDefined}: {@code Note
     * that no update center is defined in this Jenkins.}.
     * 
     * @return
     *     {@code Note that no update center is defined in this Jenkins.}
     */
    public static Localizable _InstallPluginCommand_NoUpdateCenterDefined() {
        return new Localizable(holder, "InstallPluginCommand.NoUpdateCenterDefined");
    }

    /**
     * Key {@code ConsoleCommand.ShortDescription}: {@code Retrieves console
     * output of a build.}.
     * 
     * @return
     *     {@code Retrieves console output of a build.}
     */
    public static String ConsoleCommand_ShortDescription() {
        return holder.format("ConsoleCommand.ShortDescription");
    }

    /**
     * Key {@code ConsoleCommand.ShortDescription}: {@code Retrieves console
     * output of a build.}.
     * 
     * @return
     *     {@code Retrieves console output of a build.}
     */
    public static Localizable _ConsoleCommand_ShortDescription() {
        return new Localizable(holder, "ConsoleCommand.ShortDescription");
    }

    /**
     * Key {@code GroovyshCommand.ShortDescription}: {@code Runs an
     * interactive groovy shell.}.
     * 
     * @return
     *     {@code Runs an interactive groovy shell.}
     */
    public static String GroovyshCommand_ShortDescription() {
        return holder.format("GroovyshCommand.ShortDescription");
    }

    /**
     * Key {@code GroovyshCommand.ShortDescription}: {@code Runs an
     * interactive groovy shell.}.
     * 
     * @return
     *     {@code Runs an interactive groovy shell.}
     */
    public static Localizable _GroovyshCommand_ShortDescription() {
        return new Localizable(holder, "GroovyshCommand.ShortDescription");
    }

    /**
     * Key {@code SetBuildParameterCommand.ShortDescription}: {@code
     * Update/set the build parameter of the current build in progress.
     * [deprecated]}.
     * 
     * @return
     *     {@code Update/set the build parameter of the current build in
     *     progress. [deprecated]}
     */
    public static String SetBuildParameterCommand_ShortDescription() {
        return holder.format("SetBuildParameterCommand.ShortDescription");
    }

    /**
     * Key {@code SetBuildParameterCommand.ShortDescription}: {@code
     * Update/set the build parameter of the current build in progress.
     * [deprecated]}.
     * 
     * @return
     *     {@code Update/set the build parameter of the current build in
     *     progress. [deprecated]}
     */
    public static Localizable _SetBuildParameterCommand_ShortDescription() {
        return new Localizable(holder, "SetBuildParameterCommand.ShortDescription");
    }

    /**
     * Key {@code UpdateViewCommand.ShortDescription}: {@code Updates the
     * view definition XML from stdin. The opposite of the get-view
     * command.}.
     * 
     * @return
     *     {@code Updates the view definition XML from stdin. The opposite of the
     *     get-view command.}
     */
    public static String UpdateViewCommand_ShortDescription() {
        return holder.format("UpdateViewCommand.ShortDescription");
    }

    /**
     * Key {@code UpdateViewCommand.ShortDescription}: {@code Updates the
     * view definition XML from stdin. The opposite of the get-view
     * command.}.
     * 
     * @return
     *     {@code Updates the view definition XML from stdin. The opposite of the
     *     get-view command.}
     */
    public static Localizable _UpdateViewCommand_ShortDescription() {
        return new Localizable(holder, "UpdateViewCommand.ShortDescription");
    }

    /**
     * Key {@code HelpCommand.ShortDescription}: {@code Lists all the
     * available commands or a detailed description of single command.}.
     * 
     * @return
     *     {@code Lists all the available commands or a detailed description of
     *     single command.}
     */
    public static String HelpCommand_ShortDescription() {
        return holder.format("HelpCommand.ShortDescription");
    }

    /**
     * Key {@code HelpCommand.ShortDescription}: {@code Lists all the
     * available commands or a detailed description of single command.}.
     * 
     * @return
     *     {@code Lists all the available commands or a detailed description of
     *     single command.}
     */
    public static Localizable _HelpCommand_ShortDescription() {
        return new Localizable(holder, "HelpCommand.ShortDescription");
    }

    /**
     * Key {@code ClearQueueCommand.ShortDescription}: {@code Clears the
     * build queue.}.
     * 
     * @return
     *     {@code Clears the build queue.}
     */
    public static String ClearQueueCommand_ShortDescription() {
        return holder.format("ClearQueueCommand.ShortDescription");
    }

    /**
     * Key {@code ClearQueueCommand.ShortDescription}: {@code Clears the
     * build queue.}.
     * 
     * @return
     *     {@code Clears the build queue.}
     */
    public static Localizable _ClearQueueCommand_ShortDescription() {
        return new Localizable(holder, "ClearQueueCommand.ShortDescription");
    }

    /**
     * Key {@code UpdateNodeCommand.ShortDescription}: {@code Updates the
     * node definition XML from stdin. The opposite of the get-node
     * command.}.
     * 
     * @return
     *     {@code Updates the node definition XML from stdin. The opposite of the
     *     get-node command.}
     */
    public static String UpdateNodeCommand_ShortDescription() {
        return holder.format("UpdateNodeCommand.ShortDescription");
    }

    /**
     * Key {@code UpdateNodeCommand.ShortDescription}: {@code Updates the
     * node definition XML from stdin. The opposite of the get-node
     * command.}.
     * 
     * @return
     *     {@code Updates the node definition XML from stdin. The opposite of the
     *     get-node command.}
     */
    public static Localizable _UpdateNodeCommand_ShortDescription() {
        return new Localizable(holder, "UpdateNodeCommand.ShortDescription");
    }

    /**
     * Key {@code CancelQuietDownCommand.ShortDescription}: {@code Cancel the
     * effect of the "quiet-down" command.}.
     * 
     * @return
     *     {@code Cancel the effect of the "quiet-down" command.}
     */
    public static String CancelQuietDownCommand_ShortDescription() {
        return holder.format("CancelQuietDownCommand.ShortDescription");
    }

    /**
     * Key {@code CancelQuietDownCommand.ShortDescription}: {@code Cancel the
     * effect of the "quiet-down" command.}.
     * 
     * @return
     *     {@code Cancel the effect of the "quiet-down" command.}
     */
    public static Localizable _CancelQuietDownCommand_ShortDescription() {
        return new Localizable(holder, "CancelQuietDownCommand.ShortDescription");
    }

    /**
     * Key {@code UpdateJobCommand.ShortDescription}: {@code Updates the job
     * definition XML from stdin. The opposite of the get-job command.}.
     * 
     * @return
     *     {@code Updates the job definition XML from stdin. The opposite of the
     *     get-job command.}
     */
    public static String UpdateJobCommand_ShortDescription() {
        return holder.format("UpdateJobCommand.ShortDescription");
    }

    /**
     * Key {@code UpdateJobCommand.ShortDescription}: {@code Updates the job
     * definition XML from stdin. The opposite of the get-job command.}.
     * 
     * @return
     *     {@code Updates the job definition XML from stdin. The opposite of the
     *     get-job command.}
     */
    public static Localizable _UpdateJobCommand_ShortDescription() {
        return new Localizable(holder, "UpdateJobCommand.ShortDescription");
    }

    /**
     * Key {@code EnablePluginCommand.NoSuchPlugin}: {@code No such plugin
     * found with the name {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such plugin found with the name {0}}
     */
    public static String EnablePluginCommand_NoSuchPlugin(Object arg0) {
        return holder.format("EnablePluginCommand.NoSuchPlugin", arg0);
    }

    /**
     * Key {@code EnablePluginCommand.NoSuchPlugin}: {@code No such plugin
     * found with the name {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such plugin found with the name {0}}
     */
    public static Localizable _EnablePluginCommand_NoSuchPlugin(Object arg0) {
        return new Localizable(holder, "EnablePluginCommand.NoSuchPlugin", arg0);
    }

    /**
     * Key {@code BuildCommand.CLICause.CannotBuildConfigNotSaved}: {@code
     * Cannot build {0} because its configuration has not been saved.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot build {0} because its configuration has not been saved.}
     */
    public static String BuildCommand_CLICause_CannotBuildConfigNotSaved(Object arg0) {
        return holder.format("BuildCommand.CLICause.CannotBuildConfigNotSaved", arg0);
    }

    /**
     * Key {@code BuildCommand.CLICause.CannotBuildConfigNotSaved}: {@code
     * Cannot build {0} because its configuration has not been saved.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot build {0} because its configuration has not been saved.}
     */
    public static Localizable _BuildCommand_CLICause_CannotBuildConfigNotSaved(Object arg0) {
        return new Localizable(holder, "BuildCommand.CLICause.CannotBuildConfigNotSaved", arg0);
    }

    /**
     * Key {@code ReloadJobCommand.ShortDescription}: {@code Reload job(s)}.
     * 
     * @return
     *     {@code Reload job(s)}
     */
    public static String ReloadJobCommand_ShortDescription() {
        return holder.format("ReloadJobCommand.ShortDescription");
    }

    /**
     * Key {@code ReloadJobCommand.ShortDescription}: {@code Reload job(s)}.
     * 
     * @return
     *     {@code Reload job(s)}
     */
    public static Localizable _ReloadJobCommand_ShortDescription() {
        return new Localizable(holder, "ReloadJobCommand.ShortDescription");
    }

    /**
     * Key {@code CreateJobCommand.ShortDescription}: {@code Creates a new
     * job by reading stdin as a configuration XML file.}.
     * 
     * @return
     *     {@code Creates a new job by reading stdin as a configuration XML
     *     file.}
     */
    public static String CreateJobCommand_ShortDescription() {
        return holder.format("CreateJobCommand.ShortDescription");
    }

    /**
     * Key {@code CreateJobCommand.ShortDescription}: {@code Creates a new
     * job by reading stdin as a configuration XML file.}.
     * 
     * @return
     *     {@code Creates a new job by reading stdin as a configuration XML
     *     file.}
     */
    public static Localizable _CreateJobCommand_ShortDescription() {
        return new Localizable(holder, "CreateJobCommand.ShortDescription");
    }

    /**
     * Key {@code DeleteBuildsCommand.ShortDescription}: {@code Deletes build
     * record(s).}.
     * 
     * @return
     *     {@code Deletes build record(s).}
     */
    public static String DeleteBuildsCommand_ShortDescription() {
        return holder.format("DeleteBuildsCommand.ShortDescription");
    }

    /**
     * Key {@code DeleteBuildsCommand.ShortDescription}: {@code Deletes build
     * record(s).}.
     * 
     * @return
     *     {@code Deletes build record(s).}
     */
    public static Localizable _DeleteBuildsCommand_ShortDescription() {
        return new Localizable(holder, "DeleteBuildsCommand.ShortDescription");
    }

    /**
     * Key {@code ListChangesCommand.ShortDescription}: {@code Dumps the
     * changelog for the specified build(s).}.
     * 
     * @return
     *     {@code Dumps the changelog for the specified build(s).}
     */
    public static String ListChangesCommand_ShortDescription() {
        return holder.format("ListChangesCommand.ShortDescription");
    }

    /**
     * Key {@code ListChangesCommand.ShortDescription}: {@code Dumps the
     * changelog for the specified build(s).}.
     * 
     * @return
     *     {@code Dumps the changelog for the specified build(s).}
     */
    public static Localizable _ListChangesCommand_ShortDescription() {
        return new Localizable(holder, "ListChangesCommand.ShortDescription");
    }

    /**
     * Key {@code GetNodeCommand.ShortDescription}: {@code Dumps the node
     * definition XML to stdout.}.
     * 
     * @return
     *     {@code Dumps the node definition XML to stdout.}
     */
    public static String GetNodeCommand_ShortDescription() {
        return holder.format("GetNodeCommand.ShortDescription");
    }

    /**
     * Key {@code GetNodeCommand.ShortDescription}: {@code Dumps the node
     * definition XML to stdout.}.
     * 
     * @return
     *     {@code Dumps the node definition XML to stdout.}
     */
    public static Localizable _GetNodeCommand_ShortDescription() {
        return new Localizable(holder, "GetNodeCommand.ShortDescription");
    }

    /**
     * Key {@code LogoutCommand.ShortDescription}: {@code Deletes the
     * credentials stored with the login command. [deprecated]}.
     * 
     * @return
     *     {@code Deletes the credentials stored with the login command.
     *     [deprecated]}
     */
    public static String LogoutCommand_ShortDescription() {
        return holder.format("LogoutCommand.ShortDescription");
    }

    /**
     * Key {@code LogoutCommand.ShortDescription}: {@code Deletes the
     * credentials stored with the login command. [deprecated]}.
     * 
     * @return
     *     {@code Deletes the credentials stored with the login command.
     *     [deprecated]}
     */
    public static Localizable _LogoutCommand_ShortDescription() {
        return new Localizable(holder, "LogoutCommand.ShortDescription");
    }

    /**
     * Key {@code GetViewCommand.ShortDescription}: {@code Dumps the view
     * definition XML to stdout.}.
     * 
     * @return
     *     {@code Dumps the view definition XML to stdout.}
     */
    public static String GetViewCommand_ShortDescription() {
        return holder.format("GetViewCommand.ShortDescription");
    }

    /**
     * Key {@code GetViewCommand.ShortDescription}: {@code Dumps the view
     * definition XML to stdout.}.
     * 
     * @return
     *     {@code Dumps the view definition XML to stdout.}
     */
    public static Localizable _GetViewCommand_ShortDescription() {
        return new Localizable(holder, "GetViewCommand.ShortDescription");
    }

    /**
     * Key {@code InstallToolCommand.ShortDescription}: {@code Performs
     * automatic tool installation, and print its location to stdout. Can be
     * only called from inside a build. [deprecated]}.
     * 
     * @return
     *     {@code Performs automatic tool installation, and print its location to
     *     stdout. Can be only called from inside a build. [deprecated]}
     */
    public static String InstallToolCommand_ShortDescription() {
        return holder.format("InstallToolCommand.ShortDescription");
    }

    /**
     * Key {@code InstallToolCommand.ShortDescription}: {@code Performs
     * automatic tool installation, and print its location to stdout. Can be
     * only called from inside a build. [deprecated]}.
     * 
     * @return
     *     {@code Performs automatic tool installation, and print its location to
     *     stdout. Can be only called from inside a build. [deprecated]}
     */
    public static Localizable _InstallToolCommand_ShortDescription() {
        return new Localizable(holder, "InstallToolCommand.ShortDescription");
    }

}
