package com.example.android.artquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView buttonStart = (TextView) findViewById(R.id.start);
        // Set a click listener on that View
        buttonStart.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Start Quiz button is clicked on.
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(MainActivity.this, TestActivity.class);
                startActivity(startIntent);
            }
        });

    }
}





