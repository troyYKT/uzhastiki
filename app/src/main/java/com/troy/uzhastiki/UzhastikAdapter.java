package com.troy.uzhastiki;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class UzhastikAdapter extends RecyclerView.Adapter<UzhastikAdapter.UzhastikViewHolder> {

    ArrayList<UzhastikItem> UzhastikItemsItems;
    Context context;
    boolean hide;
    boolean isreaded;
    public UzhastikAdapter(ArrayList<UzhastikItem> uzhastikItemsItems,
                           Context context) {
        this.UzhastikItemsItems = uzhastikItemsItems;
        this.context = context;
    }
    @NonNull
    @Override
    public UzhastikAdapter.UzhastikViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uzhastik_item,
                viewGroup, false);
        UzhastikViewHolder uzhastikViewHolder = new UzhastikViewHolder(view);
        return uzhastikViewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull UzhastikViewHolder viewHolder, int position) {

        UzhastikItem uzhastikItem = UzhastikItemsItems.get(viewHolder.getAdapterPosition());
        viewHolder.title.setText(uzhastikItem.getTitle());

        SharedPreferences stylePref = context.getSharedPreferences("isread", MODE_PRIVATE);
        SharedPreferences.Editor prEdit = stylePref.edit();

        int id = UzhastikItemsItems.get(viewHolder.getAdapterPosition()).getId();
        boolean readed = stylePref.getBoolean("position"+ id,false);
        if (readed){
            viewHolder.title.setTextColor(ContextCompat.getColor(context,R.color.grey));
        }else {
            viewHolder.title.setTextColor(ContextCompat.getColor(context,R.color.white));
        }
        SharedPreferences checkPref = context.getSharedPreferences("hide", MODE_PRIVATE);
        hide = checkPref.getBoolean("checkbox",false);
        if (hide){
            if (readed){
                viewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            }
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prEdit.putBoolean("position"+ id,true);
                prEdit.apply();
                isreaded=true;
                if (isreaded){
                    viewHolder.title.setTextColor(ContextCompat.getColor(context,R.color.grey));
                    //Intent intent = new Intent(mContext, MainActivity.class);
                    //mContext.startActivity(intent);
                }else {
                    viewHolder.title.setTextColor(ContextCompat.getColor(context,R.color.white));
                }
                notifyItemChanged(viewHolder.getAdapterPosition());
                viewHolder.onStartAct();
            }
        });
    }
    @Override
    public int getItemCount() {
        return UzhastikItemsItems.size();
    }
    class UzhastikViewHolder extends RecyclerView.ViewHolder implements
            View.OnClickListener {
        public TextView title;
        public UzhastikViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            title = itemView.findViewById(R.id.titleTextView);
        }
        @Override
        public void onClick(View v) {
            onStartAct();

        }
        public void onStartAct(){
            int position = getAdapterPosition();
            UzhastikItem uzhastikItem = UzhastikItemsItems.get(getAdapterPosition());
            Intent intent = new Intent(context, ReaderActivity.class);
            intent.putExtra("title", uzhastikItem.getTitle());
            intent.putExtra("story", uzhastikItem.getStory());
            intent.putExtra("id", uzhastikItem.getId());
            context.startActivity(intent);
        }
    }
}