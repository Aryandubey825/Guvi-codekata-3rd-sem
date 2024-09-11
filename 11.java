/*Access Modifiers

Problem Statement:
Create a class Person with private properties and public methods for accessing these properties. Ensure that the age of the person is always a positive value.

Description:
Define a class Person with private properties: name (String) and age (int).
Include public methods setName and setAge for setting the properties.
Include public methods getName and getAge for accessing the properties.
Ensure that the setAge method only allows positive values.

Input Format:
String representing the name of the person.
Integer representing the age of the person.
Output Format:
String representing the name of the person.
Integer representing the age of the person.
A message "Invalid age" indicating if the age is invalid.

Sample Input 1:
Alice
25
Sample Output 1:
Name: Alice
Age: 25

Sample Input 2:
Diana
0
Sample Output 2:
Invalid age */

import java.util.Scanner;

// Define the Person class
class Person {
    // Private properties
    private String name;
    private int age;

    // Public method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Public method to set the age, ensuring age is positive
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    // Public method to get the name
    public String getName() {
        return name;
    }

    // Public method to get the age
    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Input handling
        Scanner scanner = new Scanner(System.in);
        
        // Create a Person object
        Person person = new Person();
        
        // Read the input: name and age
        String name = scanner.next();
        int age = scanner.nextInt();

        // Set the name and age using the Person's methods
        person.setName(name);
        person.setAge(age);
        
        // If the age is valid, print the person's details
        if (age > 0) {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        }

        scanner.close();
    }
}