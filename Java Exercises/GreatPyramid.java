/*2.35 (Statistics for the Great Pyramid of Giza) The Great Pyramid of Giza is 
considered an engineering marvel of its time. Use the web to get statistics 
related to the Great Pyramid of Giza, and find the estimated number of stones 
used to build it, the average weight of each stone, and the number of years 
it took to build. Create an application that calculates an estimate of how much, by
weight, of the pyramid was built each year, each hour, and each minute as it was 
being built. The application should input the following information:
a) Estimated number of stones used.
b) Average weight of each stone.
c) Number of years taken to build the pyramid (assuming a year comprises 365 days).*/


import java. util.Scanner;
public class GreatPyramid{ 
  public static void main(String[]args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter the Estimated number of stones used: ");
  double stones = input.nextDouble();
  
  System.out.print("Enter Average weight of each stone: ");
  double weight = input.nextDouble();
  
  System.out.print("Enter the Number of years: ");
  double year = input.nextDouble();
  
  double totalWeight = stones * weight;
  
  double weightPerYear = totalWeight/year;
  
  double weightPerHour = weightPerYear/(365 * 24);
  
  double weightPerMinute = weightPerHour/60; 
  
  System.out.printf("Total weight: %.2f tons%n", totalWeight);
  System.out.printf("Weight build each year: %.2f tons%n", weightPerYear);
  System.out.printf("Weight build each hour: %.2f tons%n", weightPerHour);
  System.out.printf("Weight build each minute: %.2f tons%n", weightPerMinute);
  
  
  }


}
