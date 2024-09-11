/*OOPs Features & Interface

Problem Statement
Implement an interface Employee with methods calculateSalary and getDetails. Create two classes FullTimeEmployee and PartTimeEmployee that implement this interface. Each class should have its own way of calculating salary.

Description
Define an interface Employee with methods double calculateSalary() and String getDetails().
Create a class FullTimeEmployee with properties name (String), monthlySalary (double) and implement the interface methods.
Create a class PartTimeEmployee with properties name (String), hourlyRate (double), and hoursWorked (int) and implement the interface methods.
Ensure each class has a constructor to initialize its properties.

Input Format
String representing the employee type (FullTimeEmployee or PartTimeEmployee).
If FullTimeEmployee, a string for name and a double for monthlySalary.
If PartTimeEmployee, a string for name, a double for hourlyRate, and an integer for hoursWorked.
Output Format
String representing the employee details.
Double representing the calculated salary.

Sample Input 1:
FullTimeEmployee
John
3000.0
Sample Output 1:
Name: John, Salary: 3000.0

Sample Input 2:
PartTimeEmployee
Jane
15.0
120
Sample Output 2:
Name: Jane, Salary: 1800.0*/


import java.util.Scanner;

// Define the Employee interface
interface Employee {
    double calculateSalary();   // Method to calculate salary
    String getDetails();        // Method to get employee details
}

// FullTimeEmployee class implementing Employee interface
class FullTimeEmployee implements Employee {
    private String name;
    private double monthlySalary;

    // Constructor to initialize name and monthly salary
    public FullTimeEmployee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    // Calculate the salary (for full-time employees, it's just the monthly salary)
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    // Return employee details
    @Override
    public String getDetails() {
        return "Name: " + name;
    }
}

// PartTimeEmployee class implementing Employee interface
class PartTimeEmployee implements Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    // Constructor to initialize name, hourly rate, and hours worked
    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Calculate the salary (for part-time employees, it's hourlyRate * hoursWorked)
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Return employee details
    @Override
    public String getDetails() {
        return "Name: " + name;
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Input handling
        Scanner scanner = new Scanner(System.in);

        // Read employee type
        String employeeType = scanner.next();

        Employee employee = null;

        // Check the employee type and create the respective employee object
        if (employeeType.equalsIgnoreCase("FullTimeEmployee")) {
            String name = scanner.next();
            double monthlySalary = scanner.nextDouble();
            employee = new FullTimeEmployee(name, monthlySalary);
        } else if (employeeType.equalsIgnoreCase("PartTimeEmployee")) {
            String name = scanner.next();
            double hourlyRate = scanner.nextDouble();
            int hoursWorked = scanner.nextInt();
            employee = new PartTimeEmployee(name, hourlyRate, hoursWorked);
        } else {
            System.out.println("Invalid employee type");
            scanner.close();
            return;
        }

        // Output employee details and calculated salary
        System.out.println(employee.getDetails() + ", Salary: " + employee.calculateSalary());

        scanner.close();
    }
}