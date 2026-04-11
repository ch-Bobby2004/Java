/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapter;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class App {

    public static void main(String[] args) {
        
        
//        While LOOP
        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (i <= 5) {
            System.out.println("i is: " + i);
            i++; // increment to avoid infinite loop
        }

        int j = 1;

        while (true) {
            if (j > 5) break;
            System.out.println(j);
            j++;
        }
        
        int num =50;
        while(num>=20){
            System.out.println(num);
            num--;
        }
        
        
        float add=0;
        int z =0;
        
        while(z<=2 )
        {
            System.out.print("Enter a three number ");
         float inp = sc.nextFloat();
        System.out.println("Entered number is : " + inp);
        add+=inp;
        z++;
            
        }
        System.out.println("addition of a number is : " + add);

        
    }
}
