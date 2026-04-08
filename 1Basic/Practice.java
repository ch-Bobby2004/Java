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
        // TODO code application logic here
//    Add two numbers
    Scanner sc = new Scanner(System.in);
    System.out.println("Add two numbers");
    System.out.print("Enter a first number : ");
    float num1 = sc.nextFloat();
     System.out.print("Enter a second number : ");
    float num2 = sc.nextFloat();
    float result = num1+num2;
    System.out.print(num1 +" + "+ num2 + " = "+result );



    }
    
}
