/*Month Days Finder

Problem Statement:
Write a program that takes a month (as a number) and a year as input and prints the number of days in that month, considering leap years.

Description:
The program should read the month and year continuously until the user inputs a stop value. You need to handle leap years and invalid inputs.

Input Format:
The first line contains an integer n (number of entries).
The next n lines contain two integers each: the month and the year.
The input stops when the user enters -1 -1.
Output Format:
Print the number of days in the given month for each input.

Sample Input:
2 2020 -1 -1
Sample Output:
29 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        while (true) {
            // Read month and year inputs
            int month = scanner.nextInt();
            int year = scanner.nextInt();
            
            // Stop the input if -1 -1 is entered
            if (month == -1 && year == -1) {
                break;
            }

            // Validate the month input
            if (month < 1 || month > 12) {
                System.out.println("Invalid month");
                continue;
            }

            // Determine the number of days in the month
            int days = 0;
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                case 2:
                    // Check for leap year
                    if (isLeapYear(year)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
            }

            // Output the number of days for the current month and year
            System.out.println(days);
        }
        
        scanner.close();
    }

    // Helper function to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year if divisible by 4 but not 100, unless divisible by 400
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}