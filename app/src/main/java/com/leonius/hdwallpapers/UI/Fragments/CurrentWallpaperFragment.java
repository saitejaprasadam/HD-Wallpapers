package com.leonius.hdwallpapers.UI.Fragments;

import android.app.WallpaperManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.leonius.hdwallpapers.R;

/*
 * Created by saiteja prasadam on 12/27/2016.
 */

public class CurrentWallpaperFragment extends Fragment {

    private View rootView;
    private ImageView lockScreenImageView, homeScreenImageView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_current_wallpaper, container, false);
        homeScreenImageView = (ImageView) rootView.findViewById(R.id.home_screen_wallpaper_image_view);
        homeScreenImageView.setImageDrawable(WallpaperManager.getInstance(getContext()).getDrawable());

        lockScreenImageView = (ImageView) rootView.findViewById(R.id.lock_screen_wallpaper_image_view);
        lockScreenImageView.setImageDrawable(Drawable.createFromPath("/data/data/com.android.settings/files/wallpaper"));
        return rootView;
    }
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
