package com.troy.uzhastiki;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.TypedValue;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;


public class ReaderActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);
        Objects.requireNonNull(getSupportActionBar()).hide();

        TextView story = findViewById(R.id.storyTextView);

        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String fontSize = sharedPreferences.getString("text_size","Medium");
        switch (fontSize) {
            case "Medium":
                story.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
                break;
            case "Big":
                story.setTextSize(TypedValue.COMPLEX_UNIT_SP, 26);
                break;
            case "Small":
                story.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
                break;
        }
        String fontStyle = sharedPreferences.getString("text_style","normal");
        switch (fontStyle) {
            case "normal":
                story.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
                break;
            case "bold":
                story.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case "italic":
                story.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                break;
        }
        Intent intent = getIntent();
        if (intent != null) {
            story.setText(intent.getStringExtra("story"));
        }
    }
}
