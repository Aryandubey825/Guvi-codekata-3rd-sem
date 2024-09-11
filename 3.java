/*Variable Transformation Challenge

Problem Statement:
In a parallel universe, the concept of variable transformation is quite different. You need to write a Java program that performs a series of operations on variables based on specific conditions. Given three integers a, b, and c, your task is to transform these variables according to the following rules and output the final values.

Description:

If a is even, add b to a.
If b is odd, multiply c by 2.
If c is a multiple of 3, add a to c.
If the sum of a, b, and c is greater than 100, subtract 100 from each of a, b, and c.
Your program should then print the transformed values of 
a, b, and c in the format "a: [value], b: [value], c: [value]".

Input Format:
Three integers 
a, b, and c are given as input from the user, each on a new line.

Output Format:
Print the transformed values of 
a, b, and c in the specified format.

Sample input:
10
15
9

Sample output:
a: 25, b: 15, c: 43*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Check if 'a' is even and add 'b' to 'a' if true
        if (a % 2 == 0) {
            a += b;
        }

        // Check if 'b' is odd and multiply 'c' by 2 if true
        if (b % 2 != 0) {
            c *= 2;
        }

        // Check if 'c' is a multiple of 3 and add 'a' to 'c' if true
        if (c % 3 == 0) {
            c += a;
        }

        // Check if the sum of a, b, and c is greater than 100
        if (a + b + c > 100) {
            a -= 100;
            b -= 100;
            c -= 100;
        }

        // Print the transformed values of a, b, and c
        System.out.printf("a: %d, b: %d, c: %d%n", a, b, c);
    }
}