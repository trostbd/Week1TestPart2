package com.example.lawre.week1testpart2;


import java.util.ArrayList;

public class Animal
{
    String species;
    int numOfSpecies;
    int myEnergy;
    int sleepEnergyGain;
    int foodEnergyGain;
    int soundEnergyLoss;
    String mySound;
    ArrayList<Food> diet;

    Animal()
    {
        species = "Animal";
        myEnergy = 0;
        sleepEnergyGain = 10;
        foodEnergyGain = 5;
        soundEnergyLoss = 3;
    }

    public void makeSound()
    {
        System.out.println(species + " says " + mySound);
        myEnergy -= soundEnergyLoss;
    }

    public void eatFood(Food theFood)
    {
        for(int i =0;i<diet.size();i++)
            if(diet.get(i).getFoodType().equals(theFood.getFoodType()))
                myEnergy += foodEnergyGain;
    }

    public void sleep()
    {
        myEnergy += sleepEnergyGain;
    }

    public void soundOff()
    {
        makeSound();
        System.out.println(species + " has " + myEnergy + " energy");
    }

    public String getSpecies()
    {
        return species;
    }

    public void learnOtherKin(int kinNum)
    {
        numOfSpecies = kinNum;
    }
}
