/* 
1. (Schedule.java) Write a Java program Schedule that prints your name, SBU ID number and weekly class schedule. 
It should have the general appearance of the example below with your name on the first line, 
followed by your SBU ID # on the second line, followed by your weekly schedule. 
Adjust the time slots as necessary to correctly reflect your actual class schedule. 
If you are taking fewer than four courses, add fictional courses to bring the total up to four.
You can use tabs ('\t') to align the columns appropriately under the week days. 
John Smith
1234567890
Time    Monday    Tuesday    Wednesday    Thursday    Friday
8:00am-9:30am  CSE114Lab1     CSE114Lab1
9:30am-11:00am         CSE260        CSE260
11:00am-12:30pm       CSE114        CSE114
12:30pm-2:00pm         MAT125        MAT125
2:00pm-3:30pm    FRN111        FRN111        FRN111
3:30pm-5:00pm
5:00pm-6:30pm        PHY127        PHY127
6:30pm-8:00pm
*/

import java.util.Scanner;
public class Schedule{
    public static void main(String[]args){

    System.out.println("Input class time (if done, enter f): ");
    Scanner time_input = new Scanner(System.in);
    String classTime = time_input.next();

    System.out.println("Input class name (if done, enter f): ");
    Scanner class_input = new Scanner(System.in);
    String className = class_input.next();

    System.out.println("Input class day (if done, enter f): ");
    Scanner day_input = new Scanner(System.in);
    String classDay = day_input.next();




    }
}