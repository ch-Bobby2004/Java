/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.strings;

/**
 *
 * @author pc
 */
public class StrBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //       StringBuilder is a class used to create mutable (changeable) strings.
//    String s = "Hello";
//    s = s + " World";  // creates new object every time 
    //StringBuilder modifies same object ✅ (faster)
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");
        sb.delete(0, 2);

        System.out.println(sb);
  
    }
    
}
