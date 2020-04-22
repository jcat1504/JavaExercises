//the Random class
//a random object generates pseudo-random* numbers
//class Random is found in the java.util package

//nextInt(): returns a random integer
//nextInt(max): returns a random integer in the range[0, max], in other words, 0 to max-1 inclusive
//nextDouble(): returns a random real number in the range[0.0, 1.0]
//EXAMPLE:
Random rand = new Random();
int RandomNumber = rand.nextInt(10); //0-9

//Generating Random Numbers
//common usage: to get a random number from 1 to N
int n = rand.nextInt(0) + 1; //1-20 inclusive

//to get a number in arbitrary range [min, max] inclusive:
//nextInt(size of range) + min 
    //where (size of range) is (max - min + 1)
//example
int n = rand.nextInt(7) + 4 //between 4 and 10 inclusive

//any set of possible values can be mapped to integers
//code to randomly play rock paper scissors

int r = rand.nextInt(3)
if (r == 0) {
    System.out.println("Rock"); 
    } else if (r == 1) {
        System.out.println("Paper") 
    } else {
        System.out.println("Scissors")
}

//roll two dice until a sum of 7 is reached
import java.util.*;

public class Dice {
    public static void main(String[] args) {
        Random rand = new Random();
        int tries = 0;
        int sum = 0;

        while (sum != 7) {
            //rolls the dice once
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            sum = roll1 + roll2;
            System.out.println(roll1 + " + " + roll2 + " = " + sum);
            tries++;
        }
        System.out.println("You won after " tries + " tries!");
    }
}