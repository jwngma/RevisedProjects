package com.practice.reviseproject.Viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new PagerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("count", i + 1);
        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public int getCount() {
        return 51;
    }
}
