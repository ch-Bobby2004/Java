/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.chapter;

/**
 *
 * @author pc
 */
public class Array_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        
        String word = fruits[2];  // take element at index 2

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));  //charAt(i) → gets one character at a time
        }

    }
    
}
