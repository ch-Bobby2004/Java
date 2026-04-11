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
public class Array_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arry = {5,4,1,2,3,33,55,33,88,33,55};
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        boolean found = isFound(arry,num);
        
            if(found)
            System.out.println(num + "  present in array");
        else 
            System.out.println(num + " not present in array");

   
    
       
    }
    public static boolean isFound(int[] arr, int num){
        int i = 0;
        while (i<arr.length){
            if(num==arr[i])
                return true;
            i++;
        }
        return false;
        
    }
    
}
