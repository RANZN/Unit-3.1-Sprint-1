package com.ranzan.unit31sprint_1;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private View view;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        view = itemView;
        imageView = itemView.findViewById(R.id.recyclerViewImage);
    }

    void setData(NowShowingItem nowShowingItem) {
        Glide.with(view).load(nowShowingItem.getPosterurl()).into(imageView);
    }
}
