/*2.34 (World Population Growth Calculator) Search the Internet to determine the current world
population and the annual world population growth rate. Write an application that inputs these values, 
then displays the estimated world population after one, two, three, four and five years. 
 */
public class WorldPopulation{ 
  public static void main(String[]args){ 
  
    double population = 8_300_000_000.0;
    double growthRate = 0.0084;
    
    population = population + (population * growthRate);
    System.out.printf("After 1 year: %.0f%n", population);
    
    population = population + (population * growthRate);
    System.out.printf("After 2 year: %.0f%n", population);
    
    population = population + (population * growthRate);
    System.out.printf("After 3 year: %.0f%n", population);
    
    population = population + (population * growthRate);
    System.out.printf("After 4 year: %.0f%n", population);
    
    population = population + (population * growthRate);
    System.out.printf("After 5 year: %.0f%n", population);
  
  
  }

}
