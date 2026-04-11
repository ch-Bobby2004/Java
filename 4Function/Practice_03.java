package com.mycompany.chapter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author pc
 */
public class Practice_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Find LCM
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int lcm = (a > b) ? a : b; // start from bigger number

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;  // LCM found
            }
            lcm++;
        }

        System.out.println("LCM = " + lcm);
    }
    
  
    
}
