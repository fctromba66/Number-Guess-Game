/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguess;

/**
 *
 * 
 * 
 */
class NumberGuess {
    public static void main(String[] args) {
        int randNum, guessNum, attemptNum;
        // Generates a random number from 1 to 10
        randNum = new java.util.Random().nextInt(10) + 1;
        System.out.println("I am thinking of a number from 1 to 10");
        
        for (attemptNum = 0; attemptNum <= 3; attemptNum++) {
            System.out.println("Guess? ");
            //Wraps the default input in a simple parser called Scanner
            java.util.Scanner scan = new
        java.util.Scanner(System.in);
            guessNum = scan.nextInt(); //Reads command-line int
            System.out.println("You guessed " + guessNum);
            if (randNum == guessNum) {
                System.out.println("You guessed it!");
                break;
            }
                    
        }
    }
}
