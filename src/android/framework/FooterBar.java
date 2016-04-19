//-------------------------------------------------------------------------------------------------------
// Copyright (C) Microsoft. All rights reserved.
// Licensed under the MIT license. See LICENSE.txt file in the project root for full license information.
//-------------------------------------------------------------------------------------------------------
package run.ace;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
//import android.support.v7.app.ActionBar;
//import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import Windows.UI.Xaml.Controls.*;
import android.widget.FrameLayout;
import android.view.Gravity;
import android.graphics.Color;

// This derived from android.widget.Toolbar, but (a) that's not needed
// and (b) Toolbar is only for Lollipop or later
public class FooterBar extends android.widget.LinearLayout implements
    IHaveProperties, IRecieveCollectionChanges {

    ObservableCollection _primaryCommands;
    ObservableCollection _secondaryCommands;

	public FooterBar(Context context) {
		super(context);
    }

    public void show(Page page) {

        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        );

        lp.setMargins(0, 0, 0, 100);
        page.getContent().setLayoutParams(lp);

        FrameLayout.LayoutParams lp2 = new FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            100,
            Gravity.BOTTOM
        );
        this.setLayoutParams(lp2);    
        this.setBackgroundColor(Color.parseColor("#191919"));

        if (_primaryCommands != null) {
            for (int i = 0; i < _primaryCommands.size(); i++) {
                AppBarButton abb = (AppBarButton)_primaryCommands.get(i);
                abb.setText(abb.label);
                this.addView(abb);
            }
        }

        if (page.getChildAt(1) == null) {
            page.addView(this);
            page.setFooter(this);
        }

	}

    public static void remove(Page page) {

        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        );
        lp.setMargins(0, 0, 0, 0);
        page.getContent().setLayoutParams(lp);
        if (page.getChildAt(1) != null) {
            page.removeViewAt(1);    
        }

	}

	// IHaveProperties.setProperty
	public void setProperty(String propertyName, Object propertyValue)
	{
        if (propertyName.endsWith(".PrimaryCommands") ||
            propertyName.endsWith(".Children")) {
            if (propertyValue == null && _primaryCommands != null) {
                _primaryCommands.removeListener(this);
                _primaryCommands = null;
            }
            else {
                _primaryCommands = (ObservableCollection)propertyValue;
                // Listen to collection changes
                _primaryCommands.addListener(this);
            }
        }
        else if (propertyName.endsWith(".SecondaryCommands") ||
            propertyName.endsWith(".Children")) {
            if (propertyValue == null && _secondaryCommands != null) {
                _secondaryCommands.removeListener(this);
                _secondaryCommands = null;
            }
            else {
                _secondaryCommands = (ObservableCollection)propertyValue;
                // Listen to collection changes
                _secondaryCommands.addListener(this);
            }
        }
		else if (!ViewGroupHelper.setProperty(this, propertyName, propertyValue)) {
			throw new RuntimeException("Unhandled property for " + this.getClass().getSimpleName() + ": " + propertyName);
		}
	}

	// IRecieveCollectionChanges.add
	public void add(Object collection, Object item) {
        if (collection == _primaryCommands) {
            // TODO: Update items
        }
        else if (collection == _secondaryCommands) {
            // TODO: Update items
        }
	}

	// IRecieveCollectionChanges.removeAt
	public void removeAt(Object collection, int index) {
        if (collection == _primaryCommands) {
            // TODO: Update items
        }
        else if (collection == _secondaryCommands) {
            // TODO: Update items
        }
	}
}
