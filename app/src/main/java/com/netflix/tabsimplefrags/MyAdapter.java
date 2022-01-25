package com.netflix.tabsimplefrags;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class MyAdapter extends FragmentPagerAdapter {
    Context context;
    int totalTabs;
    public MyAdapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Tab1 tab1Fragment = new Tab1();
                return tab1Fragment;
            case 1:
                Tab2 tab2Fragment = new Tab2();
                return tab2Fragment;
            case 2:
                Tab3 tab3Fragment = new Tab3();
                return tab3Fragment;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}