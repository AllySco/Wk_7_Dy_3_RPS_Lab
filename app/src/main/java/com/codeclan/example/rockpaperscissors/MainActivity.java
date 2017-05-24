package com.codeclan.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onRockButtonClicked(View Button) {

        Game game = new Game();
        String result = game.getResult("Rock");

        Intent intent = new Intent(this, Result.class);
        intent.putExtra("result", result);
        startActivity(intent);

    }

    public void onPaperButtonClicked(View Button) {

        Game game = new Game();
        String result = game.getResult("Paper");

        Intent intent = new Intent(this, Result.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    public void onScissorsButtonClicked(View Button) {

        Game game = new Game();
        String result = game.getResult("Scissors");

        Intent intent = new Intent(this, Result.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }
}
