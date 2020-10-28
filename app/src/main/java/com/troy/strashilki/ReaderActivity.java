package com.troy.strashilki;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class ReaderActivity extends AppCompatActivity {
    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);
        getSupportActionBar().hide();

        mAdView = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        TextView title = findViewById(R.id.titleTextView);
        TextView recipe = findViewById(R.id.storyTextView);

        Intent intent = getIntent();
        if (intent != null) {

            recipe.setText(intent.getStringExtra("recipe"));
        }
    }
}
