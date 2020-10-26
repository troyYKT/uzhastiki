package com.troy.uzhastiki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<UzhastikItem> UzhastikItemsItems = new ArrayList<>();

        UzhastikItemsItems.add(new UzhastikItem(R.drawable.pizza_1,
                Utils.PIZZA_1_TITLE, Utils.PIZZA_1_DESCRIPTION,
                Utils.PIZZA_1_RECIPE));
        UzhastikItemsItems.add(new UzhastikItem(R.drawable.pizza_2,
                Utils.PIZZA_2_TITLE, Utils.PIZZA_2_DESCRIPTION,
                Utils.PIZZA_2_RECIPE));
        UzhastikItemsItems.add(new UzhastikItem(R.drawable.pizza_3,
                Utils.PIZZA_3_TITLE, Utils.PIZZA_3_DESCRIPTION,
                Utils.PIZZA_3_RECIPE));
        UzhastikItemsItems.add(new UzhastikItem(R.drawable.pizza_4,
                Utils.PIZZA_4_TITLE, Utils.PIZZA_4_DESCRIPTION,
                Utils.PIZZA_4_RECIPE));
        UzhastikItemsItems.add(new UzhastikItem(R.drawable.pizza_5,
                Utils.PIZZA_5_TITLE, Utils.PIZZA_5_DESCRIPTION,
                Utils.PIZZA_5_RECIPE));
        UzhastikItemsItems.add(new UzhastikItem(R.drawable.pizza_6,
                Utils.PIZZA_6_TITLE, Utils.PIZZA_6_DESCRIPTION,
                Utils.PIZZA_6_RECIPE));
        UzhastikItemsItems.add(new UzhastikItem(R.drawable.pizza_7,
                Utils.PIZZA_7_TITLE, Utils.PIZZA_7_DESCRIPTION,
                Utils.PIZZA_7_RECIPE));
        UzhastikItemsItems.add(new UzhastikItem(R.drawable.pizza_8,
                Utils.PIZZA_8_TITLE, Utils.PIZZA_8_DESCRIPTION,
                Utils.PIZZA_8_RECIPE));
        UzhastikItemsItems.add(new UzhastikItem(R.drawable.pizza_9,
                Utils.PIZZA_9_TITLE, Utils.PIZZA_9_DESCRIPTION,
                Utils.PIZZA_9_RECIPE));
        UzhastikItemsItems.add(new UzhastikItem(R.drawable.pizza_10,
                Utils.PIZZA_10_TITLE, Utils.PIZZA_10_DESCRIPTION,
                Utils.PIZZA_10_RECIPE));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new UzhastikAdapter(UzhastikItemsItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
