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
public class Practice_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//            multiplication table for a given number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        table(num);
        
        
        //   Create a program to sum all odd numbers from 1 to 100
       int sum =  sumOdd(num);
       System.out.print(sum);

    }
    //            multiplication table for a given number
    public static void table(int number){
        int i = 1;
        while (i<=10){
            System.out.println(i + " x " + number + " = " + (i*number));
            i++;
        }
    }
    
    //   Create a program to sum all odd numbers from 1 to 100
    public static int sumOdd(int num){
//        int i =1,add=0;
//        while(i<=num){
//            if(i%2!=0)
//                add+=i;
//            i++;
//        }
//           return add;
            int num2 = num/2;
            return num2*num2;
    }
    
}
