/*Polymorphic Zoo

Problem Statement:
Create a program that models a zoo with animals demonstrating polymorphism. Each animal should have a speak method, but the sound they make depends on the type of animal. Implement a system that allows adding different animals to the zoo and prints their sounds.

Description:
Your task is to design a Java program that uses polymorphism to model a zoo. You need to create an abstract class Animal with a method speak(). Then, create at least three subclasses (Lion, Elephant, Monkey) that override the speak() method to return their respective sounds. The program should allow the user to add animals to the zoo and then print out the sounds of all animals in the zoo.

Input Format:
The first line of input contains an integer N, the number of animals.
The next N lines each contain a string representing the type of animal (Lion, Elephant, Monkey).
Output Format:
The output should be the sounds of all animals in the zoo, each on a new line, in the order they were added.

Sample Input:
3
Lion
Elephant
Monkey
Sample Output:
Roar
Trumpet
Ooh Ooh Aah Aah */


import java.util.ArrayList;
import java.util.Scanner;

// Abstract class Animal with an abstract method speak()
abstract class Animal {
    public abstract String speak();  // Each animal will implement its own sound
}

// Lion class inheriting from Animal and overriding the speak method
class Lion extends Animal {
    @Override
    public String speak() {
        return "Roar";  // Lion sound
    }
}

// Elephant class inheriting from Animal and overriding the speak method
class Elephant extends Animal {
    @Override
    public String speak() {
        return "Trumpet";  // Elephant sound
    }
}

// Monkey class inheriting from Animal and overriding the speak method
class Monkey extends Animal {
    @Override
    public String speak() {
        return "Ooh Ooh Aah Aah";  // Monkey sound
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Input handling
        Scanner scanner = new Scanner(System.in);

        // Read the number of animals to be added to the zoo
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Create a list to hold animals in the zoo
        ArrayList<Animal> zoo = new ArrayList<>();

        // Read the animal type for each animal and add it to the zoo
        for (int i = 0; i < n; i++) {
            String animalType = scanner.nextLine().trim();

            // Create animal based on the input type and add to the zoo
            switch (animalType) {
                case "Lion":
                    zoo.add(new Lion());
                    break;
                case "Elephant":
                    zoo.add(new Elephant());
                    break;
                case "Monkey":
                    zoo.add(new Monkey());
                    break;
                default:
                    System.out.println("Unknown animal type: " + animalType);
                    break;
            }
        }

        // Output the sounds of all animals in the zoo
        for (Animal animal : zoo) {
            System.out.println(animal.speak());
        }

        scanner.close();
    }
}