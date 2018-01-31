package com.company;

import java.time.Year;
import java.util.InputMismatchException;
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



//        asks your name and your guess and checks to see what you inputted.


        {
            String userInput = null;
            do {


                Scanner myGuess = new Scanner(System.in);
                int numberOfGuesses = 0;
                System.out.println("Enter your guess: ");
                int randomNum = (int) (1 + Math.random() * 100);
                final int MAX_GUESS_COUNT = 4;


                System.out.println("pick a number between 1 and 100: ");


                int quit = 1;

                int guess = 0;
                do {
                    try {



                    } catch (NumberFormatException ime) {
                        System.out.println("you have to use a number!");

                    }
                    do {
                        guess = myGuess.nextInt();

                        if (guess > randomNum) {

                            System.out.println("your number is too high!");
                            numberOfGuesses++;
                            System.out.println("Enter your guess: ");

                        } else if (guess < randomNum) {
                            System.out.println("Your number is too low!");
                            numberOfGuesses++;
                            System.out.println("Enter your guess: ");

                        } else if (guess == randomNum) {
                            System.out.println("Congratulations you guessed my number");
                        }
                    } while (numberOfGuesses <= MAX_GUESS_COUNT);


                    System.out.println("sorry the correct number was: " + randomNum);


                    String replay = "Would you like to play again?";

                    System.out.println(replay);

                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Y or N");

                    userInput = scanner.nextLine();
                    quit = 100;

                } while (guess > quit);

            } while (userInput.toUpperCase().equals("Y"));
        }



    }
}
