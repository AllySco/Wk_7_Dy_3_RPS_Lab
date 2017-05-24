package com.codeclan.example.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 24/05/2017.
 */
public class GameTest {

        Game game;
    @Before
    public void before(){

        game = new Game();
    }

    @Test
    public void playerPicksRock(){
        assertEquals("Paper", game.getResult("Rock"));
    }

    @Test
    public void playerPicksPaper(){
        assertEquals("Scissors", game.getResult("Paper"));
    }

    @Test
    public void playerPicksScissors(){
        assertEquals("Rock", game.getResult("Scissors"));
    }



}