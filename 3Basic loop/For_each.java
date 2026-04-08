/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.basic;

/**
 *
 * @author pc
 */
public class For_each {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        for-each Loop
        int arr[] = {1, 2, 3, 4};

        for(int x : arr) {
            System.out.println(x);
        }
        
        for(int i = 1; i <= 5; i++) {
            if(i == 3) break;
            System.out.println(i);
        }
        
        for(int i = 1; i <= 5; i++) {
            if(i == 3) continue;
            System.out.println(i);
        }
    }
    
}
