/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.chapter;


/**
 *
 * @author pc
 */
public class Function_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        greeting();
        pattern();
        
    }
    public static void greeting(){
        System.out.println("wellcome bro");
        
    }
    public static void pattern(){
        int i = 0;  
        while(i<5){
            System.out.print("*");
            int j=0;
            while(j<i){
                System.out.print(" *");
                j++;
            }
            i++;
            System.out.print("\n");
        }
    }
    
}
