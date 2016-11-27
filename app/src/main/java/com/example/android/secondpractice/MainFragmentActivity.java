package com.example.android.secondpractice;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Window;


/**
 * Created by Bartek on 2016-07-21.
 */
public class MainFragmentActivity extends ActionBarActivity {

    FirstFragment firstFragment;
    SecondFragment secondFragment;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.main_fragment_activity);
        tabActionBar();
    }



//
//    private void setupTabs() {
//        ActionBar actionBar = getActionBar();
//        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
//        actionBar.setDisplayShowTitleEnabled(true);
//
//        ActionBar.Tab tab1 = actionBar
//                .newTab()
//                .setText("First")
//                .setTabListener(
//                        new FragmentTabListener<FirstFragment>(R.id.frameLayout, this, "first",
//                                FirstFragment.class));
//
//        actionBar.addTab(tab1);
//        actionBar.selectTab(tab1);
//
//        ActionBar.Tab tab2 = actionBar
//                .newTab()
//                .setText("Second")
//                .setTabListener(
//                        new FragmentTabListener<SecondFragment>(R.id.frameLayout, this, "second",
//                                SecondFragment.class));
//
//        actionBar.addTab(tab2);
//    }


    private void tabActionBar() {


        ActionBar actionBar;
        Fragment f1 = new FirstFragment();
        Fragment f2 = new SecondFragment();

        actionBar = getSupportActionBar();
       // actionBar.setTitle("");
        actionBar.setDisplayShowTitleEnabled(true);// ñ
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab = actionBar.newTab().setText("first");
        ActionBar.Tab tab1 = actionBar.newTab().setText("second");


        android.support.v7.app.ActionBar.TabListener tabListener = new FragmentTabListener<FirstFragment>(f1,R.id.frameLayout, this, "first",
                FirstFragment.class);

        android.support.v7.app.ActionBar.TabListener tabListener2 = new FragmentTabListener<SecondFragment>(f2,R.id.frameLayout, this, "second",
                SecondFragment.class);

        tab.setTabListener((ActionBar.TabListener) tabListener);
        tab1.setTabListener((ActionBar.TabListener) tabListener2);


        actionBar.addTab(tab);
        actionBar.addTab(tab1);

    }


}

