package com.example.android.final2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Morgan
 * 10/20/16
 * Android Studio
 * Intro to Java Final Project
 */

/**
 * In the height activity the user enters their height and then it is compared to average men and women's heights.
 */
public class Height extends AppCompatActivity {
    int quantity = 60;//starting height, user decrements and increments
    int heightDifferenceMan;//stores the difference between AVG_MAN_HEIGHT and quantity
    int heightDifferenceWom;//stores the difference between AVG_WOM_HEIGHT and quantity
    int AVG_MAN_HEIGHT = 69;//average height of men
    int AVG_WOM_HEIGHT = 64;//average height of women


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.height_activity);
    }


    /**
     * This method is called when the plus button is clicked. Increments quantity.
     */
    public void increment(View view) {
        ++quantity;
        display(quantity);
        compareHeight(quantity);

    }


    /**
     * This method is called when the minus button is clicked. Decrements quantity.
     */

    public void decrement(View view) {
        --quantity;
        display(quantity);
        compareHeight(quantity);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int temp) {
        TextView heightTextView = (TextView) findViewById(R.id.height);
        heightTextView.setText("" + temp);

    }


    /**
     * This method compares users height to the average.
     */
    public void compareHeight(int temp) {

        if (temp < AVG_MAN_HEIGHT) {
            heightDifferenceMan = AVG_MAN_HEIGHT - temp;
            TextView manTextView = (TextView) findViewById(R.id.textViewMan);
            manTextView.setText(heightDifferenceMan + " less than average");

        } else if (temp >= AVG_MAN_HEIGHT) {
            heightDifferenceMan = temp - AVG_MAN_HEIGHT;
            TextView manTextView = (TextView) findViewById(R.id.textViewMan);
            manTextView.setText("" + heightDifferenceMan + " greater than average");
        }

        if (temp < AVG_WOM_HEIGHT) {
            heightDifferenceWom = AVG_WOM_HEIGHT - temp;
            TextView womTextView = (TextView) findViewById(R.id.textViewWom);
            womTextView.setText(" " + heightDifferenceWom + " less than average");
        } else if (temp >= AVG_WOM_HEIGHT) {
            heightDifferenceWom = temp - AVG_WOM_HEIGHT;
            TextView womTextView = (TextView) findViewById(R.id.textViewWom);
            womTextView.setText(" " + heightDifferenceWom + " greater than average");

        }
    }
}


