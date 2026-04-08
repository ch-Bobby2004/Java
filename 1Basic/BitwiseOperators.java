/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.chapter;

/**
 *
 * @author pc
 */
public class BitwiseOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5, b = 3;

        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
        System.out.println("NOT: " + (~a));
        System.out.println("Left Shift: " + (a << 1));
        System.out.println("Right Shift: " + (a >> 1));
        
//        Ternary Operator

        int max = (a > b) ? a : b;
        System.out.println("Maximum: " + max);
    }
    
}
