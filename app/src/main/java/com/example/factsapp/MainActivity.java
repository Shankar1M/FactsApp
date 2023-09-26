package com.example.factsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView factTextView;

    @Override
    // when you run the application in emulator this onCreate Method
    // is responsible to show the first frame/ layout to the user.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factTextView = findViewById(R.id.txt_fact);
        //  factTextView.setText("Shankar Murthy");
        String[] myFacts = Fact.getFacts();
        // now we are going to show all thee facts created in the method getfacts()
        // access those facts and show it in textview
        for (String fact : myFacts) { // it is the for each loop it will itereate all the elements present in the myFcts array

            factTextView.append(fact + "\n");
        }
    }
}