import java.util.Scanner;
public class AgeComparison{ 
  public static void main(String[]args){ 
  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter age: ");
  int age = input.nextInt();
  
  if(age >= 1 && age <= 12){
    System.out.println("Child");
    
  }else if(age >= 13 && age <= 19){
  
    System.out.println("Teenager");
  
  }else if(age >= 20){ 
    System.out.println("Adult");
  
  
  }else{ 
    System.out.println("Invalid age");
  
  }
  
  
  
  }


}
