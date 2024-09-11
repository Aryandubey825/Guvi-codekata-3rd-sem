 /*Odd-Even Sum Checker

Problem Statement:
Write a program that reads a list of integers from the user and checks if the sum of odd numbers is greater than the sum of even numbers in the list. If the sum of odd numbers is greater, print "Odd Sum Greater". If the sum of even numbers is greater , print "Even Sum Greater". If both sum's are equal, print "Equal".
Print "Equal" if both sum's are equal.

Description:
The program should continuously read integers until the user inputs a specific stop value. You need to handle edge cases where there are no odd or even numbers.

Input Format:
The first line contains an integer n (number of elements).
The second line contains n integers separated by spaces.
The input stops when the user enters -1.
Output Format:
Print "Odd Sum Greater" if the sum of odd numbers is greater.
Print "Even Sum Greater" if the sum of even numbers is greater.
Print "Equal" if both sum's are equal.

Sample input:
4 2 4 6 8 -1
Sample Output:
Even Sum Greater */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            //..... YOUR CODE STARTS HERE .....
            
        int evensum=0;
        int oddsum=0;
        int n = scanner.nextInt();
       
        
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();  
            
            if (num == -1) {
                break;  
            }
            
            if (num % 2 == 0) {
                evensum += num; 
            } else {
                oddsum += num; 
            }
        }
        
        
        if (oddsum > evensum) {
            System.out.println("Odd Sum Greater");
        } else if (evensum > oddsum) {
            System.out.println("Even Sum Greater");
        } else {
            System.out.println("Equal");
        }
            
            
            //..... YOUR CODE ENDS HERE .....
    }
}
