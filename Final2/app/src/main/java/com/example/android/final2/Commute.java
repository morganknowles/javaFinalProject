package com.example.android.final2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.final2.R.id.commuteOutput;


/**
 * Created by Morgan
 * 10/20/16
 * Android Studio
 * Intro to Java Final Project
 */

/**
 * In the commute activity the user enters the minutes that it takes to get to work and it is compared with the average.
 */
public class Commute extends AppCompatActivity {
    final int AVERAGE_COMMUTE = 26; //average commute time
    int quantity;//the user's commute minutes
    int i = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commute_activity);

    }

    /**
     * This method is called when the plus button is clicked. Increments quantity.
     */
    public void increment(View view) {
        ++quantity;
        display(quantity);
        compareCommute(quantity);
    }

    /**
     * This method is called when the minus button is clicked. Decrements quantity.
     */
    public void decrement(View view) {
        --quantity;
        display(quantity);
        compareCommute(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.commuteTime);
        quantityTextView.setText("" + number);
    }

    /**
     * This method compares users commute time to the average.
     */
    public void compareCommute(int temp) {
        if (temp < AVERAGE_COMMUTE) {
            int lessTemp;
            lessTemp = AVERAGE_COMMUTE - temp;
            displayLess(lessTemp);

        } else if (temp > AVERAGE_COMMUTE) {
            int greatTemp;
            greatTemp = temp - AVERAGE_COMMUTE;
            displayGreat(greatTemp);

        }
    }

    /**
     * Displays the difference between users commute and average.
     */
    private void displayLess(int number) {
        TextView commuteTextView = (TextView) findViewById(R.id.commuteOutput);
        commuteTextView.setText("Your commute is " + number + " minutes less than the average American's.");

    }

    /**
     * Displays the difference between users commute and average.
     */
    private void displayGreat(int number) {
        TextView commuteTextView = (TextView) findViewById(R.id.commuteOutput);
        commuteTextView.setText("Your commute is " + number + " minutes more than the average American's.");

    }


}