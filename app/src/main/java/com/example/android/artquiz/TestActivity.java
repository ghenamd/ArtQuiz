package com.example.android.artquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by Ghena on 02/03/2017.
 */

public class TestActivity extends AppCompatActivity {


    static final String PERSON = "person";
    static final String SCORE = "score";

    int points = 0; //This is a global variable that keeps track of the score

    CheckBox[] chkArray = new CheckBox[3];// Creating an array of boxes
    CheckBox[] array = new CheckBox[6];

    //   Declaring global RadioButtons

    RadioButton button3Q2;
    RadioButton button3Q3;
    RadioButton button2Q4;
    RadioButton button1Q5;
    RadioButton button3Q6;
    RadioButton button1Q7;
    RadioButton button2Q8;
    RadioButton button1Q9;



    EditText textName;


    RadioGroup group2;
    RadioGroup group3;
    RadioGroup group4;
    RadioGroup group5;
    RadioGroup group6;
    RadioGroup group7;
    RadioGroup group8;
    RadioGroup group9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.quiz);
        setContentView(R.layout.test_activity);

        // View elements are initialized just once

        button3Q2 = (RadioButton) findViewById(R.id.radio_button3q2);
        button3Q3 = (RadioButton) findViewById(R.id.radio_button3q3);
        button2Q4 = (RadioButton) findViewById(R.id.radio_button2q4);
        button1Q5 = (RadioButton) findViewById(R.id.radio_button1q5);
        button3Q6 = (RadioButton) findViewById(R.id.radio_button3q6);
        button1Q7 = (RadioButton) findViewById(R.id.radio_button1q7);
        button2Q8 = (RadioButton) findViewById(R.id.radio_button2q8);
        button1Q9 = (RadioButton) findViewById(R.id.radio_button1q9);

        array[0] = (CheckBox) findViewById(R.id.check_box1q1);
        array[0].setOnClickListener(mListener);
        array[1] = (CheckBox) findViewById(R.id.check_box2q1);
        array[1].setOnClickListener(mListener);
        array[2] = (CheckBox) findViewById(R.id.check_box3q1);
        array[2].setOnClickListener(mListener);
        array[3] = (CheckBox) findViewById(R.id.check_box4q1);
        array[3].setOnClickListener(mListener);
        array[4] = (CheckBox) findViewById(R.id.check_box5q1);
        array[4].setOnClickListener(mListener);
        array[5] = (CheckBox) findViewById(R.id.check_box6q1);
        array[5].setOnClickListener(mListener);


        group2 = (RadioGroup) findViewById(R.id.radio_group2);
        group3 = (RadioGroup) findViewById(R.id.radio_group3);
        group4 = (RadioGroup) findViewById(R.id.radio_group4);
        group5 = (RadioGroup) findViewById(R.id.radio_group5);
        group6 = (RadioGroup) findViewById(R.id.radio_group6);
        group7 = (RadioGroup) findViewById(R.id.radio_group7);
        group8 = (RadioGroup) findViewById(R.id.radio_group8);
        group9 = (RadioGroup) findViewById(R.id.radio_group9);

        textName = (EditText) findViewById(R.id.text_edit);


        // Grouping checkboxes in an Array similar to a RadioGroup
        chkArray[0] = (CheckBox) findViewById(R.id.check_box1q10);
        chkArray[0].setOnClickListener(listener);
        chkArray[1] = (CheckBox) findViewById(R.id.check_box2q10);
        chkArray[1].setOnClickListener(listener);
        chkArray[2] = (CheckBox) findViewById(R.id.check_box3q10);
        chkArray[2].setOnClickListener(listener);


    }

    // This method makes user check only two boxes at a time
    private View.OnClickListener mListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (array[1].isChecked() &&  array[0].isChecked()) {
                array[2].setChecked(false);
                array[3].setChecked(false);
                array[4].setChecked(false);
                array[5].setChecked(false);
            } else if (array[2].isChecked() && array[1].isChecked()) {
                array[0].setChecked(false);
                array[3].setChecked(false);
                array[4].setChecked(false);
                array[5].setChecked(false);
            }
            else if (array[3].isChecked() && array[2].isChecked()) {
                array[0].setChecked(false);
                array[1].setChecked(false);
                array[4].setChecked(false);
                array[5].setChecked(false);
            }
            else if (array[4].isChecked() && array[3].isChecked()) {
                array[0].setChecked(false);
                array[1].setChecked(false);
                array[2].setChecked(false);
                array[5].setChecked(false);
            }
            else if (array[5].isChecked() && array[4].isChecked()) {
                array[0].setChecked(false);
                array[1].setChecked(false);
                array[2].setChecked(false);
                array[3].setChecked(false);
            }
        }
    };

    //This method makes the user check only one CheckBox at a time similar to a RadioGroup.
    // Coded found on stackoverflow.com and adapted to my app
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            final int checkedId = v.getId();
            for (int i = 0; i < chkArray.length; i++) {
                final CheckBox current = chkArray[i];
                if (current.getId() == checkedId) {
                    current.setChecked(true);
                } else {
                    current.setChecked(false);
                }
            }
        }
    };


    // This method is called when submit button is clicked.
    public void submit(View view) {

        //This method gets the name of the person
        String nameOfThePerson = textName.getText().toString();
        if (array[1].isChecked() && array[4].isChecked()) {
            points += 1;

        }


        //This conditional adds a point if the correct button is ticked.
        if (button3Q2.isChecked()) {
            points += 1;
        }
        //This conditional adds a point if the correct button is ticked.
        if (button3Q3.isChecked())

        {
            points += 1;
        }
        //This conditional adds a point if the correct button is ticked.
        if (button2Q4.isChecked())

        {
            points += 1;
        }
        //This conditional adds a point if the correct button is ticked.
        if (button1Q5.isChecked())

        {
            points += 1;
        }
        //This conditional adds a point if the correct button is ticked.
        if (button3Q6.isChecked())

        {
            points += 1;
        }
        //This conditional adds a point if the correct button is ticked.
        if (button1Q7.isChecked())

        {
            points += 1;
        }
        //This conditional adds a point if the correct button is ticked.
        if (button2Q8.isChecked())

        {
            points += 1;
        }
        //This conditional adds a point if the correct button is ticked.
        if (button1Q9.isChecked())

        {
            points += 1;
        }

        //This conditional adds a point if the correct box is ticked.
        if (chkArray[2].isChecked()) {
            points += 1;
        }


        //This method send intent to ResultActivity.java
        Intent resultIntent = new Intent(TestActivity.this, ResultActivity.class);
        resultIntent.putExtra(PERSON, nameOfThePerson);// gets the nameOfThePerson from TestActivity.java to ResultActivity.java
        resultIntent.putExtra(SCORE, points);
        startActivity(resultIntent);


        // This methods reset RadioGroups

        group2.clearCheck();
        group3.clearCheck();
        group4.clearCheck();
        group5.clearCheck();
        group6.clearCheck();
        group7.clearCheck();
        group8.clearCheck();
        group9.clearCheck();

        // Resets all
        points = 0;
        textName.setText("");
        chkArray[0].setChecked(false);
        chkArray[1].setChecked(false);
        chkArray[2].setChecked(false);
        array[0].setChecked(false);
        array[1].setChecked(false);
        array[2].setChecked(false);
        array[3].setChecked(false);
        array[4].setChecked(false);
        array[5].setChecked(false);
    }

    // Method to save the points value when the screen is rotated.

    static final String STATE_POINTS = "points";

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("STATE_POINTS", points);
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        points = savedInstanceState.getInt(STATE_POINTS);

    }

}
