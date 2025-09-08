package org.example;

import java.util.Scanner;

public class MyPassword {
  public static void askPassword(String prompt, String errorMessage){
    Scanner input = new Scanner(System.in);
      while (true) {
        System.out.print(prompt);
        String attempt = input.nextLine();
        System.out.println();
      }
    }
  public static void main(String[] args) {
    askPassword("Enter your password: ", "Incorrect password, try again.");
  }
}
