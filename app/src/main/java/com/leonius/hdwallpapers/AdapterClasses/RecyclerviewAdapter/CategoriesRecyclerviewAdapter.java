package com.leonius.hdwallpapers.AdapterClasses.RecyclerviewAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leonius.hdwallpapers.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/*
 * Created by saiteja prasadam on 1/5/2017.
 */

public class CategoriesRecyclerviewAdapter extends RecyclerView.Adapter<CategoriesRecyclerviewAdapter.CategoriesViewHolder>{

    private final LayoutInflater inflater;

    public CategoriesRecyclerviewAdapter(final Context context){
        inflater = LayoutInflater.from(context);
    }

    @Override
    public CategoriesRecyclerviewAdapter.CategoriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CategoriesViewHolder(inflater.inflate(R.layout.activity_recyclerview_categories, parent, false));
    }

    @Override
    public void onBindViewHolder(CategoriesRecyclerviewAdapter.CategoriesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class CategoriesViewHolder extends RecyclerView.ViewHolder{

        public CategoriesViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
