/*Library Management System

Problem Statement:
Design a library management system using OOP principles. The system should allow adding books, borrowing books, and returning books. Implement classes for Book and Library.

Description:
Your task is to create a Java program that models a library management system. You need to create a class Book with attributes for the book title, author, and a boolean to indicate if it is borrowed. Create another class Library that contains a list of books and methods to add a book, borrow a book by title, and return a book by title.

Input Format:
The first line contains an integer N, the number of operations.
The next N lines contain operations in the format add <title> <author>, borrow <title>, or return <title>.
Output Format:
Print the result of each operation. For borrow, print "Book borrowed" if successful or "Book not available" if not. For return, print "Book returned". For add, print "Book added".

Sample Input:
3 
add HarryPotter J.K.Rowling 
borrow HarryPotter 
return HarryPotter
Sample Output:
Book added 
Book borrowed 
Book returned */


import java.util.ArrayList;
import java.util.Scanner;

// Book class with attributes: title, author, and whether it is borrowed or not
class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    // Constructor for Book class
    public Book(String title, String author) {
        this.title = title.trim(); // Trimming spaces
        this.author = author.trim();
        this.isBorrowed = false; // initially, the book is not borrowed
    }

    // Method to borrow the book
    public boolean borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            return true;
        }
        return false;
    }

    // Method to return the book
    public void returnBook() {
        isBorrowed = false;
    }

    // Getter for the book title
    public String getTitle() {
        return title;
    }

    // Check if the book is currently borrowed
    public boolean isBorrowed() {
        return isBorrowed;
    }
}

// Library class to manage the collection of books
class Library {
    private ArrayList<Book> books;

    // Constructor for Library class
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a new book to the library
    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book added");
    }

    // Method to borrow a book by title
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title.trim())) {  // Trimming spaces here as well
                if (book.borrow()) {
                    System.out.println("Book borrowed");
                } else {
                    System.out.println("Book not available");
                }
                return;
            }
        }
        System.out.println("Book not available");
    }

    // Method to return a book by title
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title.trim())) {
                book.returnBook();
                System.out.println("Book returned");
                return;
            }
        }
        System.out.println("Book not found");
    }
}

// Main class to drive the program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();  // create a Library instance

        int N = scanner.nextInt();  // number of operations
        scanner.nextLine();  // consume the newline character

        // Loop through each operation
        for (int i = 0; i < N; i++) {
            String operation = scanner.nextLine();
            String[] parts = operation.split(" ", 2);

            String command = parts[0];
            String details = parts[1];

            if (command.equals("add")) {
                String[] bookDetails = details.split(" ", 2);
                String title = bookDetails[0];
                String author = bookDetails[1];
                library.addBook(title, author);
            } else if (command.equals("borrow")) {
                library.borrowBook(details);
            } else if (command.equals("return")) {
                library.returnBook(details);
            }
        }

        scanner.close();
    }
}