//Write a program that takes two integers as input and prints their sum.

import java.util.Scanner;

public class SumOfTwoNumber {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your first Number");
    int firstNumber = scanner.nextInt();

    System.out.println("Enter your second Number");
    int secondNumber = scanner.nextInt();

    int sum = firstNumber + secondNumber;

    System.out.println(sum);
  }
}
