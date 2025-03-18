import java.util.Scanner;

public class FactorialOfaNumber {

  public static void main(String[] args) {

    // Taking input from the users
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Number");
    int num = scanner.nextInt();
    scanner.close();

    long factorial = 1;

    // Iterating to each number
    for (int i = 1; i <= num; i++) {
      factorial *= i;
    }
    System.out.println("The Factorial of " + num + " is " + factorial);
  }
}
