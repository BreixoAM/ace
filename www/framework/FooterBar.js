//-------------------------------------------------------------------------------------------------------
// Copyright (C) Microsoft. All rights reserved.
// Licensed under the MIT license. See LICENSE.txt file in the project root for full license information.
//-------------------------------------------------------------------------------------------------------

//
// A specialized app bar that renders its command elements as tabs onthe footer.
// <ace:FooterBar> in XAML.
//
function FooterBar() {
    ace.UIElement.call(this, "run.ace.FooterBar");
};

// Inheritance
FooterBar.prototype = Object.create(ace.CommandBar.prototype);

module.exports = FooterBar;

