/*2.24 (Largest and Smallest Integers) Write an application that reads five integers and determines
and prints the largest and smallest integers in the group. Use only the programming techniques you
learned in this chapter*/

import java.util.Scanner;
public class LargestSmallest{ 
  public static void main(String[]args){
  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter First Number: ");
  int firstNumber = input.nextInt();
  
  System.out.print("Enter Second Number: ");
  int secondNumber = input.nextInt();
  
  System.out.print("Enter Third Number: ");
  int thirdNumber = input.nextInt();
  
  System.out.print("Enter Fourth Number: ");
  int fourthNumber = input.nextInt();
  
  System.out.print("Enter Fifth Number: ");
  int fifthNumber = input.nextInt();
  
  
  int largest = firstNumber;
  if (secondNumber > largest){ 
    largest = secondNumber;
  }
  
   if (thirdNumber > largest){ 
    largest = thirdNumber;
  }
  
   if (fourthNumber > largest){ 
    largest = fourthNumber;

  }
  
  if (fifthNumber > largest){ 
    largest = fifthNumber;
  } 
  
  int smallest = firstNumber;
  if (secondNumber < smallest){ 
    smallest = secondNumber;
  }
  
   if (thirdNumber < smallest){ 
    smallest = thirdNumber;
  }
  
   if (fourthNumber < smallest){ 
    smallest = fourthNumber;

  }
  
  if (fifthNumber < smallest){ 
    smallest = fifthNumber;
  } 
  
  System.out.println("The Largest Number is: " + largest);
  System.out.println("The Smallest Number is: " + smallest);
  
   }



}
