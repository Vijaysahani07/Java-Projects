//Write a program to check if a number is even or odd.

import java.util.Scanner;

public class CheckEvenOrOdd {

  public static void main(String[] args) {

    // taking input from the Users
    Scanner scanner = new Scanner(System.in);

    System.out.println("Warning Please do not Enter in double or float Number");
    System.out.println("Enter Number, Which you wants to check Even or Odd");
    int number = scanner.nextInt();

    scanner.close();

    if (number % 2 == 0) {
      System.out.println(number + " is Even number");
    } else {
      System.out.println(number + " is Odd number");
    }
  }
}
