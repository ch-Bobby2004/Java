/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.chapter;

/**
 *
 * @author pc
 */
public class AssignmentOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;

        a += 5;
        System.out.println("a += 5: " + a);

        a -= 3;
        System.out.println("a -= 3: " + a);

        a *= 2;
        System.out.println("a *= 2: " + a);

        a /= 4;
        System.out.println("a /= 4: " + a);

        a %= 3;
        System.out.println("a %= 3: " + a);
        
//        Unary Operators
        System.out.println("Unary plus: " + (+a));
        System.out.println("Unary minus: " + (-a));
        System.out.println("Unary plus: " + (+a));

        System.out.println("Post Increment: " + (a++));
        System.out.println("After Post Increment: " + a);

        System.out.println("Pre Increment: " + (++a));

        System.out.println("Post Decrement: " + (a--));
        System.out.println("Pre Decrement: " + (--a));

        boolean b = true;
        System.out.println("Logical NOT: " + (!b));
    }
    
}
