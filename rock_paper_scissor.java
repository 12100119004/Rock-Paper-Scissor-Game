package com.company;
import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int f;
        do {
            try {

                Random r = new Random();
                int computerInput = r.nextInt(3);


                System.out.println("Enter your choice:\nRock:0, paper:1, scissor:2");
                int userInput = x.nextInt();
                if (userInput > 2) {
                    System.out.println("Input number should be less than 3");
                } else if (userInput == computerInput) {
                    System.out.println("Draw");
                    System.out.println("computer chooses " + computerInput);
                } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
                    System.out.println("You win");
                    System.out.println("computer chooses " + computerInput);
                } else {
                    System.out.println("You loose");
                    System.out.println("computer chooses " + computerInput);
                }

            } catch (Exception e) {
                System.out.println("Invalid Input ");
            }
            System.out.println("Enter 0 to play again");
            f = x.nextInt();

        }while(f==0);
    }

}
