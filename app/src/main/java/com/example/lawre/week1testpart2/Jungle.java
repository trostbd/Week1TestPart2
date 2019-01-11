package com.example.lawre.week1testpart2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Random;

public class Jungle //extends AppCompatActivity
{

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jungle);
    }*/

    Animal[] theAnimals;
    ArrayList<Food> availableFood;
    Random rand;
    int tigerNum = 0;
    int snakeNum = 0;
    int monkeyNum = 0;

    Jungle()
    {
        populateJungle();
        populateFood();
    }

    public static void main(String[] args)
    {
        Jungle theJungle = new Jungle();
        theJungle.animalsEat();;
        theJungle.doSoundOff();
    }

    public void doSoundOff()                        //each animal sounds off
    {
        for(int i =0; i<theAnimals.length;i++)
            theAnimals[i].soundOff();;
    }

    void populateJungle()                           //fills jungle with a random number of animals of each species
    {
        rand = new Random();
        int jungSize = rand.nextInt(5)+5;
        theAnimals = new Animal[jungSize];
        for(int i = 0; i<jungSize;i++)
        {
            int animalNum = rand.nextInt(3);
            switch(animalNum)
            {
                case 0:
                    theAnimals[i] = new Tiger();
                    tigerNum++;
                    break;
                case 1:
                    theAnimals[i] = new Snake();
                    snakeNum++;
                    break;
                case 2:
                    theAnimals[i] = new Monkey();
                    monkeyNum++;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
        for(int i=0;i<theAnimals.length;i++)
        {
            switch (theAnimals[i].getSpecies())
            {
                case "Tiger":
                    theAnimals[i].learnOtherKin(tigerNum);
                    break;
                case "Snake":
                    theAnimals[i].learnOtherKin(snakeNum);
                    break;
                case "Monkey":
                    theAnimals[i].learnOtherKin(monkeyNum);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }

    void populateFood()                             //generates a random number of each type of food
    {
        availableFood = new ArrayList<Food>();
        int foodSize = rand.nextInt(10)+10;
        for(int i = 0;i<foodSize;i++)
        {
            switch(rand.nextInt(4))
            {
                case 0:
                    availableFood.add(new Food("meat"));
                    break;
                case 1:
                    availableFood.add(new Food("fish"));
                    break;
                case 2:
                    availableFood.add(new Food("grain"));
                    break;
                case 3:
                    availableFood.add(new Food("bugs"));
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }

    public void animalsEat()                               //each animal tries to eat a random piece of food
    {
        for(int i = 0;i<theAnimals.length;i++)
        {
            int tryFood = rand.nextInt(availableFood.size());
            theAnimals[i].eatFood(availableFood.get(tryFood));
        }
    }
}
