package org.example;

import java.util.Scanner;

public class Number {
  public static void guessNumber(String prompt, String errorMessage){
    Scanner input = new Scanner(System.in);
      while (true) {
        System.out.print(prompt);
        int guess = input.nextInt();
        System.out.println();
      }
    }
  public static void main(String[] args) {
    guessNumber("Enter a number: ", "Incorrect, try again.");
  }
}
