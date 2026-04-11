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
public class Function_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int first = readNumber();
        int second = readNumber();
        int sum = first + second;
        System.out.println("Sum of number is "+sum);
       
    }
        public  static  int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        return  input.nextInt();
    }
    
}
