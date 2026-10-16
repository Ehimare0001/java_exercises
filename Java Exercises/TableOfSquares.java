/* 2.31 (Table of Squares and Cubes) Using only the programming techniques you learned in this
chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
prints the resulting values in table format, as shown below number square cube
0 0 0
1 1 1
2 4 8
3 9 27
4 16 64
5 25 125
6 36 216
7 49 343
8 64 512
9 81 729
10 100 100*/

public class TableOfSquares{ 
  public static void main(String[]args){ 
  
  System.out.println("number\tsquares\tcubes");
  
  for(int number = 0; number <= 10; number++){ 
  
     int squares = number * number;
     int cubes = number * number * number;
  
  
  
     System.out.printf("%d\t%d\t%d/n", number, squares, cubes); 
  }
 }

}
