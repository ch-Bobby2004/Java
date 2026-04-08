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
public class Practice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        create a program that determines if a number is positive,negative,or zero
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a Number : ");
    float num1 = sc.nextFloat();
    
    if(num1>0)
        System.out.println("Number is Positive");
    else if ( num1<0)
        System.out.println("Number is Negative");
    else
        System.out.println("Number is Zero");
    
    
    // create a program that determines if a number is odd or even
    
    if (num1 % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    
    
            
    

    }
    
}
