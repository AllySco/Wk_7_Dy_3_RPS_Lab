package com.codeclan.example.rockpaperscissors;

import java.util.HashMap;

/**
 * Created by user on 24/05/2017.
 */

public class Game {

       private HashMap<String, String> rps;

        public Game() {


            this.rps = new HashMap<>();

            rps.put("Rock", "Paper");
            rps.put("Paper", "Scissors");
            rps.put("Scissors", "Rock");
        }


    public String getResult(String input) {
        return rps.get(input);
    }


    @Override
    public String toString() {
        return "YOU LOSE, CPU Chose..." + this.getResult("");
    }
}
