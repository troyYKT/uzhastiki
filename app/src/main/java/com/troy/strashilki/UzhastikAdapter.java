package com.troy.strashilki;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UzhastikAdapter extends RecyclerView.Adapter<UzhastikAdapter.UzhastikViewHolder> {

    ArrayList<UzhastikItem> UzhastikItemsItems;
    Context context;

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
    public void onBindViewHolder(@NonNull UzhastikViewHolder viewHolder, int i) {
        UzhastikItem uzhastikItem = UzhastikItemsItems.get(i);


        viewHolder.title.setText(uzhastikItem.getTitle());

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

            int position = getAdapterPosition();
            UzhastikItem uzhastikItem = UzhastikItemsItems.get(position);


            Intent intent = new Intent(context, ReaderActivity.class);

            intent.putExtra("title", uzhastikItem.getTitle());

            intent.putExtra("recipe", uzhastikItem.getRecipe());
            context.startActivity(intent);
        }
    }


}
