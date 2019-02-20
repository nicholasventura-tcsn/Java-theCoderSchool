/**
 * This is a simple guess the number game
 *
 * Nicholas Ventura
 * 2/6/19
 */
import java.util.Scanner;
public class GuessingGame
{
    public static void main(String[] args) {
        int num; 
        int guess;
        int guesses;
        boolean quit = false;
        String above = "Your guess was higher than the number! Try again or press 0 if you want to exit or the quick way Alt F4.";
        String below = "Your guess was lower than the number! Try again or press 0 if you want to exit or the quick way Alt F4.";
        
        //Instructions
        System.out.println("This a guessing game. You will have to guess a number from 1 to 100. Good luck!");
        
        num =(int) (Math.random()*100+1);
        guesses = 0;
        
        Scanner scanGuess = new Scanner(System.in);
        guess = scanGuess.nextInt();
        guesses = 1;
        while (guess != num && !quit) {
            if (guess == 0) {
                quit = true;
                break;
            }
            if (guess > num) {
                System.out.println(above);
            } else if (guess < num) {
                System.out.println(below); 
            
            
            }  
           
        guess = scanGuess.nextInt();
        guesses++;
    }
    if (guess == num) {
        System.out.println("Congratulations! You guessed the right number it was " +num+ ". It took you " +guesses+ " guesses");
    } else if (quit) {
        System.out.println("Wow you actually did Alt F4 have fun waiting for your computer to restart");
    }
    
    
    }
}
