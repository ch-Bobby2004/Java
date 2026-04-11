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
public class Array_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arry = {5,4,1,2,3,33,55,33,88,33,55};
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        int i = 0;
        int flag = 0;
        while (i<arry.length){
            if(num==arry[i])
                flag =1;
            i++;
        }
        if(flag==1){
            System.out.println(num + "  present in array");
        }
        else {
            System.out.println(num + " not present in array");

        }
    }
    
}
