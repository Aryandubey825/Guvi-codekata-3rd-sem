/*Dynamic Vehicle Registration System

Problem Statement:
You need to design a dynamic Vehicle Registration System where each vehicle can be of different types (Car, Motorcycle, or Truck) and should be able to report its registration details. Implement a base class Vehicle and three subclasses Car, Motorcycle, and Truck.

Description:

Create a base class Vehicle with:

A constructor to initialize the vehicle's registration number and owner’s name.
A method displayDetails() to display the vehicle's details.
Extend this base class with three subclasses:

Car with an additional attribute for the number of doors.
Motorcycle with an additional attribute for engine capacity.
Truck with an additional attribute for cargo capacity.

Input Format:
First line: Integer N (Number of operations to perform)
Next N lines: Each line will describe an operation in the format REGISTER <vehicle_type> <registration_number> <owner_name> <specific_attribute>.
Output Format:
For each operation, output the details of the registered vehicle.

Sample Input:
3
REGISTER Car ABC123 John 4
REGISTER Motorcycle XYZ789 Alice 600cc
REGISTER Truck LMN456 Bob 10000kg
Sample Output:
Vehicle: Car
Registration Number: ABC123
Owner: John
Number of Doors: 4
Vehicle: Motorcycle
Registration Number: XYZ789
Owner: Alice
Engine Capacity: 600cc
Vehicle: Truck
Registration Number: LMN456
Owner: Bob
Cargo Capacity: 10000kg */


import java.util.Scanner;

// Base class Vehicle
class Vehicle {
    protected String registrationNumber;
    protected String ownerName;

    // Constructor for Vehicle
    public Vehicle(String registrationNumber, String ownerName) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
    }

    // Method to display details - to be overridden in subclasses
    public void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner: " + ownerName);
    }
}

// Car class extending Vehicle
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String registrationNumber, String ownerName, int numberOfDoors) {
        super(registrationNumber, ownerName);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayDetails() {
        System.out.println("Vehicle: Car");
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Motorcycle class extending Vehicle
class Motorcycle extends Vehicle {
    private String engineCapacity;

    public Motorcycle(String registrationNumber, String ownerName, String engineCapacity) {
        super(registrationNumber, ownerName);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Vehicle: Motorcycle");
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity);
    }
}

// Truck class extending Vehicle
class Truck extends Vehicle {
    private String cargoCapacity;

    public Truck(String registrationNumber, String ownerName, String cargoCapacity) {
        super(registrationNumber, ownerName);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Vehicle: Truck");
        super.displayDetails();
        System.out.println("Cargo Capacity: " + cargoCapacity);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Check if input has an integer for number of operations
        if(scanner.hasNextInt()) {
            int N = scanner.nextInt();
            scanner.nextLine();  // Consume the leftover newline character

            // Process each operation
            for (int i = 0; i < N; i++) {
                if(scanner.hasNextLine()) {
                    String operation = scanner.nextLine();
                    String[] parts = operation.split(" ");

                    // Extract details from the input
                    String vehicleType = parts[1];
                    String registrationNumber = parts[2];
                    String ownerName = parts[3];
                    String specificAttribute = parts[4];

                    Vehicle vehicle = null;

                    // Determine which type of vehicle to register and create the object
                    switch (vehicleType) {
                        case "Car":
                            int numberOfDoors = Integer.parseInt(specificAttribute);
                            vehicle = new Car(registrationNumber, ownerName, numberOfDoors);
                            break;
                        case "Motorcycle":
                            vehicle = new Motorcycle(registrationNumber, ownerName, specificAttribute);
                            break;
                        case "Truck":
                            vehicle = new Truck(registrationNumber, ownerName, specificAttribute);
                            break;
                    }

                    // Display the vehicle details
                    if (vehicle != null) {
                        vehicle.displayDetails();
                    }
                }
            }
        } else {
            System.out.println("Invalid input format");
        }

        scanner.close();
    }
}