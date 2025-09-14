/*
Stony Brook Dairy Farm sells organic brown eggs to local customers. It charges $3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen. 
Write a program that prompts a user for the number of eggs in the order and then display the amount owed with a full explanation. Example:
Number of eggs in the order: 27  
You ordered 27 eggs. That’s 2 dozen (2 x 12 = 24 eggs) at $3.25 per dozen (2 x $3.25 = $6.50) and 3 loose eggs at 45 cents (3 x 45c = $1.35) for a total of $7.85 ($6.50 + $1.35 = $7.85).
*/
import java.util.Scanner;
public class Eggs {
    

    public static void main(String[]args){

    System.out.println("Number of eggs in the order: ");
    Scanner input = new Scanner(System.in);
    int eggs = input.nextInt();
    
    int dozen = eggs / 12;
    int looseEggs = eggs % 12;

    double totalDozen = ((double)dozen * 3.25);
    double totalLoose = ((double)looseEggs * .45);



    System.out.println("You ordered " + eggs + " eggs. That’s " + dozen + " dozen (" + dozen + " x 12 = " + (dozen * 12) + 
    " eggs) at $3.25 per dozen ("+ dozen + " x $3.25 = $" + totalDozen + ") and " + looseEggs + " loose eggs at 45 cents (" 
    + looseEggs + " x 45c = $" + totalLoose + ") for a total of $7.85 ($" + totalDozen + " " + "$" + totalLoose +" = $" + (totalDozen + totalLoose) + ".");

    }

}
