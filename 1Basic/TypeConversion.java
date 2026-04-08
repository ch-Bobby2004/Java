/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.chapter;

/**
 *
 * @author pc
 */
public class TypeConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //   Automatic type conversion implicit type conversion
        float myFloat = 5;
        System.out.println(myFloat);
        float myFloat1 = 5L;   //l long
        System.out.println(myFloat1);


//        explicit type conversion(casting)
        int myInt =(int) 5.0f;
        System.out.println(myInt);

        float myInt2 =(float) 5;
        System.out.println(myInt2);
    }
    
}
