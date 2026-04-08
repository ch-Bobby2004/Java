/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.chapter;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in); // Step 1: Create Scanner object

       // Step 2: Take an integer input
       System.out.print("Enter your age: ");
       int age = input.nextInt();  // Reads an int

       // Step 3: Take a string input
       input.nextLine();  // Consume leftover newline from nextInt()
       System.out.print("Enter your name: ");
       //nextLine() is a method of the Scanner class used to read a complete line of input, including spaces.
       String name = input.nextLine();  // Reads a full line

       // Step 4: Print the inputs
       System.out.println("Hello, " + name + "! You are " + age + " years old.");

       input.close();  // Optional: good practice to close the scanner




//       What it does:
//int age = input.nextInt();
//String name = input.nextLine(); // skipped
//nextInt() reads only the number
//It leaves the Enter key (\n) in the buffer
//nextLine() reads that leftover newline → empty string
//Always use an extra nextLine() after nextInt() before reading a string.
//nextLine() is skipped after nextInt() because the newline character remains in the input buffer.
    }
    
}
