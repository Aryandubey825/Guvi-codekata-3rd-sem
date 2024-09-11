/*Student Grading System

Problem Statement:
Implement a student grading system using OOP principles. The system should handle multiple students and calculate their grades based on different criteria.

Description:
Your task is to create a Java program that models a student grading system. You need to create a class Student with attributes like name, marks, and grade. Create methods to add marks, calculate grades, and display student details. The grade should be calculated based on the average of the marks.

Input Format:
The first line contains an integer N, the number of operations.
The next N lines contain operations in the format add <name> <marks>, calculate <name>, or display <name>.
Output Format:
Print the result of each operation. For add, print "Marks added". For calculate, print "Grade calculated". For display, print the student's details.

Sample Input:
4 
add John 85 
add John 90 
calculate John 
display John
Sample Output:
Marks added 
Marks added 
Grade calculated 
John: 87.5 - B

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// Class to represent a student
class Student {
    private String name;
    private ArrayList<Integer> marks;
    private String grade;

    // Constructor for the Student class
    public Student(String name) {
        this.name = name;
        this.marks = new ArrayList<>();
        this.grade = "Not calculated";
    }

    // Method to add marks to the student
    public void addMarks(int mark) {
        marks.add(mark);
    }

    // Method to calculate the grade based on average marks
    public void calculateGrade() {
        if (marks.isEmpty()) {
            this.grade = "No marks available";
            return;
        }

        double total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = total / marks.size();

        if (average >= 90) {
            this.grade = "A";
        } else if (average >= 80) {
            this.grade = "B";
        } else if (average >= 70) {
            this.grade = "C";
        } else if (average >= 60) {
            this.grade = "D";
        } else {
            this.grade = "F";
        }
    }

    // Method to display the student's details
    public void display() {
        double total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = marks.isEmpty() ? 0 : total / marks.size();
        System.out.println(name + ": " + average + " - " + grade);
    }
}

// Class to represent the student grading system
class StudentGradingSystem {
    private HashMap<String, Student> students;

    // Constructor for the StudentGradingSystem class
    public StudentGradingSystem() {
        this.students = new HashMap<>();
    }

    // Method to add marks for a student
    public void addStudentMarks(String name, int marks) {
        // If the student does not exist, add them to the system
        if (!students.containsKey(name)) {
            students.put(name, new Student(name));
        }
        // Add marks to the student's record
        students.get(name).addMarks(marks);
        System.out.println("Marks added");
    }

    // Method to calculate a student's grade
    public void calculateStudentGrade(String name) {
        if (students.containsKey(name)) {
            students.get(name).calculateGrade();
            System.out.println("Grade calculated");
        } else {
            System.out.println("Student not found");
        }
    }

    // Method to display a student's details
    public void displayStudent(String name) {
        if (students.containsKey(name)) {
            students.get(name).display();
        } else {
            System.out.println("Student not found");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGradingSystem gradingSystem = new StudentGradingSystem(); // Create the grading system

        int N = Integer.parseInt(scanner.nextLine().trim()); // Number of operations

        // Process each operation
        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ", 3);

            String operation = parts[0];
            String name = parts[1];

            if (operation.equals("add")) {
                // Trim the extra spaces before parsing the marks
                int marks = Integer.parseInt(parts[2].trim());
                gradingSystem.addStudentMarks(name, marks);
            } else if (operation.equals("calculate")) {
                gradingSystem.calculateStudentGrade(name);
            } else if (operation.equals("display")) {
                gradingSystem.displayStudent(name);
            }
        }

        scanner.close();
    }
}