package com.ranzan.unit31sprint_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private ArrayList<NowShowingItem> list;
    private ItemClickListener listener;

    public RecyclerAdapter(ArrayList<NowShowingItem> list, ItemClickListener listener) {
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        NowShowingItem nowShowingItem = new NowShowingItem();
        holder.setData(nowShowingItem);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    void updateUi(ArrayList<NowShowingItem> list) {
        this.list = list;
        notifyDataSetChanged();
    }
}
