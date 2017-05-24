package com.codeclan.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultText = (TextView)findViewById(R.id.result_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String result = "YOU LOSE, CPU Chose... " + extras.getString("result") +", Sucker!";

        resultText.setText(result);



    }
}
