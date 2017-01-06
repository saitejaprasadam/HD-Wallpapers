package com.leonius.hdwallpapers.UI.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leonius.hdwallpapers.AdapterClasses.RecyclerviewAdapter.CategoriesRecyclerviewAdapter;
import com.leonius.hdwallpapers.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/*
 * Created by saiteja prasadam on 12/27/2016.
 */

public class HomeFragment extends Fragment {

    private View rootView;
    @BindView(R.id.cat_recycler_view) RecyclerView recyclerView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_home_layout, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        CategoriesRecyclerviewAdapter categoriesRecyclerviewAdapter = new CategoriesRecyclerviewAdapter(getContext());
        recyclerView.setAdapter(categoriesRecyclerviewAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false));
    }
}
