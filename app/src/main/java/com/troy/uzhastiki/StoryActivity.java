package com.troy.uzhastiki;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;

public class StoryActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        ArrayList<UzhastikItem> UzhastikItemsItems = new ArrayList<>();

        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_1_TITLE, Utils.STORY_1,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_2_TITLE, Utils.STORY_2,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_3_TITLE, Utils.STORY_3,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_4_TITLE, Utils.STORY_4,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_5_TITLE, Utils.STORY_5,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_6_TITLE, Utils.STORY_6,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_7_TITLE, Utils.STORY_7,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_8_TITLE, Utils.STORY_8,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_9_TITLE, Utils.STORY_9,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_10_TITLE, Utils.STORY_10,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_11_TITLE, Utils.STORY_11,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_12_TITLE, Utils.STORY_12,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_13_TITLE, Utils.STORY_13,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_14_TITLE, Utils.STORY_14,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_15_TITLE, Utils.STORY_15,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_16_TITLE, Utils.STORY_16,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_17_TITLE, Utils.STORY_17,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_18_TITLE, Utils.STORY_18,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_19_TITLE, Utils.STORY_19,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_20_TITLE, Utils.STORY_20,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_21_TITLE, Utils.STORY_21,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_22_TITLE, Utils.STORY_22,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_23_TITLE, Utils.STORY_23,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_24_TITLE, Utils.STORY_24,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_25_TITLE, Utils.STORY_25,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_26_TITLE, Utils.STORY_26,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_27_TITLE, Utils.STORY_27,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_28_TITLE, Utils.STORY_28,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_29_TITLE, Utils.STORY_29,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_30_TITLE, Utils.STORY_30,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_31_TITLE, Utils.STORY_31,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_32_TITLE, Utils.STORY_32,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_33_TITLE, Utils.STORY_33,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_34_TITLE, Utils.STORY_34,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_35_TITLE, Utils.STORY_35,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_36_TITLE, Utils.STORY_36,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_37_TITLE, Utils.STORY_37,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_38_TITLE, Utils.STORY_38,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_39_TITLE, Utils.STORY_39,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_40_TITLE, Utils.STORY_40,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_41_TITLE, Utils.STORY_41,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_42_TITLE, Utils.STORY_42,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_43_TITLE, Utils.STORY_43,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_44_TITLE, Utils.STORY_44,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_45_TITLE, Utils.STORY_45,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_46_TITLE, Utils.STORY_46,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_47_TITLE, Utils.STORY_47,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_48_TITLE, Utils.STORY_48,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_49_TITLE, Utils.STORY_49,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_50_TITLE, Utils.STORY_50,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_51_TITLE, Utils.STORY_51,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_52_TITLE, Utils.STORY_52,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_53_TITLE, Utils.STORY_53,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_54_TITLE, Utils.STORY_54,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_55_TITLE, Utils.STORY_55,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_56_TITLE, Utils.STORY_56,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_57_TITLE, Utils.STORY_57,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_58_TITLE, Utils.STORY_58,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_59_TITLE, Utils.STORY_59,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_60_TITLE, Utils.STORY_60,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_61_TITLE, Utils.STORY_61,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_62_TITLE, Utils.STORY_62,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_63_TITLE, Utils.STORY_63,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_64_TITLE, Utils.STORY_64,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_65_TITLE, Utils.STORY_65,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_66_TITLE, Utils.STORY_66,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_67_TITLE, Utils.STORY_67,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_68_TITLE, Utils.STORY_68,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_69_TITLE, Utils.STORY_69,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_70_TITLE, Utils.STORY_70,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_71_TITLE, Utils.STORY_71,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_72_TITLE, Utils.STORY_72,false));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new UzhastikAdapter(UzhastikItemsItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}