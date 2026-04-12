/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.strings;

/**
 *
 * @author pc
 */
public class Strings {

    public static void main(String[] args) {
        // In Java, String is an object of the String class.
        //1. Using Literal (Most Common)
        String s1 = "Hello";
        //️ 2. Using new keyword
        String s = new String("Hello");
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(0));
        System.out.println(s1.equals(s));
        s1.equals(s);      // correct 
        //s1 == s2;           // wrong 
    }
}
