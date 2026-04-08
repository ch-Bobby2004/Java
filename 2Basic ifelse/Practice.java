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
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    create a program that takes two numbers and shows result of all arithmetic operators
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter num1 : ");
    float num1 = sc.nextFloat();
    
    System.out.print("Enter num1 : ");
    float num2 = sc.nextFloat();
    
    System.out.println("you entered "+ num1 + " "+ num2);
    
        System.out.println("Arithmetic Operators:");
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));
        
        
//        Create a program to calculate a perimeter of rectangle
        float perimeter = 2*(num1 + num2);
        System.out.println("perimeter of rectangle = " + perimeter);
        
//        Create a program to calculate area of triangle
        System.out.print("Enter base: ");
        float base = sc.nextFloat();

        System.out.print("Enter height: ");
        float height = sc.nextFloat();

        float area = (base * height) / 2;

        System.out.println("Area of Triangle = " + area);
        
        
 //        Create a program to calculate simple interest
        System.out.print("Enter Principal: ");
        float p = sc.nextFloat();

        System.out.print("Enter Rate: ");
        float r = sc.nextFloat();

        System.out.print("Enter Time: ");
        float t = sc.nextFloat();

        float si = (p * r * t) / 100;

        System.out.println("Simple Interest = " + si);
        
        
        //        Create a program to calculate compound interest
        double amount = p * Math.pow((1 + r / 100), t);
        double ci = amount - p;

        System.out.println("Compound Interest = " + ci);
        System.out.println("Total Amount = " + amount);
        
        //create a program to convert Fahrenheit to Celsius
        
        System.out.print("Enter Fahrenheit : ");
        float F = sc.nextFloat();
        float C = (F-32)*5/9;
         System.out.println("Celsius = " + C);
        
        
    
    
    

        
    }
    
}
