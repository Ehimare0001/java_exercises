import java.util.Scanner;
public class TaskOne{
 public static void main(String[]args){ 
 
 Scanner input = new Scanner(System.in);
 System.out.print("Enter first integer: ");
 int number1 = input.nextInt();
 
 System.out.print("Enter second integer: ");
 int number2 = input.nextInt();
 
 System.out.print("Enter third integer: ");
 int number3 = input.nextInt();
 
 System.out.print("Enter fourth integer: ");
 int number4 = input.nextInt();
 
 System.out.print("Enter five integer: ");
 int number5 = input.nextInt();
 
     largest = number1;
     smallest = number3;
   if(number2 > largest){
     largest = number2;
  }if(number3 > largest){
     largest = number3;
  }if(number4 > largest){
     largest = number4;
  }if(number5 > largest){
     largest = number5;
  }
   
  if(number1 < smallest){
     smallest = number1;   
  }if(number2 < smallest){
     smallest = number2;  
  }if(number4 < smallest){
     smallest = number4;   
  }if(number5 < smallest){
     smallest = number5;   
     
 }
 System.out.println("Largest is %d", largest);
 System.out.println("Smallest is %d", smallest);
 }
 }
