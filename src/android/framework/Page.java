//-------------------------------------------------------------------------------------------------------
// Copyright (C) Microsoft. All rights reserved.
// Licensed under the MIT license. See LICENSE.txt file in the project root for full license information.
//-------------------------------------------------------------------------------------------------------
package Windows.UI.Xaml.Controls;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.AbsoluteLayout;
import run.ace.NativeHost;
import run.ace.TabBar;
import android.view.Gravity;
import android.graphics.Color;

public class Page extends FrameLayout implements IHaveProperties {

    public TabBar tabBar;
    public CommandBar menuBar;
    public String frameTitle;
    public View content;
    public View footer;

	public Page(android.content.Context context) {
		super(context);

        // Fill the area provided by the parent
        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        );
		this.setLayoutParams(lp);
        
	}

    public View getContent() {
        return content;
    }

    public void setContent(View content) {
        this.content = content;
    }

    public View getFooter() {
        return footer;
    }

    public void setFooter(View content) {
        this.footer = footer;
    }

	// IHaveProperties.setProperty
	public void setProperty(String propertyName, Object propertyValue)
	{
        if (propertyName.endsWith(".BottomAppBar")) {
            // TODO: Need to handle this being set after already inside activity,
            //       and also handling invalidations inside buttons, etc.
            if (propertyValue instanceof TabBar) {
                tabBar = (TabBar)propertyValue;
                ((TabBar)propertyValue).show(NativeHost.getMainActivity());
            }
            else if (propertyValue instanceof CommandBar) {
                menuBar = (CommandBar)propertyValue;
            }
            else if (propertyValue == null) {
                tabBar = null;
                //menuBar = null;
                TabBar.remove(NativeHost.getMainActivity());
                //CommandBar.remove(NativeHost.getMainActivity(), NativeHost.getRootMenu());
            }
            else {
    			throw new RuntimeException("Unhandled value for BottomAppBar: " + propertyValue);
            }
        }
        else if (propertyName.endsWith(".TopAppBar")) {
            // TODO: Need to handle this being set after already inside activity,
            //       and also handling invalidations inside buttons, etc.
            menuBar = (CommandBar)propertyValue;
        }
        else if (propertyName.endsWith(".Title")) {
            frameTitle = (String)propertyValue;
            // If this is the currently-visible page, update the title now:
            // TODO: This only handles the main activity
            if (this.getParent() == NativeHost.getRootView()) {
                updateTitle(NativeHost.getMainActivity());
            }
        }
        else if (propertyName.endsWith(".Footer")) {

            if (propertyValue != null) {

                FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                );
                lp.setMargins(0, 0, 0, 120);
                this.content.setLayoutParams(lp);

                FrameLayout footer = new FrameLayout(this.getContext());
                FrameLayout.LayoutParams lp2 = new FrameLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    120,
                    Gravity.BOTTOM
                );
                footer.setLayoutParams(lp2);    
                footer.setBackgroundColor(Color.parseColor("#191919"));
                this.setFooter(footer);
                if (this.getChildAt(1) == null) {
                    this.addView(footer);
                }

            } else {

                FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                );
                lp.setMargins(0, 0, 0, 0);
                this.content.setLayoutParams(lp);
                if (this.getChildAt(1) != null) {
                    this.removeViewAt(1);    
                }
                
            }

        }
		else if (!ViewGroupHelper.setProperty(this, propertyName, propertyValue)) {
			throw new RuntimeException("Unhandled property for " + this.getClass().getSimpleName() + ": " + propertyName);
		}
	}

    void updateTitle(android.app.Activity activity) {
        if (this.tabBar != null) {
            this.tabBar.setTitle(this.frameTitle == null ? "" : this.frameTitle, activity);
        }
        if (this.menuBar != null) {
            this.menuBar.setTitle(this.frameTitle == null ? "" : this.frameTitle, activity);
        }
    }

    public void processBars(android.app.Activity activity, android.view.Menu menu) {
        updateTitle(activity);
        if (this.tabBar != null) {
            this.tabBar.show(activity);
        }
        if (this.menuBar != null) {
            this.menuBar.show(activity, menu);
        }
    }
}
