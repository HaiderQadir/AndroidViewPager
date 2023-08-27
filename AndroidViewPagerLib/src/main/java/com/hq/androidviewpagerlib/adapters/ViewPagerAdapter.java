package com.hq.androidviewpagerlib.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * @author Haider Qadir
 **/
public class ViewPagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragment = new ArrayList<Fragment>();

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragment.get(position);
    }

    @Override
    public int getCount() {
        return fragment.size();
    }

    public void addFragment(Fragment fm) {
        fragment.add(fm);
    }
}
