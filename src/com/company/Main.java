package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        1.allow user input
        2.tell the user if their guess is too high or too low.
        3. allow for 5 chances, if the number isn't correct tell them what it is
        4. if the number is correct, congratulate them
        5. Allow the user to play again if they would like.
          */

        System.out.println("welcome player to a number Guessing Game, What is your name?");

        Scanner name = new Scanner(System.in);
        String myName = name.nextLine();
        String welcoming = "Welcome, ";


        System.out.println(welcoming + myName);

//        asks your name and your guess and checks to see what you inputted.


        Scanner myGuess = new Scanner(System.in);
        int numberOfGuesses =0;

        final int MAX_GUESS_COUNT = 5;

        System.out.println("Enter your guess:");
        int guess = myGuess.nextInt();

        int randomNum = (int) (1 + Math.random() * 100);

        if (guess == randomNum) {

            System.out.println("You guessed the number.");
        }


        do {
            if (guess > randomNum) {

                System.out.println("your number is too high!");
                numberOfGuesses++;
            } else if (guess < randomNum) {
                System.out.println("Your number is too low!");
                numberOfGuesses++;
            }

            else if (numberOfGuesses == MAX_GUESS_COUNT){
                System.out.println("Sorry you have ran out of guesses. The correct number was: " + randomNum);
            }

        } while(numberOfGuesses <= 5) ;
    }
}