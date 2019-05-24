package com.example.android.melloncollie;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content view to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the View by id for each category
        TextView aboutMellonCollie = findViewById(R.id.about_mellon_collie);
        TextView smashingPumpkins = findViewById(R.id.smashing_pumpkins);
        TextView trackList = findViewById(R.id.track_list);

        //Set a click listener on the about_mellon_collie View
        aboutMellonCollie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutMellonCollieIntent = new Intent (MainActivity.this, About.class);
                startActivity(aboutMellonCollieIntent);
            }
        });

        //Set a click listener on the smashing pumpkins View
        smashingPumpkins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smashingPumpkinsIntent = new Intent (MainActivity.this, SmashingPumpkins.class);
                startActivity(smashingPumpkinsIntent);
            }
        });

        //Set a click listener on the track listings View
        trackList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trackListIntent = new Intent (MainActivity.this, TrackList.class);
                startActivity(trackListIntent);
            }
        });

        //Set a click listener on the buy button, to launch a browser with custom search
        findViewById(R.id.buy_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.co.uk/search?tbm=shop&q=mellon+collie+and+the+infinite+sadness&tbs=vw:l,mr:1,new:1,root_cat:532055&sa=X&ved=0ahUKEwjmhaPL3rHiAhWEThUIHeaIDC8QvSsIkgIoAA&biw=1920&bih=920";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


    }
}
