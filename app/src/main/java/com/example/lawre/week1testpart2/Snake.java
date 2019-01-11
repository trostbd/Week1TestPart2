package com.example.lawre.week1testpart2;

import java.util.ArrayList;

public class Snake extends Animal
{
    Snake()
    {
        species = "Snake";
        mySound = "hisssss!";
        diet = new ArrayList<Food>();
        diet.add(new Food("meat"));
        diet.add(new Food("fish"));
        diet.add(new Food("bugs"));
        diet.add(new Food("grain"));
    }
}
