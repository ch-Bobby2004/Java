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
public class Swap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First Number : ");
        float num1 = sc.nextFloat();
        
        System.out.print("Enter Second Number : ");
        float num2 = sc.nextFloat();
        
        System.out.println( "num1 = "+ num1 + " and "+"  num2= "+ num2);
        sc.nextLine(); // 🔴 Clear buffer
 
        System.out.print("You want swap these two number tell me Yes or No ");
        String ans = sc.nextLine();
        
        if(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes")){
//            equalsIgnoreCase() ignores uppercase / lowercase
            float num3 = num1;
            num1 = num2;
            num2 = num3;  
        }
        System.out.println("After swap:");
        System.out.print( "num1 = "+ num1 + " and "+"  num2= "+ num2);
        
        
        
        
        
    }
    
}
