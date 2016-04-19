//-------------------------------------------------------------------------------------------------------
// Copyright (C) Microsoft. All rights reserved.
// Licensed under the MIT license. See LICENSE.txt file in the project root for full license information.
//-------------------------------------------------------------------------------------------------------
package Windows.UI.Xaml.Controls;

import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.FrameLayout;
import android.widget.AbsoluteLayout;
import run.ace.NativeHost;
import run.ace.TabBar;
import run.ace.FooterBar;
import android.view.Gravity;
import android.graphics.Color;

public class Page extends DrawerLayout implements IHaveProperties {

    public TabBar tabBar;
    public CommandBar menuBar;
    public String frameTitle;
    public FrameLayout layout;
    public FrameLayout menu;
    public View content;
    public FooterBar footer;

    public android.content.Context mContext;

	public Page(android.content.Context context) {

		super(context);
        FrameLayout layout = new FrameLayout(context);
        this.layout = layout;
        FrameLayout menu = new FrameLayout(context);
        this.menu = menu;

/*
        // Fill the area provided by the parent
        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        );
		this.setLayoutParams(lp);
*/
        
	}

    public View getContent() {
        return content;
    }

    public void setContent(View content) {
        this.content = content;
    }

    public View getFooter() {
        return this.footer;
    }

    public void setFooter(FooterBar footer) {
        this.footer = footer;
    }

    public FrameLayout getLayout() {
        return this.layout;
    }

    public void setLayout(FrameLayout layout) {
        this.layout = layout;
    }

    public void show(View content) {

        this.layout.addView(content);
        this.addView(this.layout);

        DrawerLayout.LayoutParams lp2 = new DrawerLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT,
            Gravity.LEFT
        );
        this.menu.setLayoutParams(lp2);    
        this.menu.setBackgroundColor(Color.parseColor("#191919"));
        this.addView(this.menu);

    }

/*
    public View getLayout() {
        return this.layout;
    }

    public void setLayout(FrameLayout layout) {
        this.layout = layout;
    }
*/

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

                footer = (FooterBar)propertyValue;
                ((FooterBar)propertyValue).show(this);

            } else {

                footer = (FooterBar)propertyValue;
                ((FooterBar)propertyValue).remove(this);
                
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
