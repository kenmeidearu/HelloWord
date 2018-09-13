package com.kenjin.helloword.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.kenjin.helloword.model.Presiden;
import com.kenjin.helloword.R;

import java.util.ArrayList;

public class GridPresidenAdapter extends RecyclerView.Adapter<GridPresidenAdapter.GridViewHolder> {
    private Context context;
    private ArrayList<Presiden>listPresiden;

    public ArrayList<Presiden> getListPresident() {
        return listPresiden;
    }

    public void setListPresident(ArrayList<Presiden> listPresident) {
        this.listPresiden = listPresident;
    }

    public GridPresidenAdapter(Context context) {
        this.context = context;
    }

    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, parent, false);
        GridViewHolder gridViewHolder = new GridViewHolder(view);
        return gridViewHolder;
    }

    @Override
    public void onBindViewHolder(GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListPresident().get(position).getPhoto())
                .override(350, 550)
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListPresident().size();
    }
    public class GridViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        public GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
        }
    }
}
