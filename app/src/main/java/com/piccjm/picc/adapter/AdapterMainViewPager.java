package com.piccjm.picc.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mangowangwang on 2017/9/28.
 */

public class AdapterMainViewPager extends FragmentPagerAdapter {

    private List<Fragment> fragmentList = new ArrayList<>();

    public AdapterMainViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
    public void addFragment(Fragment fragment)
    {
        fragmentList.add(fragment);
    }
}
