package com.kenjin.helloword.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.kenjin.helloword.model.Presiden;
import com.kenjin.helloword.R;

import java.util.ArrayList;

public class ListPresidenAdapter extends  RecyclerView.Adapter<ListPresidenAdapter.CategoryViewHolder>{
    private Context context;
    private ArrayList<Presiden> listPresiden;

    public ArrayList<Presiden> getListPresident() {
        return listPresiden;
    }
    public void setListPresident(ArrayList<Presiden> listPresident) {
        this.listPresiden = listPresident;
    }
    public ListPresidenAdapter(Context context) {
        this.context = context;
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;
        public CategoryViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView)itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
        }
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent,
                false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {

        holder.tvName.setText(getListPresident().get(position).getName());
        holder.tvRemarks.setText(getListPresident().get(position).getRemarks());

        Glide.with(context)
                .load(getListPresident().get(position).getPhoto())
                .override(55, 55)
                .crossFade()
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListPresident().size();
    }


}