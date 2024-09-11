/*Nested Loop Patterns

Problem Statement:
Write a program that generates a pattern based on user input using nested loops. The pattern to be generated is a pyramid where each level contains a specific number of symbols. Each level's pattern should follow a unique rule:

The number of symbols on each level is equal to the level number.
The symbol for each level is based on the level number where odd levels use * and even levels use #.
Description:
You need to implement a Java program that:

Takes an integer 
N (number of levels) as input.
Generates and prints the pyramid pattern according to the rules described.
Input Format:
Single line: Integer 
N (Number of levels)
Output Format:
Pyramid pattern with 
N levels, where odd levels use * and even levels use #.

Sample Input:
3
Sample Output:
*

*** 
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
 
        Scanner scanner = new Scanner(System.in);
        
        // Take the number of levels as input
        int N = scanner.nextInt();
        
        // Generate the pyramid pattern
        for (int i = 1; i <= N; i++) {
            // Print symbols for the current level
            for (int j = 1; j <= i; j++) {
                // Check if the level is odd or even
                if (i % 2 == 1) {
                    System.out.print("*"); // Odd levels use *
                } else {
                    System.out.print("#"); // Even levels use #
                }
            }
            System.out.println(); // Move to the next line after each level
        }

        //..... YOUR CODE ENDS HERE .....
    }
}
