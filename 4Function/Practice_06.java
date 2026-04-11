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
public class Practice_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // reverse the digit
                Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;          // get last digit
            reverse = reverse * 10 + digit; // add digit to reverse
            num = num / 10;                // remove last digit
        }

        System.out.println("Reversed number = " + reverse);
    }
    
}
