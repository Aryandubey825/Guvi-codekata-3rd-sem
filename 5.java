/*Grade Classification

Problem Statement:
Write a program that classifies grades based on the score input by the user. The program should classify the score into "Excellent", "Good", "Average", "Pass", or "Fail" using if-else statements.

Description:
The program should read the scores continuously until the user inputs a stop value. The classification is based on the following criteria:

90-100: Excellent
75-89: Good
50-74: Average
35-49: Pass
0-34: Fail

Input Format:
The first line contains an integer n (number of scores).
The second line contains n integers separated by spaces.
The input stops when the user enters -1.
Output Format:
For each score, print its classification.

Sample Input:
5 
95 85 65 45 30 -1
Sample Output:
Excellent 
Good 
Average 
Pass 
Fail */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //..... YOUR CODE STARTS HERE .....
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++) {
                int num=scanner.nextInt();
                if(num>=90 && num<=100) {
                    System.out.println("Excellent");
                }
                else if(num>=75 && num<=89) {
                    System.out.println("Good");
                }
                else if(num>=50 && num<=74) {
                    System.out.println("Average");
                }
                else if(num>=35 && num<=49) {
                    System.out.println("Pass");
                }
                else if(num>=0 && num<=34) {
                    System.out.println("Fail");
                }
                else {
                    System.out.println("inavlid");
                }
                if (num==-1) {
                    break;
                }
        }   
                
                
                
        
        
        //..... YOUR CODE ENDS HERE .....
        
    }
}