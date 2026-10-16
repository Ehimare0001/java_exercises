/*2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333….]  */

import java.util.Scanner;
public class ArithmeticSmallest{ 
  public static void main(String[]args){ 
  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter First Number: ");
  int firstNumber = input.nextInt();
  
  System.out.print("Enter Second Number: ");
  int secondNumber = input.nextInt();
  
  System.out.print("Enter Third Number: ");
  int thirdNumber = input.nextInt();
  
  
  int sum = firstNumber + secondNumber + thirdNumber;

  int average = (firstNumber + secondNumber + thirdNumber)/3;

  int product = firstNumber * secondNumber * thirdNumber;
  
   int  smallest = firstNumber;
  
  if( secondNumber < smallest){
    smallest = secondNumber;
  }
  if (thirdNumber < smallest){
      smallest = thirdNumber;
  } 
  
  int largest = firstNumber;
    
  if(secondNumber > largest){
    largest = secondNumber;
  }
  
  if(thirdNumber > largest){
    largest = thirdNumber;
    
 }   
  
  System.out.println("The Sum of the number: " + sum);
  System.out.println("The Average of the number: " + average);
  System.out.println("The Product of the number: " + product);
  System.out.println("The Smallest of the number: " + smallest);
  System.out.println("The Largest of the number: " + largest);
  
  }
  
  }
  
  
  
