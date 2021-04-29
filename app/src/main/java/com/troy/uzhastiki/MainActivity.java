package com.troy.uzhastiki;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import static androidx.recyclerview.widget.RecyclerView.Adapter;
import static androidx.recyclerview.widget.RecyclerView.LayoutManager;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    LayoutManager layoutManager;
    private InterstitialAd mInterstitialAd;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent openSettings =
                    new Intent(this, SettingsActivity.class);
            startActivity(openSettings);
            return true;
        }
        else if
        (id == R.id.action_about) {
            Intent openAbout = new Intent(this, AboutActivity.class);
            startActivity(openAbout);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //инициализация рекламы
        MobileAds.initialize(this, initializationStatus -> {
        });

        ArrayList<UzhastikItem> UzhastikItemsItems = new ArrayList<>();

        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_1_TITLE, Utils.STORY_1));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_2_TITLE, Utils.STORY_2));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_3_TITLE, Utils.STORY_3));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_4_TITLE, Utils.STORY_4));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_5_TITLE, Utils.STORY_5));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_6_TITLE, Utils.STORY_6));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_7_TITLE, Utils.STORY_7));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_8_TITLE, Utils.STORY_8));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_9_TITLE, Utils.STORY_9));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_10_TITLE, Utils.STORY_10));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_11_TITLE, Utils.STORY_11));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_12_TITLE, Utils.STORY_12));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_13_TITLE, Utils.STORY_13));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_14_TITLE, Utils.STORY_14));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_15_TITLE, Utils.STORY_15));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_16_TITLE, Utils.STORY_16));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_17_TITLE, Utils.STORY_17));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_18_TITLE, Utils.STORY_18));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_19_TITLE, Utils.STORY_19));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_20_TITLE, Utils.STORY_20));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_21_TITLE, Utils.STORY_21));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_22_TITLE, Utils.STORY_22));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_23_TITLE, Utils.STORY_23));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_24_TITLE, Utils.STORY_24));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_25_TITLE, Utils.STORY_25));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_26_TITLE, Utils.STORY_26));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_27_TITLE, Utils.STORY_27));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_28_TITLE, Utils.STORY_28));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_29_TITLE, Utils.STORY_29));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_30_TITLE, Utils.STORY_30));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_31_TITLE, Utils.STORY_31));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_32_TITLE, Utils.STORY_32));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_33_TITLE, Utils.STORY_33));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_34_TITLE, Utils.STORY_34));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_35_TITLE, Utils.STORY_35));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_36_TITLE, Utils.STORY_36));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_37_TITLE, Utils.STORY_37));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_38_TITLE, Utils.STORY_38));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_39_TITLE, Utils.STORY_39));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_40_TITLE, Utils.STORY_40));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_41_TITLE, Utils.STORY_41));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_42_TITLE, Utils.STORY_42));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_43_TITLE, Utils.STORY_43));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_44_TITLE, Utils.STORY_44));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_45_TITLE, Utils.STORY_45));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_46_TITLE, Utils.STORY_46));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_47_TITLE, Utils.STORY_47));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_48_TITLE, Utils.STORY_48));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_49_TITLE, Utils.STORY_49));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_50_TITLE, Utils.STORY_50));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_51_TITLE, Utils.STORY_51));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_52_TITLE, Utils.STORY_52));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_53_TITLE, Utils.STORY_53));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_54_TITLE, Utils.STORY_54));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_55_TITLE, Utils.STORY_55));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_56_TITLE, Utils.STORY_56));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_57_TITLE, Utils.STORY_57));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_58_TITLE, Utils.STORY_58));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_59_TITLE, Utils.STORY_59));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_60_TITLE, Utils.STORY_60));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_61_TITLE, Utils.STORY_61));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_62_TITLE, Utils.STORY_62));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_63_TITLE, Utils.STORY_63));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_64_TITLE, Utils.STORY_64));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_65_TITLE, Utils.STORY_65));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_66_TITLE, Utils.STORY_66));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_67_TITLE, Utils.STORY_67));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_68_TITLE, Utils.STORY_68));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_69_TITLE, Utils.STORY_69));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_70_TITLE, Utils.STORY_70));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_71_TITLE, Utils.STORY_71));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_72_TITLE, Utils.STORY_72));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new UzhastikAdapter(UzhastikItemsItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}


