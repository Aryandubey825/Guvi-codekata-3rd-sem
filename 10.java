/*OOPs Features & Interface

Problem Statement:
Create an interface Shape with methods area and perimeter. Implement this interface in two classes: Rectangle and Circle. Each class should have appropriate constructors and methods to calculate the area and perimeter.

Description:
Define an interface Shape with methods double area() and double perimeter().

Create a class Rectangle that implements Shape with properties length and width.
Create a class Circle that implements Shape with property radius.
Ensure the Rectangle and Circle classes have constructors to initialize their properties.
Implement the methods area and perimeter in both classes.
Input Format:
String representing the shape type (Rectangle or Circle).
If Rectangle, two doubles representing length and width.
If Circle, one double representing radius.
Output Format:
Double representing the area of the shape.
Double representing the perimeter of the shape.

Sample Input:
Rectangle
5
10
Sample Output:
Area: 50.0
Perimeter: 30.0 */


import java.util.Scanner;

// Define the Shape interface
interface Shape {
    double area();
    double perimeter();
}

// Rectangle class implementing the Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    @Override
    public double area() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

// Circle class implementing the Shape interface
class Circle implements Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the perimeter (circumference) of the circle
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Input handling
        Scanner scanner = new Scanner(System.in);

        // Reading the shape type
        String shapeType = scanner.next();

        Shape shape = null;

        // Check the shape type and create the appropriate object
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            double length = scanner.nextDouble();
            double width = scanner.nextDouble();
            shape = new Rectangle(length, width);
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            double radius = scanner.nextDouble();
            shape = new Circle(radius);
        } else {
            System.out.println("Invalid shape type");
            scanner.close();
            return;
        }

        // Output the results
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());

        scanner.close();
    }
}