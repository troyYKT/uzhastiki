package com.troy.uzhastiki;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.TypedValue;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Objects;


public class ReaderActivity extends AppCompatActivity {
    AdView mAdView;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);
        Objects.requireNonNull(getSupportActionBar()).hide();

        mAdView = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        TextView recipe = findViewById(R.id.storyTextView);

        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String fontSize = sharedPreferences.getString("text_size","Medium");
        switch (fontSize) {
            case "Medium":
                recipe.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
                break;
            case "Big":
                recipe.setTextSize(TypedValue.COMPLEX_UNIT_SP, 26);
                break;
            case "Small":
                recipe.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
                break;
        }
        String fontStyle = sharedPreferences.getString("text_style","normal");
        switch (fontStyle) {
            case "normal":
                recipe.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
                break;
            case "bold":
                recipe.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case "italic":
                recipe.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                break;
        }





        Intent intent = getIntent();
        if (intent != null) {

            recipe.setText(intent.getStringExtra("recipe"));
        }
    }
}
