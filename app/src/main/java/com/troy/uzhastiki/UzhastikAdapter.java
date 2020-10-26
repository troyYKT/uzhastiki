package com.troy.uzhastiki;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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

        viewHolder.pizzaImageView.setImageResource(uzhastikItem.getImageResource());
        viewHolder.title.setText(uzhastikItem.getTitle());
        viewHolder.description.setText(uzhastikItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return UzhastikItemsItems.size();
    }

    class UzhastikViewHolder extends RecyclerView.ViewHolder implements
            View.OnClickListener {

        public ImageView pizzaImageView;
        public TextView title;
        public TextView description;

        public UzhastikViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            pizzaImageView = itemView.findViewById(R.id.pizzaImageView);
            title = itemView.findViewById(R.id.titleTextView);
            description = itemView.findViewById(R.id.descriptionTextView);
        }

        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            UzhastikItem uzhastikItem = UzhastikItemsItems.get(position);


            Intent intent = new Intent(context, ReaderActivity.class);
            intent.putExtra("imageResource", uzhastikItem.getImageResource());
            intent.putExtra("title", uzhastikItem.getTitle());
            intent.putExtra("description", uzhastikItem.getDescription());
            intent.putExtra("recipe", uzhastikItem.getRecipe());
            context.startActivity(intent);
        }
    }


}
