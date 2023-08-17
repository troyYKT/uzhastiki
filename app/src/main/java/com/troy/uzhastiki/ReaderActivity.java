package com.troy.uzhastiki;

import static android.content.ContentValues.TAG;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.graphics.text.LineBreaker;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


public class ReaderActivity extends AppCompatActivity {

    Dialog myDialog;
    int countert;
    int style;
    boolean switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);

        TextView story = findViewById(R.id.storyTextView);

        Intent intent = getIntent();
        if (intent != null) {
            story.setText(intent.getStringExtra("story"));
        }
        String titles = intent.getStringExtra("title");
        getSupportActionBar().setTitle(titles);


        int id = intent.getIntExtra("id",0);
        Log.d("id", String.valueOf(id));

        myDialog = new Dialog(this);
        myDialog.setContentView(R.layout.dialog_settings);

        Window window = myDialog.getWindow();
        WindowManager.LayoutParams wlp = window.getAttributes();
        wlp.gravity = Gravity.TOP| Gravity.END;
        wlp.y = 100;
        wlp.flags &= ~WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        window.setAttributes(wlp);

        Spinner shrift_spinner = (Spinner) myDialog.findViewById(R.id.shrift_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.shrift_array, R.layout.spinner_item);
        shrift_spinner.setAdapter(adapter);

        SharedPreferences myPrefs = this.getSharedPreferences("shrift", MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = myPrefs.edit();

        Typeface typeface = getResources().getFont(R.font.athelasregular);
        Typeface typeface2 = getResources().getFont(R.font.romicmedium);
        Typeface typeface3 = getResources().getFont(R.font.asul);
        Typeface typeface4 = getResources().getFont(R.font.literatabook);
        Typeface typeface5 = getResources().getFont(R.font.georgia);

        String myString = myPrefs.getString("Value","Romic"); // the value you want the
        switch (myString){
            case "Athelas":
                story.setTypeface(typeface);
                break;
            case "Romic":
                story.setTypeface(typeface2);
                break;
            case "Asul":
                story.setTypeface(typeface3);
                break;
            case "Liberata":
                story.setTypeface(typeface4);
                break;
            case "Georgia":
                story.setTypeface(typeface5);
                break;
        }
        shrift_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String val=shrift_spinner.getSelectedItem().toString();
                prefsEditor.putString("Value",val);
                prefsEditor.apply();
                switch (val){
                    case "Athelas":
                        story.setTypeface(typeface);
                        break;
                    case "Romic":
                        story.setTypeface(typeface2);
                        break;
                    case "Asul":
                        story.setTypeface(typeface3);
                        break;
                    case "Liberata":
                        story.setTypeface(typeface4);
                        break;
                    case "Georgia":
                        story.setTypeface(typeface5);
                        break;

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        ArrayAdapter<String> myAdap = (ArrayAdapter<String>) shrift_spinner.getAdapter();
        int spinnerPosition = myAdap.getPosition(myString);

        // set the default according to value
        shrift_spinner.setSelection(spinnerPosition);

        Button buttonPlus = (Button) myDialog.findViewById(R.id.buttonplus);
        Button buttonMinus = (Button) myDialog.findViewById(R.id.buttonminus);
        SharedPreferences sizePref = this.getSharedPreferences("size", MODE_PRIVATE);
        SharedPreferences.Editor prefsEdit = sizePref.edit();
        countert = sizePref.getInt("TextSize", 18);
        story.setTextSize(countert);

        buttonPlus.setBackgroundColor(getColor(R.color.color3));
        buttonMinus.setBackgroundColor(getColor(R.color.color3));
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countert= countert+2;
                String asd = String.valueOf(countert);
                Log.d(TAG, asd);

                story.setTextSize(countert);
                prefsEdit.putInt("TextSize",countert);
                prefsEdit.apply();
                countert = sizePref.getInt("TextSize", 18);
                if (countert>=40){
                    countert=39;
                }
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countert=countert-2;
                String asd = String.valueOf(countert);
                Log.d(TAG, asd);

                story.setTextSize(countert);
                prefsEdit.putInt("TextSize",countert);
                prefsEdit.apply();
                countert = sizePref.getInt("TextSize", 18);
                if (countert<=16){
                    countert=16;
                }
            }
        });

        ImageButton btn1 = (ImageButton) myDialog.findViewById(R.id.imageButton);
        ImageButton btn2 = (ImageButton) myDialog.findViewById(R.id.imageButton2);
        ImageButton btn3 = (ImageButton) myDialog.findViewById(R.id.imageButton3);

        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.constrlayout);
        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollView2);

        SharedPreferences stylePref = this.getSharedPreferences("style", MODE_PRIVATE);
        SharedPreferences.Editor prEdit = stylePref.edit();
        style = stylePref.getInt("TextStyle",1);

        switch (style){
            case 0:
                constraintLayout.setBackgroundResource(R.color.white);
                story.setTextColor(getColor(R.color.black));
                scrollView.setBackgroundResource(R.color.white);
                break;
            case 1:
                constraintLayout.setBackgroundResource(R.color.colorreader1);
                story.setTextColor(getColor(R.color.colorreader3));
                scrollView.setBackgroundResource(R.color.colorreader1);
                break;
            case 2:
                constraintLayout.setBackgroundResource(R.color.black);
                story.setTextColor(getColor(R.color.grey2));
                scrollView.setBackgroundResource(R.color.black);
                break;
        }

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prEdit.putInt("TextStyle",0);
                prEdit.apply();
                constraintLayout.setBackgroundResource(R.color.white);
                story.setTextColor(getColor(R.color.black));
                scrollView.setBackgroundResource(R.color.white);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prEdit.putInt("TextStyle",1);
                prEdit.apply();
                constraintLayout.setBackgroundResource(R.color.colorreader1);
                story.setTextColor(getColor(R.color.colorreader3));
                scrollView.setBackgroundResource(R.color.colorreader1);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prEdit.putInt("TextStyle",2);
                prEdit.apply();
                constraintLayout.setBackgroundResource(R.color.black);
                story.setTextColor(getColor(R.color.colorreader2));
                scrollView.setBackgroundResource(R.color.black);
            }
        });

        Switch swit = (Switch) myDialog.findViewById(R.id.switch1);
        if (Build.VERSION.SDK_INT < 29){
            swit.setVisibility(View.GONE);
        }
        SharedPreferences switchPref = this.getSharedPreferences("switch", MODE_PRIVATE);
        SharedPreferences.Editor switchEdit = switchPref.edit();
        switch1 = switchPref.getBoolean("switch",true);
        if (switch1){
            swit.setChecked(true);
            switchEdit.putBoolean("switch",true);
            switchEdit.apply();
            if (Build.VERSION.SDK_INT > 28){
                story.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
            }
        }else {
            swit.setChecked(false);
            switchEdit.putBoolean("switch",false);
            switchEdit.apply();
            if (Build.VERSION.SDK_INT > 28){
                story.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_NONE);
            }
        }
        swit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    switchEdit.putBoolean("switch",true);
                    switchEdit.apply();
                    if (Build.VERSION.SDK_INT > 28){
                        story.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
                    }
                }else {
                    switchEdit.putBoolean("switch",false);
                    switchEdit.apply();
                    if (Build.VERSION.SDK_INT > 28){
                        story.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_NONE);
                    }
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_settings){
            myDialog.show();
        }
        return super.onOptionsItemSelected(item);
    }
}
