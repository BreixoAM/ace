---
layout: doc
title: UI Framework Reference
category: docs
permalink: /docs/ref/
section1: Layout Panels
section2: Controls
section3: Ace
section4: Platform Helpers
section5: NativeObject
---

<a name="one"/>

## LAYOUT PANELS

<br/>

## Canvas
Enables positioning child elements with coordinates.

<a href="https://github.com/adnathan/ace/blob/master/www/framework/panels/Canvas.js">View APIs</a>

Events (attach with addEventListener):

* loaded

Base Classes:

<a href="https://github.com/adnathan/ace/blob/master/www/framework/panels/Panel.js">Panel</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UIElement.js">UIElement</a>

<br/>

## StackPanel
Arranges child elements into a single line that can be oriented horizontally or vertically.

<a href="https://github.com/adnathan/ace/blob/master/www/framework/panels/StackPanel.js">View APIs</a>

Events (attach with addEventListener):

* loaded

Base Classes:

<a href="https://github.com/adnathan/ace/blob/master/www/framework/panels/Panel.js">Panel</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UIElement.js">UIElement</a>

<br/>

<a name="Grid"/>

## Grid
Arranges child elements into flexible rows and columns.

<a href="https://github.com/adnathan/ace/blob/master/www/framework/panels/Grid.js">View APIs</a>

Events (attach with addEventListener):

* loaded

Base Classes:

<a href="https://github.com/adnathan/ace/blob/master/www/framework/panels/Panel.js">Panel</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UIElement.js">UIElement</a>

<br/>

<a name="two"/>

## CONTROLS

<br/>

<a name="AppBarButton"/>

## AppBarButton
A button meant to be displayed in a CommandBar.

<a href="https://github.com/adnathan/ace/blob/master/www/framework/AppBarButton.js">View APIs</a>

Events (attach with addEventListener):

* click
* loaded

Base Classes:

<a href="https://github.com/adnathan/ace/blob/master/www/framework/Button.js">Button</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/ButtonBase.js">ButtonBase</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/ContentControl.js">ContentControl</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/Control.js">Control</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UIElement.js">UIElement</a>

<br/>

<a name="Button"/>

## Button
A button that can respond to clicks.

<a href="https://github.com/adnathan/ace/blob/master/www/framework/Button.js">View APIs</a>

Events (attach with addEventListener):

* click
* loaded

Base Classes:

<a href="https://github.com/adnathan/ace/blob/master/www/framework/ButtonBase.js">ButtonBase</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/ContentControl.js">ContentControl</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/Control.js">Control</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UIElement.js">UIElement</a>

<br/>

## CommandBar
A specialized app bar that provides layout for AppBarButton and related command elements.

<a href="https://github.com/adnathan/ace/blob/master/www/framework/CommandBar.js">View APIs</a>

Events (attach with addEventListener):

* loaded

Base Classes:

<a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/ContentControl.js">ContentControl</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/Control.js">Control</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UIElement.js">UIElement</a>

<br/>

<a name="DatePicker"/>

## DatePicker
A control that enables a user to pick a date value.

<a href="https://github.com/adnathan/ace/blob/master/www/framework/DatePicker.js">View APIs</a>

Events (attach with addEventListener):

* datechanged
* loaded

Base Classes:

<a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/Control.js">Control</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UIElement.js">UIElement</a>

<br/>

## HyperlinkButton
A button that functions as a hyperlink.

<a href="https://github.com/adnathan/ace/blob/master/www/framework/HyperlinkButton.js">View APIs</a>

Events (attach with addEventListener):

* click
* loaded

Base Classes:

<a href="https://github.com/adnathan/ace/blob/master/www/framework/Button.js">Button</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/ButtonBase.js">ButtonBase</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/ContentControl.js">ContentControl</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/Control.js">Control</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UIElement.js">UIElement</a>

<br/>

<a name="Image"/>

## Image
Displays an image. See [Working with Images](/ace/docs/images) for more info.

<a href="https://github.com/adnathan/ace/blob/master/www/framework/Image.js">View APIs</a>

Events (attach with addEventListener):

* loaded

Base Classes:

<a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UIElement.js">UIElement</a>

<br/>

## ListBox
A selectable list of items.

<a href="https://github.com/adnathan/ace/blob/master/www/framework/ListBox.js">View APIs</a>

Events (attach with addEventListener):

* loaded

Base Classes:

<a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/Selector.js">Selector</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/ItemsControl.js">ItemsControl</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/Control.js">Control</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UIElement.js">UIElement</a>

<br/>

## ListBoxItem
A container for an item in a ListBox.

<a href="https://github.com/adnathan/ace/blob/master/www/framework/ListBoxItem.js">View APIs</a>

Events (attach with addEventListener):

* loaded

Base Classes:

<a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/SelectorItem.js">SelectorItem</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/ContentControl.js">ContentControl</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/Control.js">Control</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UIElement.js">UIElement</a>

<br/>

## Page
Use this as the root content if you want app bars.

<a href="https://github.com/adnathan/ace/blob/master/www/framework/Page.js">View APIs</a>

Events (attach with addEventListener):

* loaded

Base Classes:

<a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UserControl.js">UserControl</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UIElement.js">UIElement</a>

<br/>

## Popup
A general-purpose container for hosting UI objects on top of other content, such as HTML.

<a href="https://github.com/adnathan/ace/blob/master/www/framework/Popup.js">View APIs</a>

Events (attach with addEventListener):

* loaded

Base Classes:

<a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/ContentControl.js">ContentControl</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/Control.js">Control</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UIElement.js">UIElement</a>

<br/>

<a name="TabBar"/>

## ace:TabBar
A command bar designed for tabs rather than buttons.

Events (attach with addEventListener):

* loaded

<br/>

## TextBlock
A lightweight element for displaying small amounts of text.

Events (attach with addEventListener):

* loaded

Base Classes:

<a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UIElement.js">UIElement</a>

<br/>

## TimePicker
A control that enables a user to pick a time value.

<a href="https://github.com/adnathan/ace/blob/master/www/framework/TimePicker.js">View APIs</a>

Events (attach with addEventListener):

* loaded
* timechanged

Base Classes:

<a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/Control.js">Control</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UIElement.js">UIElement</a>

<br/>

## ToggleSwitch
A switch that can be toggled between two states.

<a href="https://github.com/adnathan/ace/blob/master/www/framework/ToggleSwitch.js">View APIs</a>

Events (attach with addEventListener):

* isonchanged
* loaded

Base Classes:

<a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/Control.js">Control</a> > <a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UIElement.js">UIElement</a>

<br/>

## WebView
A control that hosts HTML.

<a href="https://github.com/adnathan/ace/blob/master/www/framework/WebView.js">View APIs</a>

Events (attach with addEventListener):

* loaded

Base Classes:

<a href="https://github.com/adnathan/ace/blob/master/www/framework/primitives/UIElement.js">UIElement</a>

<br/>

<a name="three"/>

## ACE

<br/>

* ace.valueOn({ ios: xxx, android: xxx })
* ace.navigate(url, onSuccess, onError)
* ace.navigate(uiObject, onSuccess, onError)
* ace.load(url, onSuccess, onError)
* ace.goBack()
* ace.getHostPage()
* ace.getHostWebView()
* ace.addEventListener("navigating")
* ace.addEventListener("navigated")
* ace.removeEventListener(..., func)
* ace.raiseEvent(...)

<br/>

<a name="four"/>

## PLATFORM HELPERS (ANDROID)

### ace.android.appWidget.add(text)

Adds the passed-in string as a new item in your list-based Android app widget.

### ace.android.appWidget.clear()

Clears all the items in your list-based Android app widget.

### ace.android.getContext()

Returns the current Android application context object.

### ace.android.getActivity()

Returns the current activity.

### ace.android.getIntent()

Returns the current intent associated with the current activity.

### ace.android.getId(name, onSuccess, onError)

Gets the numeric Android resource ID for the given resource name.

### ace.android.ifVersionAtLeast(version, onTrue, onFalse)

Calls your onTrue callback if the current version of Android is greater than or equal to the version you specify. Otherwise, your optional 
onFalse callback is called.

<pre>
// setBackgroundTintList only works on LOLLIPOP_MR1 or later
ace.android.ifVersionAtLeast(ace.android.version.LOLLIPOP_MR1, function (actualVersion) {
    button2.invoke("setBackgroundTintList", tintList2);
}, function (actualVersion) {
    button2.invoke("setBackgroundColor", color2);
});
</pre>

### ace.addEventListener("android.intentchanged")

Attaches an event handler that gets invoked whenever the current activity's intent changes. One thing that causes this is 
the selection of an item on a list-based app widget.

### ace.android.version

An enumeration of Android version codes, such as KITKAT, LOLLIPOP, LOLLIPOP_MR1, and M (for Marshmallow). This matches Android's [VERSION_CODES enumeration](http://developer.android.com/reference/android/os/Build.VERSION_CODES.html).

<br/>

## PLATFORM HELPERS (iOS)

### ace.ios.getNavigationController()

Returns the current UINavigationController instance.

### ace.ios.getPresentedViewControllerAsync(onSuccess)

If a view controller has been "presented" (e.g. a modal dialog), this retrieves that view controller.
    
### ace.ios.getCurrentModalContent()

If a modal dialog is showing, this retrieves the root UI element from it.

### ace.ios.setCurrentModalContent(content)

If a modal dialog is showing, this replaces its root UI element.

<br/>

<a name="five"/>

## NATIVEOBJECT

<br/>

NativeObject is the base class of UIElement, but you can also <a href="/ace/docs/native-code">use it directly to call arbitrary native code</a>.

* invoke (instance and static)
* getField (instance and static)
* setField (instance and static)
* get (for special properties)
* set (for special properties)
* addEventListener
* removeEventListener
* removeAllEventListeners
* raiseEvent

