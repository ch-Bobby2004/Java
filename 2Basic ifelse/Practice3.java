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
public class Practice3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        create a program that determines the greatest of the three number

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Greatest number is: " + a);
        }
        else if (b >= a && b >= c) {
            System.out.println("Greatest number is: " + b);
        }
        else {
            System.out.println("Greatest number is: " + c);
        }
        
//        create a program that determines if a given year ia a leap year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year % 400 == 0)
            System.out.println("Leap Year");
        else if (year % 100 == 0)
            System.out.println("Not Leap Year");
        else if (year % 4 == 0)
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
        
        
//        create a program that calculate grades based on marks
        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        
//        create a program to check a number is even or odd with the help of bitwise operator
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Bitwise AND with 1
        if ((num & 1) == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
    
    
}
