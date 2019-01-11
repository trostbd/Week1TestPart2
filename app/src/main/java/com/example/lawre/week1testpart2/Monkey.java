package com.example.lawre.week1testpart2;

import java.util.ArrayList;

public class Monkey extends Animal
{
    Monkey()
    {
        species = "Monkey";
        mySound = "ook!";
        foodEnergyGain = 7;
        soundEnergyLoss = 7;
        diet = new ArrayList<Food>();
        diet.add(new Food("meat"));
        diet.add(new Food("fish"));
        diet.add(new Food("bugs"));
        diet.add(new Food("grain"));
    }

    public void play()
    {
        if(myEnergy >= 8)
        {
            System.out.println("Oooo Oooo Oooo!");
            myEnergy -= 8;
        }
        else
            System.out.println("Monkey is too tired to play.");
    }
}
