
package lib;

import java.util.Map;
import groovy.lang.Closure;
import org.kohsuke.stapler.jelly.groovy.TagFile;
import org.kohsuke.stapler.jelly.groovy.TagLibraryUri;
import org.kohsuke.stapler.jelly.groovy.TypedTagLibrary;

@TagLibraryUri("/lib/layout")
public interface LayoutTagLib
    extends TypedTagLibrary
{


    /**
     * 
     *     Sets up the same 'global' variables that the l:layout tag does for content loaded by AJAX scripts.
     * 
     *     
     *   
     * 
     */
    void ajax(Map args, Closure body);

    /**
     * 
     *     Sets up the same 'global' variables that the l:layout tag does for content loaded by AJAX scripts.
     * 
     *     
     *   
     * 
     */
    void ajax(Closure body);

    /**
     * 
     *     Sets up the same 'global' variables that the l:layout tag does for content loaded by AJAX scripts.
     * 
     *     
     *   
     * 
     */
    void ajax(Map args);

    /**
     * 
     *     Sets up the same 'global' variables that the l:layout tag does for content loaded by AJAX scripts.
     * 
     *     
     *   
     * 
     */
    void ajax();

    /**
     * 
     *     Used inside &lt;l:layout&gt; to render additional breadcrumb items.
     * 
     *     
     *     
     *     
     *   
     * 
     */
    void breadcrumb(Map args, Closure body);

    /**
     * 
     *     Used inside &lt;l:layout&gt; to render additional breadcrumb items.
     * 
     *     
     *     
     *     
     *   
     * 
     */
    void breadcrumb(Closure body);

    /**
     * 
     *     Used inside &lt;l:layout&gt; to render additional breadcrumb items.
     * 
     *     
     *     
     *     
     *   
     * 
     */
    void breadcrumb(Map args);

    /**
     * 
     *     Used inside &lt;l:layout&gt; to render additional breadcrumb items.
     * 
     *     
     *     
     *     
     *   
     * 
     */
    void breadcrumb();

    /**
     * 
     *     Generates the bar that shows breadcrumbs, along with its associated dynamic behaviours.
     *     This tag is used by l:layout and not expected to be used by anyone else,
     *     but it's written as separate tag for better readability of code.
     * 
     *     To render additional breadcrumb items (for example to provide in-page navigations),
     *     use the &lt;l:breadcrumb&gt; tag.
     *   
     * 
     */
    void breadcrumbBar(Map args, Closure body);

    /**
     * 
     *     Generates the bar that shows breadcrumbs, along with its associated dynamic behaviours.
     *     This tag is used by l:layout and not expected to be used by anyone else,
     *     but it's written as separate tag for better readability of code.
     * 
     *     To render additional breadcrumb items (for example to provide in-page navigations),
     *     use the &lt;l:breadcrumb&gt; tag.
     *   
     * 
     */
    void breadcrumbBar(Closure body);

    /**
     * 
     *     Generates the bar that shows breadcrumbs, along with its associated dynamic behaviours.
     *     This tag is used by l:layout and not expected to be used by anyone else,
     *     but it's written as separate tag for better readability of code.
     * 
     *     To render additional breadcrumb items (for example to provide in-page navigations),
     *     use the &lt;l:breadcrumb&gt; tag.
     *   
     * 
     */
    void breadcrumbBar(Map args);

    /**
     * 
     *     Generates the bar that shows breadcrumbs, along with its associated dynamic behaviours.
     *     This tag is used by l:layout and not expected to be used by anyone else,
     *     but it's written as separate tag for better readability of code.
     * 
     *     To render additional breadcrumb items (for example to provide in-page navigations),
     *     use the &lt;l:breadcrumb&gt; tag.
     *   
     * 
     */
    void breadcrumbBar();

    /**
     * 
     *     Send escaped value to output decorated to be safely broken into lines when necessary
     *     @since 1.517
     *     
     *   
     * 
     */
    void breakable(Map args, Closure body);

    /**
     * 
     *     Send escaped value to output decorated to be safely broken into lines when necessary
     *     @since 1.517
     *     
     *   
     * 
     */
    void breakable(Closure body);

    /**
     * 
     *     Send escaped value to output decorated to be safely broken into lines when necessary
     *     @since 1.517
     *     
     *   
     * 
     */
    void breakable(Map args);

    /**
     * 
     *     Send escaped value to output decorated to be safely broken into lines when necessary
     *     @since 1.517
     *     
     *   
     * 
     */
    void breakable();

    /**
     * 
     *         Produces a hyperlink which when clicked first asks for confirmation, then goes to that URL if confirmed.
     *         The body is displayed as the link text.
     *         @since 1.512
     *         
     *         
     *         
     *         
     *     
     * 
     */
    void confirmationLink(Map args, Closure body);

    /**
     * 
     *         Produces a hyperlink which when clicked first asks for confirmation, then goes to that URL if confirmed.
     *         The body is displayed as the link text.
     *         @since 1.512
     *         
     *         
     *         
     *         
     *     
     * 
     */
    void confirmationLink(Closure body);

    /**
     * 
     *         Produces a hyperlink which when clicked first asks for confirmation, then goes to that URL if confirmed.
     *         The body is displayed as the link text.
     *         @since 1.512
     *         
     *         
     *         
     *         
     *     
     * 
     */
    void confirmationLink(Map args);

    /**
     * 
     *         Produces a hyperlink which when clicked first asks for confirmation, then goes to that URL if confirmed.
     *         The body is displayed as the link text.
     *         @since 1.512
     *         
     *         
     *         
     *         
     *     
     * 
     */
    void confirmationLink();

    /**
     * 
     *     Creates a small button that lets the user copies a text into clipboard
     * 
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void copyButton(Map args, Closure body);

    /**
     * 
     *     Creates a small button that lets the user copies a text into clipboard
     * 
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void copyButton(Closure body);

    /**
     * 
     *     Creates a small button that lets the user copies a text into clipboard
     * 
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void copyButton(Map args);

    /**
     * 
     *     Creates a small button that lets the user copies a text into clipboard
     * 
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void copyButton();

    /**
     * 
     *     Client-side CSS loading tag. Similar to adjunct, but driven from the client. See page-init.js.
     * 
     *     @since 2.0
     *     
     *   
     * 
     */
    void css(Map args, Closure body);

    /**
     * 
     *     Client-side CSS loading tag. Similar to adjunct, but driven from the client. See page-init.js.
     * 
     *     @since 2.0
     *     
     *   
     * 
     */
    void css(Closure body);

    /**
     * 
     *     Client-side CSS loading tag. Similar to adjunct, but driven from the client. See page-init.js.
     * 
     *     @since 2.0
     *     
     *   
     * 
     */
    void css(Map args);

    /**
     * 
     *     Client-side CSS loading tag. Similar to adjunct, but driven from the client. See page-init.js.
     * 
     *     @since 2.0
     *     
     *   
     * 
     */
    void css();

    /**
     * 
     */
    void expandButton(Map args, Closure body);

    /**
     * 
     */
    void expandButton(Closure body);

    /**
     * 
     */
    void expandButton(Map args);

    /**
     * 
     */
    void expandButton();

    /**
     * 
     *     Renders the body only if the current user has the specified permission
     *     
     *   
     * 
     */
    void hasPermission(Map args, Closure body);

    /**
     * 
     *     Renders the body only if the current user has the specified permission
     *     
     *   
     * 
     */
    void hasPermission(Closure body);

    /**
     * 
     *     Renders the body only if the current user has the specified permission
     *     
     *   
     * 
     */
    void hasPermission(Map args);

    /**
     * 
     *     Renders the body only if the current user has the specified permission
     *     
     *   
     * 
     */
    void hasPermission();

    /**
     * 
     *     Header portion of the HTML page, that gets rendered into the &lt;head&gt; tag.
     *     Multiple &lt;l:header&gt; elements can be specified, and can even come after
     *     &lt;l:main-panel&gt;.
     * 
     *     This tag can be placed inside &lt;l:layout&gt;.
     *   
     * 
     */
    void header(Map args, Closure body);

    /**
     * 
     *     Header portion of the HTML page, that gets rendered into the &lt;head&gt; tag.
     *     Multiple &lt;l:header&gt; elements can be specified, and can even come after
     *     &lt;l:main-panel&gt;.
     * 
     *     This tag can be placed inside &lt;l:layout&gt;.
     *   
     * 
     */
    void header(Closure body);

    /**
     * 
     *     Header portion of the HTML page, that gets rendered into the &lt;head&gt; tag.
     *     Multiple &lt;l:header&gt; elements can be specified, and can even come after
     *     &lt;l:main-panel&gt;.
     * 
     *     This tag can be placed inside &lt;l:layout&gt;.
     *   
     * 
     */
    void header(Map args);

    /**
     * 
     *     Header portion of the HTML page, that gets rendered into the &lt;head&gt; tag.
     *     Multiple &lt;l:header&gt; elements can be specified, and can even come after
     *     &lt;l:main-panel&gt;.
     * 
     *     This tag can be placed inside &lt;l:layout&gt;.
     *   
     * 
     */
    void header();

    /**
     * 
     * 
     *     This Jelly tag is deprecated, use  tag instead. Defined on layout.jelly.
     * 
     *     Outer-most tag for a normal (non-AJAX) HTML rendering.
     *     This is used with nested &lt;header&gt;, &lt;side-panel&gt;, and &lt;main-panel&gt;
     *     to form Jenkins's basic HTML layout.
     * 
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void html(Map args, Closure body);

    /**
     * 
     * 
     *     This Jelly tag is deprecated, use  tag instead. Defined on layout.jelly.
     * 
     *     Outer-most tag for a normal (non-AJAX) HTML rendering.
     *     This is used with nested &lt;header&gt;, &lt;side-panel&gt;, and &lt;main-panel&gt;
     *     to form Jenkins's basic HTML layout.
     * 
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void html(Closure body);

    /**
     * 
     * 
     *     This Jelly tag is deprecated, use  tag instead. Defined on layout.jelly.
     * 
     *     Outer-most tag for a normal (non-AJAX) HTML rendering.
     *     This is used with nested &lt;header&gt;, &lt;side-panel&gt;, and &lt;main-panel&gt;
     *     to form Jenkins's basic HTML layout.
     * 
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void html(Map args);

    /**
     * 
     * 
     *     This Jelly tag is deprecated, use  tag instead. Defined on layout.jelly.
     * 
     *     Outer-most tag for a normal (non-AJAX) HTML rendering.
     *     This is used with nested &lt;header&gt;, &lt;side-panel&gt;, and &lt;main-panel&gt;
     *     to form Jenkins's basic HTML layout.
     * 
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void html();

    /**
     * 
     *     @since 1.576
     *     
     * 
     *     
     * 
     *     
     *     
     *     
     *     
     * 
     *     
     *   
     * 
     */
    void icon(Map args, Closure body);

    /**
     * 
     *     @since 1.576
     *     
     * 
     *     
     * 
     *     
     *     
     *     
     *     
     * 
     *     
     *   
     * 
     */
    void icon(Closure body);

    /**
     * 
     *     @since 1.576
     *     
     * 
     *     
     * 
     *     
     *     
     *     
     *     
     * 
     *     
     *   
     * 
     */
    void icon(Map args);

    /**
     * 
     *     @since 1.576
     *     
     * 
     *     
     * 
     *     
     *     
     *     
     *     
     * 
     *     
     *   
     * 
     */
    void icon();

    /**
     * 
     */
    void isAdmin(Map args, Closure body);

    /**
     * 
     */
    void isAdmin(Closure body);

    /**
     * 
     */
    void isAdmin(Map args);

    /**
     * 
     */
    void isAdmin();

    /**
     * Deprecated, do not use.
     * 
     */
    void isAdminOrTest(Map args, Closure body);

    /**
     * Deprecated, do not use.
     * 
     */
    void isAdminOrTest(Closure body);

    /**
     * Deprecated, do not use.
     * 
     */
    void isAdminOrTest(Map args);

    /**
     * Deprecated, do not use.
     * 
     */
    void isAdminOrTest();

    /**
     * 
     *     Client-side JavaScript loading tag. Similar to adjunct, but driven from the client. See page-init.js.
     * 
     *     @since 2.0
     *     
     *   
     * 
     */
    void js(Map args, Closure body);

    /**
     * 
     *     Client-side JavaScript loading tag. Similar to adjunct, but driven from the client. See page-init.js.
     * 
     *     @since 2.0
     *     
     *   
     * 
     */
    void js(Closure body);

    /**
     * 
     *     Client-side JavaScript loading tag. Similar to adjunct, but driven from the client. See page-init.js.
     * 
     *     @since 2.0
     *     
     *   
     * 
     */
    void js(Map args);

    /**
     * 
     *     Client-side JavaScript loading tag. Similar to adjunct, but driven from the client. See page-init.js.
     * 
     *     @since 2.0
     *     
     *   
     * 
     */
    void js();

    /**
     * 
     *     Outer-most tag for a normal (non-AJAX) HTML rendering.
     *     This is used with nested &lt;header&gt;, &lt;side-panel&gt;, and &lt;main-panel&gt;
     *     to form Jenkins's basic HTML layout.
     * 
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void layout(Map args, Closure body);

    /**
     * 
     *     Outer-most tag for a normal (non-AJAX) HTML rendering.
     *     This is used with nested &lt;header&gt;, &lt;side-panel&gt;, and &lt;main-panel&gt;
     *     to form Jenkins's basic HTML layout.
     * 
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void layout(Closure body);

    /**
     * 
     *     Outer-most tag for a normal (non-AJAX) HTML rendering.
     *     This is used with nested &lt;header&gt;, &lt;side-panel&gt;, and &lt;main-panel&gt;
     *     to form Jenkins's basic HTML layout.
     * 
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void layout(Map args);

    /**
     * 
     *     Outer-most tag for a normal (non-AJAX) HTML rendering.
     *     This is used with nested &lt;header&gt;, &lt;side-panel&gt;, and &lt;main-panel&gt;
     *     to form Jenkins's basic HTML layout.
     * 
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void layout();

    /**
     * 
     *     Generates the body as the main content part of a Jenkins page.
     *   
     * 
     */
    @TagFile("main-panel")
    void main_panel(Map args, Closure body);

    /**
     * 
     *     Generates the body as the main content part of a Jenkins page.
     *   
     * 
     */
    @TagFile("main-panel")
    void main_panel(Closure body);

    /**
     * 
     *     Generates the body as the main content part of a Jenkins page.
     *   
     * 
     */
    @TagFile("main-panel")
    void main_panel(Map args);

    /**
     * 
     *     Generates the body as the main content part of a Jenkins page.
     *   
     * 
     */
    @TagFile("main-panel")
    void main_panel();

    /**
     * 
     *     Used in the &lt;l:side-panel&gt; to draw a box with a title.
     * 
     *     The box is drawn as a table, and the body of this tag
     *     is expected to draw a series of &lt;TR&gt;s to fill in the contents
     *     of the box.
     *     
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void pane(Map args, Closure body);

    /**
     * 
     *     Used in the &lt;l:side-panel&gt; to draw a box with a title.
     * 
     *     The box is drawn as a table, and the body of this tag
     *     is expected to draw a series of &lt;TR&gt;s to fill in the contents
     *     of the box.
     *     
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void pane(Closure body);

    /**
     * 
     *     Used in the &lt;l:side-panel&gt; to draw a box with a title.
     * 
     *     The box is drawn as a table, and the body of this tag
     *     is expected to draw a series of &lt;TR&gt;s to fill in the contents
     *     of the box.
     *     
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void pane(Map args);

    /**
     * 
     *     Used in the &lt;l:side-panel&gt; to draw a box with a title.
     * 
     *     The box is drawn as a table, and the body of this tag
     *     is expected to draw a series of &lt;TR&gt;s to fill in the contents
     *     of the box.
     *     
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void pane();

    /**
     * 
     *         
     *         
     *         
     *     
     * 
     */
    void progressiveRendering(Map args, Closure body);

    /**
     * 
     *         
     *         
     *         
     *     
     * 
     */
    void progressiveRendering(Closure body);

    /**
     * 
     *         
     *         
     *         
     *     
     * 
     */
    void progressiveRendering(Map args);

    /**
     * 
     *         
     *         
     *         
     *     
     * 
     */
    void progressiveRendering();

    /**
     * 
     *     
     *     
     *     
     *   
     * 
     */
    void renderOnDemand(Map args, Closure body);

    /**
     * 
     *     
     *     
     *     
     *   
     * 
     */
    void renderOnDemand(Closure body);

    /**
     * 
     *     
     *     
     *     
     *   
     * 
     */
    void renderOnDemand(Map args);

    /**
     * 
     *     
     *     
     *     
     *   
     * 
     */
    void renderOnDemand();

    /**
     * 
     *     Creates a space for the right-hand side of the page.
     *     This sticks to the right of the page even when the content overflows.
     *   
     * 
     */
    void rightspace(Map args, Closure body);

    /**
     * 
     *     Creates a space for the right-hand side of the page.
     *     This sticks to the right of the page even when the content overflows.
     *   
     * 
     */
    void rightspace(Closure body);

    /**
     * 
     *     Creates a space for the right-hand side of the page.
     *     This sticks to the right of the page even when the content overflows.
     *   
     * 
     */
    void rightspace(Map args);

    /**
     * 
     *     Creates a space for the right-hand side of the page.
     *     This sticks to the right of the page even when the content overflows.
     *   
     * 
     */
    void rightspace();

    /**
     * 
     *     Generates a left side content as part of a Jenkins page. Typically known as two-column or left-side +  main-content layouts
     *   
     * 
     */
    @TagFile("side-panel")
    void side_panel(Map args, Closure body);

    /**
     * 
     *     Generates a left side content as part of a Jenkins page. Typically known as two-column or left-side +  main-content layouts
     *   
     * 
     */
    @TagFile("side-panel")
    void side_panel(Closure body);

    /**
     * 
     *     Generates a left side content as part of a Jenkins page. Typically known as two-column or left-side +  main-content layouts
     *   
     * 
     */
    @TagFile("side-panel")
    void side_panel(Map args);

    /**
     * 
     *     Generates a left side content as part of a Jenkins page. Typically known as two-column or left-side +  main-content layouts
     *   
     * 
     */
    @TagFile("side-panel")
    void side_panel();

    /**
     * 
     *         Creates a clickable "Stop" button.
     *         
     *         
     *         
     *     
     * 
     */
    void stopButton(Map args, Closure body);

    /**
     * 
     *         Creates a clickable "Stop" button.
     *         
     *         
     *         
     *     
     * 
     */
    void stopButton(Closure body);

    /**
     * 
     *         Creates a clickable "Stop" button.
     *         
     *         
     *         
     *     
     * 
     */
    void stopButton(Map args);

    /**
     * 
     *         Creates a clickable "Stop" button.
     *         
     *         
     *         
     *     
     * 
     */
    void stopButton();

    /**
     * 
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void tab(Map args, Closure body);

    /**
     * 
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void tab(Closure body);

    /**
     * 
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void tab(Map args);

    /**
     * 
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void tab();

    /**
     * 
     *     
     *   
     * 
     */
    void tabBar(Map args, Closure body);

    /**
     * 
     *     
     *   
     * 
     */
    void tabBar(Closure body);

    /**
     * 
     *     
     *   
     * 
     */
    void tabBar(Map args);

    /**
     * 
     *     
     *   
     * 
     */
    void tabBar();

    /**
     * 
     *     This tag inside &lt;l:tasks&gt; tag renders the left navigation bar of Hudson.
     *     Each &lt;task&gt; tag gets an icon and link.
     * 
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void task(Map args, Closure body);

    /**
     * 
     *     This tag inside &lt;l:tasks&gt; tag renders the left navigation bar of Hudson.
     *     Each &lt;task&gt; tag gets an icon and link.
     * 
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void task(Closure body);

    /**
     * 
     *     This tag inside &lt;l:tasks&gt; tag renders the left navigation bar of Hudson.
     *     Each &lt;task&gt; tag gets an icon and link.
     * 
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void task(Map args);

    /**
     * 
     *     This tag inside &lt;l:tasks&gt; tag renders the left navigation bar of Hudson.
     *     Each &lt;task&gt; tag gets an icon and link.
     * 
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void task();

    /**
     * 
     */
    void tasks(Map args, Closure body);

    /**
     * 
     */
    void tasks(Closure body);

    /**
     * 
     */
    void tasks(Map args);

    /**
     * 
     */
    void tasks();

    /**
     * 
     *     Load Yahoo UI module.
     *     
     *   
     * 
     */
    void yui(Map args, Closure body);

    /**
     * 
     *     Load Yahoo UI module.
     *     
     *   
     * 
     */
    void yui(Closure body);

    /**
     * 
     *     Load Yahoo UI module.
     *     
     *   
     * 
     */
    void yui(Map args);

    /**
     * 
     *     Load Yahoo UI module.
     *     
     *   
     * 
     */
    void yui();

}
