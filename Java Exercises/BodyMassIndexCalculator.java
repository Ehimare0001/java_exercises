/* 2.33 (Body Mass Index Calculator) We introduced the body mass index (BMI) calculator in
Exercise 1.10. The formulas for calculating BMI are Create a BMI calculator that reads the
user’s weight in pounds and height in inches (or, if you prefer, the user’s weight in kilograms 
and height in meters), then calculates and displays the user’s
body mass index. Also, display the BMI categories and their values from the National Heart Lung
and Blood Institute
http://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm
so the user can evaluate his/her BMI  */

import java.util.Scanner;
public class BodyMassIndexCalculator{ 
  public static void main(String[]args){ 
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter weight in kilograms: ");
  double weight = input.nextDouble();
  
  System.out.print("Enter height in metres: ");
  double height = input.nextDouble();
  
  double bmi = weight/(height * height);
  
  System.out.printf("BMI is %.2f%n", bmi);
  
  if(bmi < 18.5){ 
    System.out.println("Category: Underweight"); 
  
  }else if(bmi < 25){ 
    System.out.println("Category: Normal weight");
    
  }else if(bmi < 30){
    System.out.println("Category: Overweight");
  
  }else{ 
    System.out.println("Category: Obesity");
  
  }
  
  
  }
}
