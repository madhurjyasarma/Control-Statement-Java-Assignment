package org.example;

import java.util.Random;
import java.util.Scanner;

public class Day2_GuessTheNum {
    public static void main(String[] args) {
        // Interface
        System.out.println("###################################");
        System.out.println("######### AI vs Mankind ###########");
        System.out.println("###################################");
        System.out.println("It's year 2043. The AI took over the world. Man is slave of AI now.");
        System.out.println("Suddenly you found a way to cut the internet of the entire world. without internet AI will not survive.");
        System.out.println("But oh No! It's locked. You have to guess the number. Mankind is in your hands");

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("Guess the number : ");
        boolean flag = false;

        while (!flag) {
            int input = sc.nextInt();

            Random random = new Random();
            final int  RANDOM_NUM = 1 + random.nextInt(9);

            if (input == RANDOM_NUM) {
                System.out.println("Thank god! You've guessed it right. now we can survive.");
                flag = true;
            }
            else if (input < RANDOM_NUM) {
                System.out.println("You've guessed it wrong. You guessed LOW.");
            }
            else if (input > RANDOM_NUM) {
                System.out.println("You've guessed it wrong. You guessed it HIGH.");
            }
        }

    }
}
