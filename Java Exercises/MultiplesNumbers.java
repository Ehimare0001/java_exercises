/*2.26 (Multiples) Write an application that reads two integers, determines whether the first
number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
remainder operator.] */

import java.util.Scanner;
public class MultiplesNumbers{ 
  public static void main(String[]args){ 
  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter First Number: ");
  int firstNumber = input.nextInt();
  
  System.out.print("Enter Second Number: ");
  int secondNumber = input.nextInt(); 
  
  int firstNumberTripled = firstNumber * 3;
  int secondNumberDoubled = secondNumber * 2;
  
  if(firstNumberTripled % secondNumberDoubled == 0){
    System.out.println(" first number tripled is a multiple of the second number doubled");
  }else{ 
   System.out.println("first number tripled is not a multiple of the second number doubled");
  }
  
  
  }


}
