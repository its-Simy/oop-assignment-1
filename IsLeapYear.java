/*
 * A leap year is a calendar year which contains an additional day in the month of February. The purpose of the additional day every four years is to keep our calendar in sync with the Earth’s revolution around the sun.
 *  A leap year can be determined by the following conditions: 
If the year is divisible by 400 then it is a leap year.
If the year is not divisible by 400 but divisible by 100 then it is not a leap year.
If the year is not divisible by 400, not divisible by, 100 but divisible by 4 then it is a leap year.
If it fails all the condition above then the year is not a leap year.
Write a program (IsLeapYear.java) which prompts the user to enter in a year and determine whether or not it is a leap year or not.
Examples
Enter in a year: 2023
2023 is not a leap year
Enter in a year: 2024
2024 is a leap year
Enter in a year: 2100
2100 is not a leap year
Enter in a year: 2000
2000 is a leap year
 */
import java.util.Scanner;
public class IsLeapYear {
    public static void main(String[]args){

        System.out.println("Enter in a year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        boolean leapYear = false;//I will use this to keep track if the year is a leap year

        /* 
            If the year is divisible by 400 then it is a leap year.
            If the year is not divisible by 400 but divisible by 100 then it is not a leap year.
            If the year is not divisible by 400, not divisible by, 100 but divisible by 4 then it is a leap year.
            If it fails all the condition above then the year is not a leap year.   
         */

        if (year % 400 == 0)
            leapYear = true;
        
        else if((year % 100 != 0) && (year % 4 == 0))
            leapYear = true;


        if(leapYear)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");

    }
    
}
