package com.troy.uzhastiki;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        ArrayList<UzhastikItem> UzhastikItemsItems = new ArrayList<>();

        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_73_TITLE, Utils.STORY_73,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_74_TITLE, Utils.STORY_74,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_75_TITLE, Utils.STORY_75,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_76_TITLE, Utils.STORY_76,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_110_TITLE, Utils.STORY_110,false));



        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new UzhastikAdapter(UzhastikItemsItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}

