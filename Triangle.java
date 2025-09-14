/*
 * Write a program that reads three double edges (sides) for a triangle and classify it as Equilateral (All sides equal),
 * Isosceles (only Two sides are equal), Scalene (All sides are different), if the input is valid. The input is valid if the sum of every pair of two edges is greater than the remaining edge. 
 * You may assume that the user inputs a positive value for each of the edges.
Examples: 
Side1: 3.0
Side2: 3
Side3: 9
Output: Invalid input!
 
Side1:3
Side2:3
Side3:3
Output: Equilateral
 
Side1:10
Side2:10
Side3:1
Output: Isosceles
Side1:3
Side2:4
Side3:5
Output: Scalene
 */
import java.util.Scanner;
public class Triangle {

    public static void main(String[]args){

        Scanner side1_input = new Scanner(System.in);
        System.out.print("Side1:");
        double side1 = side1_input.nextDouble();

        Scanner side2_input = new Scanner(System.in);
        System.out.print("\nSide2:");
        double side2 = side2_input.nextDouble();

        Scanner side3_input = new Scanner(System.in);
        System.out.print("\nSide3:");
        double side3 = side3_input.nextDouble();

        String result;

        if(side1 == side2 && side2 == side3)
            result = "Equilateral";
        else if((side1 == side2 && side2 != side3) || (side1 != side2 && side2 == side3) || (side1 != side2 && side1 == side3))
            result = "Isosceles";
        else
            result = "Scalene";

        if((side1 + side2 > side3) || (side2 + side3 > side1) || (side1 + side3 > side2))
            result = "Invalid input!";
        

        System.out.println("Output: " + result);

    }
    
}
