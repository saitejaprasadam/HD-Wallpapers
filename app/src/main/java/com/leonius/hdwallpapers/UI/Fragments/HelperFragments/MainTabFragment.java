package com.leonius.hdwallpapers.UI.Fragments.HelperFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leonius.hdwallpapers.R;
import com.leonius.hdwallpapers.UI.Fragments.CurrentWallpaperFragment;


/*
 * Created by saiteja prasadam on 12/27/2016.
 */

public class MainTabFragment extends Fragment{

    public TabLayout tabLayout;
    public ViewPager viewPager;
    public final int int_items = 1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, final Bundle savedInstanceState) {

        View x =  inflater.inflate(R.layout.fragment_main_tab_layout, null);
        tabLayout = (TabLayout) x.findViewById(R.id.tabs);
        viewPager = (ViewPager) x.findViewById(R.id.viewpager);
        viewPager.setAdapter(new MyAdapter(getChildFragmentManager()));
        viewPager.setOffscreenPageLimit(3);

        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });

        if (savedInstanceState != null){
            viewPager.post(new Runnable() {
                @Override
                public void run() {
                    viewPager.setCurrentItem(savedInstanceState.getInt("viewPager_current_item"));
                }
            });
        }
        return x;
    }
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("viewPager_current_item", viewPager.getCurrentItem());
        super.onSaveInstanceState(savedInstanceState);
    }

    class MyAdapter extends FragmentPagerAdapter {

        private CurrentWallpaperFragment currentWallpaperFragment;

        public MyAdapter(FragmentManager fm) {
            super(fm);
            currentWallpaperFragment = new CurrentWallpaperFragment();
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0 : return currentWallpaperFragment;
            }
            return null;
        }
        public int getCount() {
            return int_items;
        }
        public CharSequence getPageTitle(int position) {

            try{
                switch (position){
                    case 0 :
                        return getContext().getResources().getString(R.string.current_wallpaper);

                    case 1 :
                        return getContext().getResources().getString(R.string.treding_wallpapers);
                }
            }

            catch (Exception e){
                return "wallpapers";
            }

            return null;
        }
    }
}