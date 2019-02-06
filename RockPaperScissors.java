/**
 * A game of rock, paper, and scissors
 *
 * Nicholas Ventura 
 * 1/23/19 
 */
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        int player = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose one. rock (r), Paper (p), or Scissors (s)?");
        String playerAnswer = scan.nextLine();
        if (playerAnswer.equals("r")) {
            player = 1;
            System.out.println("You chose rock");
        } else if (playerAnswer.equals("s")) {
            player = 2;
            System.out.println("You chose scissors");
        } else if (playerAnswer.equals("p")) {
            player = 3;
            System.out.println("You chose paper");
        } else {
          System.out.println("Congratulations! You failed the most simple task!");
        }
        Random rand = new Random();
        int computer = rand.nextInt(3) + 1;
        if (computer == 1) {
            System.out.println("The computer chose rock.");
        } else if (computer == 2)
       {    System.out.println("The computer chose scissors");
        } else if (computer == 3) {
            System.out.println("The computer chose paper");
        }
        if ((player + 1)% 3 == computer) {
            System.out.println("You got the #1 Victory Royale!!");
        } else if ((computer + 1) % 3 == player) {
            System.out.println("Take the L");
        } else {
            System.out.println("It was a tie!");
            
        }
    }
    


}
