import java.lang.Math;
import java.util.Scanner;

import javax.swing.*;

public class rockPaperScissors {
    public static void main(String[] args) 
    {
       System.out.println("WELCOME TO ROCK, PAPER, SCISSORS \t");    // Welcome user to the game
       System.out.println("ROCK = 0 \t PAPER = 1 \t SCISSORS = 2 \t");
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter number for [0]rock, [1]paper or [2]scissors: ");  // ask user to select between rock paper and scissor
       byte selectedNum = scanner.nextByte();
       System.out.println("User selected" + " " + selectedNum);         // show what the user has selected
       
       int computer = 0 + (int)(Math.random() * (3-0));                 // making the computer to choose at random
       
       System.out.println("computer selected" + " " + computer);        // show what the user has selected


       if(selectedNum == 0)                                            // show if user has drawn, lost or won
            if(computer == 0)
                System.out.println("Draw");
            else if(computer == 1)
                System.out.println("You lose");
            else if(computer == 2)
                System.out.println( "You win");
        else if(selectedNum == 1)
            if(computer == 0)
                System.out.println( "You win");
            else if(computer == 1)
                System.out.println("Draw");
            else if(computer == 2)
                System.out.println("You lose");
        else if(selectedNum == 2)
            if(computer == 0)
                System.out.println("You lose");
            else if(computer == 1)
                System.out.println("You win");
            else if(computer == 2)
                System.out.println("Draw");
        else
            System.out.println("User enter invalid selection");



    }
    
}
