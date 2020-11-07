package com.troy.uzhastiki;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);





        ArrayList<UzhastikItem> UzhastikItemsItems = new ArrayList<>();

        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_1_TITLE,Utils.STORY_1));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_2_TITLE,Utils.STORY_2));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_3_TITLE,Utils.STORY_3));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_4_TITLE,Utils.STORY_4));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_5_TITLE,Utils.STORY_5));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_6_TITLE,Utils.STORY_6));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_7_TITLE,Utils.STORY_7));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_8_TITLE,Utils.STORY_8));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_9_TITLE,Utils.STORY_9));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_10_TITLE,Utils.STORY_10));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_11_TITLE,Utils.STORY_11));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_12_TITLE,Utils.STORY_12));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_13_TITLE,Utils.STORY_13));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_14_TITLE,Utils.STORY_14));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_15_TITLE,Utils.STORY_15));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_16_TITLE,Utils.STORY_16));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_17_TITLE,Utils.STORY_17));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_18_TITLE,Utils.STORY_18));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_19_TITLE,Utils.STORY_19));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_20_TITLE,Utils.STORY_20));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_21_TITLE,Utils.STORY_21));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_22_TITLE,Utils.STORY_22));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_23_TITLE,Utils.STORY_23));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_24_TITLE,Utils.STORY_24));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_25_TITLE,Utils.STORY_25));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_26_TITLE,Utils.STORY_26));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_27_TITLE,Utils.STORY_27));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_28_TITLE,Utils.STORY_28));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_29_TITLE,Utils.STORY_29));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_30_TITLE,Utils.STORY_30));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_31_TITLE,Utils.STORY_31));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_32_TITLE,Utils.STORY_32));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_33_TITLE,Utils.STORY_33));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_34_TITLE,Utils.STORY_34));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_35_TITLE,Utils.STORY_35));



        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new UzhastikAdapter(UzhastikItemsItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);


    }

}
