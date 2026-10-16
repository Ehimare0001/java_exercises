/*2.16 (Comparing Integers) Write an application that asks the user to enter one integer, obtains
it from the user and displays whether the number and its square are greater than, equal to, not equal
to, or less than the number 100. Use the techniques shown in Fig. 2.15. */

import java.util.Scanner;
public class ComparingIntegers{ 
  public static void main(String[]args){
  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter one number: ");
  int number = input.nextInt();
  int square = number * number;
    
    if(number && square >= 100){ 
     System.out.println("number and square are greater than 100");
     
     }else if(number && square == 100){
      System.out.println("number and square are equal to 100");
     
     }else if(number && square != 100){ 
      System.out.println("number and square are not equal to 100");
     } else{ 
     
     System.out.println("number and square are less than 100"):
    }
  
  
  
  }


}
