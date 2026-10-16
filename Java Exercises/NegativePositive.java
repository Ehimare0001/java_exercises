/*2.32 (Negative, Positive and Zero Values) Write a program that inputs five numbers
and determines and prints the number of negative numbers input, the number of positive 
numbers input and the number of zeros input. */

import java.util.Scanner;
public class NegativePositive{
  public static void main(String[]args) {
  
  Scanner input = new Scanner(System.in);
  
  int negative = 0;
  int positive = 0;
  int zero = 0;
  
  System.out.print("Enter First Number: ");
  int firstNumber = input.nextInt();
  
  if(firstNumber < 0){
    negative++;
  
  }else if(firstNumber > 0){ 
    positive++;
      
  }else{ 
    zero++;
  
  }
  
  System.out.print("Enter Second Number: ");
  int secondNumber = input.nextInt();
   if(secondNumber < 0){
    negative++;
  
  }else if(secondNumber > 0){ 
    positive++;
      
  }else{ 
    zero++;
  
  }
  
  System.out.print("Enter Third Number: ");
  int thirdNumber = input.nextInt();
  
   if(thirdNumber < 0){
    negative++;
  
  }else if(thirdNumber > 0){ 
    positive++;
      
  }else{ 
    zero++;
  
  }
  
  System.out.print("Enter Fourth Number: ");
  int fourthNumber = input.nextInt();
  
   if(fourthNumber < 0){
    negative++;
  
  }else if(fourthNumber > 0){ 
    positive++;
      
  }else{ 
    zero++;
  
  }
  
  System.out.print("Enter Fifth Number: ");
  int fifthNumber = input.nextInt();
  

   if(fifthNumber < 0){
    negative++;
  
  }else if(fifthNumber > 0){ 
    positive++;
      
  }else{ 
    zero++;
  
  }
  
  System.out.println("Negative number: " + negative);
  System.out.println("Positive number: " + positive);
  System.out.println("Zero number: " + zero);
  
  
  
  }

}

