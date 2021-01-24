package com.troy.uzhastiki;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ActionBar actionBar= this.getSupportActionBar();
        if (actionBar!= null ){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id= item.getItemId();
        if (id == android.R.id.home){
            NavUtils.navigateUpFromSameTask(this);
        }

        return super.onOptionsItemSelected(item);
    }

    public void rateBtnClick(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.troy.uzhastiki"));
        startActivity(i);
    }

    public void mailBtnClick(View view) {
        String[] emails;
        String[] emailsCC;
        String[] emailsBCC;

        emails = new String[]{ "troyan899@gmail.com"};



        String mailSubject = "Ужастики";
        String mailBody    = "Текст сообщения";

        // Initialize a new Intent
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.putExtra(Intent.EXTRA_EMAIL, emails);

        // Define the email cc and bcc


        intent.putExtra(Intent.EXTRA_SUBJECT, mailSubject);

        intent.putExtra(Intent.EXTRA_TEXT,mailBody);

        // For only email app should handle this intent
        intent.setData(Uri.parse("mailto:"));

        // Try to start the activity
        if (intent.resolveActivity(
                getPackageManager()) != null) {
            startActivity(intent);
            Toast.makeText(this, "Send email.",
                    Toast.LENGTH_SHORT).show();
        } else {
            // If there are no email client installed
            // in this device
            String err;
            err="No email client installed in this device.";
            Toast.makeText(this, err,
                    Toast.LENGTH_SHORT).show();
        }
    }
    }
