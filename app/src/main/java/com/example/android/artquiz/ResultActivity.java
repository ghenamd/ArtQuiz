package com.example.android.artquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Ghena on 02/03/2017.
 */

public class ResultActivity extends AppCompatActivity {
    static final String CONGRATULATIONS = "Congratulations ";
    static final String YOU_SCORED = " you scored ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.result);//Setting Title of the current activity
        setContentView(R.layout.result_activity);


        Bundle person = this.getIntent().getExtras();// gets the Intent sent from TestActivity.java
        String name = person.getString("person");

        Bundle score = this.getIntent().getExtras();// gets the Intent sent from TestActivity.java
        int points = score.getInt("score");

        TextView result = (TextView) findViewById(R.id.result);
        if (points == 1) {
            result.setText(CONGRATULATIONS + name + YOU_SCORED + points + " point !");
        } else {
            result.setText(CONGRATULATIONS+ name + YOU_SCORED + points + " points !");
        }

        // When button TRY AGAIN is pressed it restarts the test
        TextView tryAgain = (TextView) findViewById(R.id.try_again);
        // Set a click listener on that View
        tryAgain.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the TYAGAIN Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent againIntent = new Intent(ResultActivity.this, TestActivity.class);
                startActivity(againIntent);

            }
        });
    }
}