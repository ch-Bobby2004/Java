/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.chapter;

/**
 *
 * @author pc
 */
public class Practice_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //    write a function that calculate the factorial of given number
        int factorial = Factorial(5);
        System.out.println("Factorial of 5 is "+ factorial);
        
        
        
        int number = 5; // Change this to any number you want
        int result = factorial(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }
    
     public static int Factorial(int num) {
        int fac = 1; // Start with 1, not 0
        int i = num;
        while (i > 0) {
            fac *= i; // Multiply fac by i
            i--;
        }
        return fac;
    }
     
     public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
}
