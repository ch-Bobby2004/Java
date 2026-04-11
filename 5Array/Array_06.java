/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.chapter;


/**
 *
 * @author pc
 */
public class Array_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        create a program to find sum and average of all element given in array
        int[] arr = z_ArrayUtility.inputArray();

        int sum = z_ArrayUtility.findSum(arr);
        
        double avg = z_ArrayUtility.findAverage(arr);
        
        int occr = z_ArrayUtility.findOccur(arr,3);
        
        

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("occr = " + occr);
         z_ArrayUtility.findMinMax(arr);
    }
    
        
}
