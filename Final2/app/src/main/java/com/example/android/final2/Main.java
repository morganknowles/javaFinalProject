package com.example.android.final2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
/**
 * Created by Morgan
 * 10/20/16
 * Android Studio
 * Intro to Java Final Project
 */

/**
 * This app has a main activity where it gives the user three options of new things to learn.
 */
public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    /**
     * This method is called when user selects height button. Starts height activity.
     */
    public void goToHeight(View view) {
        Intent myIntent = new Intent(Main.this, Height.class);
        startActivity(myIntent);
    }

    /**
     * This method is called when user selects facts button. Starts facts activity.
     */
    public void goToFacts(View view) {
        Intent myIntent = new Intent(Main.this, Facts.class);
        startActivity(myIntent);
    }

    /**
     * This method is called when user selects commute button. Starts commute activity.
     */
    public void goToCommute(View view) {
        Intent myIntent = new Intent(Main.this, Commute.class);
        startActivity(myIntent);
    }


}
