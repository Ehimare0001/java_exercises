/*2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them from
the user and prints the square of each, the sum of their squares, and the difference of the squares (first
number squared minus the second number squared). Use the techniques shown in Fig. 2.7. */

import java.util.Scanner;
public class ArithmeticInteger{ 
  public static void main(String[]args){ 
  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter first number: ");
  int firstNumber = input.nextInt();
  
  System.out.print("Enter second number: ");
  int secondNumber = input.nextInt();
  
  int squareOne = firstNumber * firstNumber;
  int squareTwo = secondNumber * secondNumber;
  
  
  int sum = squareOne + squareTwo;
  
  int difference = squareOne - squareTwo;
  
  System.out.println(squareOne);
  System.out.println(squareTwo);
  System.out.println(sum);
  System.out.println(difference);
  
  
  
  
  }

}
