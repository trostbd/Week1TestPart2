package com.example.lawre.week1testpart2;

import java.util.ArrayList;

public class Tiger extends Animal
{
    Tiger()
    {
        species = "Tiger";
        sleepEnergyGain = 15;
        mySound = "growl!";
        diet = new ArrayList<Food>();
        diet.add(new Food("meat"));
        diet.add(new Food("fish"));
        diet.add(new Food("bugs"));
    }
}
