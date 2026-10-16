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
        
    if(number >= 100){ 
     System.out.println("number is greater than 100");
     
     }else if(number == 100){
      System.out.println("number is equal to 100");
     
     }else if(number != 100){ 
      System.out.println("number is not equal to 100");
     } else{ 
     
     System.out.println("number is less than 100");
    }
  
    if(square >= 100){ 
     System.out.println("square is greater than 100");
     
    }else if(square == 100){ 
     System.out.println("square is equal to 100");
    }else if(square != 100){   
      System.out.println("square is equal to 100");
      
    }else{
      System.out.println("square is less than 100");
    
    }
    
    
    
  
  }


}
