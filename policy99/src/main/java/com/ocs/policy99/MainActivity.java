package com.ocs.policy99;


import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends ActionBarActivity implements OnClickListener {
	private SlidingMenu slidingmenu;
	private Context context;
	private Toolbar toolbar;
	private ImageView menubutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayShowHomeEnabled(false);
        context=this; 
        menubutton=(ImageView)toolbar.findViewById(R.id.menu_button);
        initializeslidingmenu();
        setlisteners();
        
    }

    public void onClick(View v) {
		switch (v.getId()) {
		case R.id.menu_button_layout:
			slidingmenu.toggle();
			break;
		case R.id.menu_button:
			slidingmenu.toggle();
			break;
		default:
			break;
		}
	}
    private void initializeslidingmenu() {
		// TODO Auto-generated method stub
		try {
			slidingmenu = new SlidingMenu(this);
			slidingmenu.setMode(SlidingMenu.LEFT);
			slidingmenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
			slidingmenu.setShadowWidthRes(R.dimen.slidingmenu_shadow_width);
			//slidingmenu.setShadowDrawable(R.drawable.abc_ab_share_pack_holo_dark);
			slidingmenu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
			slidingmenu.setFadeDegree(0.35f);
			slidingmenu.attachToActivity(this, SlidingMenu.SLIDING_WINDOW);
			slidingmenu.setMenu(R.layout.slider_layout);
			slidingmenu.setSlidingEnabled(true);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void setlisteners() {
		try {
			menubutton.setOnClickListener(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
