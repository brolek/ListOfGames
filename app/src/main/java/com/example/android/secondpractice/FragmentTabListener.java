package com.example.android.secondpractice;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;


/**
 * Created by Bartek on 2016-07-21.
 */
public class FragmentTabListener<T extends Fragment> implements ActionBar.TabListener {
    private Fragment mFragment;
    private final FragmentActivity mActivity;
    private final String mTag;
    private final Class<T> mClass;
    private final int mfragmentContainerId;
    private final Bundle mfragmentArgs;

    // This version defaults to replacing the entire activity content area
    // new FragmentTabListener<SomeFragment>(this, "first", SomeFragment.class))
    public FragmentTabListener(FragmentActivity activity, String tag, Class<T> clz) {
        mActivity = activity;
        mTag = tag;
        mClass = clz;
        mfragmentContainerId = android.R.id.content;
        mfragmentArgs = new Bundle();
    }

    // This version supports specifying the container to replace with fragment content
    // new FragmentTabListener<SomeFragment>(R.id.flContent, this, "first", SomeFragment.class))
    public FragmentTabListener(Fragment mFragment,int fragmentContainerId, FragmentActivity activity,
                               String tag, Class<T> clz) {
        mActivity = activity;
        mTag = tag;
        mClass = clz;
        mfragmentContainerId = fragmentContainerId;
        mfragmentArgs = new Bundle();
        this.mFragment = mFragment;
    }

    // This version supports specifying the container to replace with fragment content and fragment args
    // new FragmentTabListener<SomeFragment>(R.id.flContent, this, "first", SomeFragment.class, myFragmentArgs))
    public FragmentTabListener(int fragmentContainerId, FragmentActivity activity,
                               String tag, Class<T> clz, Bundle args) {
        mActivity = activity;
        mTag = tag;
        mClass = clz;
        mfragmentContainerId = fragmentContainerId;
        mfragmentArgs = args;
    }

    /* The following are each of the ActionBar.TabListener callbacks */

//    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
//        FragmentTransaction sft = mActivity.getSupportFragmentManager().beginTransaction();
//        // Check if the fragment is already initialized
//        if (mFragment == null) {
//            // If not, instantiate and add it to the activity
//            mFragment = Fragment.instantiate(mActivity, mClass.getName(), mfragmentArgs);
//            sft.add(mfragmentContainerId, mFragment, mTag);
//        } else {
//            // If it exists, simply attach it in order to show it
//            sft.attach(mFragment);
//        }
//        sft.commit();
//    }
//
//    public void onTabUnselected(ActionBar.Tab tab, android.app.FragmentTransaction ft) {
//        FragmentTransaction sft = mActivity.getSupportFragmentManager().beginTransaction();
//        if (mFragment != null) {
//            // Detach the fragment, because another one is being attached
//            sft.detach(mFragment);
//        }
//        sft.commit();
//    }
//
//    public void onTabReselected(ActionBar.Tab tab, android.app.FragmentTransaction ft) {
//        // User selected the already selected tab. Usually do nothing.
//    }

    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft){
        ft.add(R.id.frameLayout,mFragment, null);
    }
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.remove(mFragment);
    }
}