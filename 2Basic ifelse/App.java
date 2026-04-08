/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapter;

/**
 *
 * @author pc
 */
public class App {

    public static void main(String[] args) {
        int a = 10, b = 3;

        // 1️⃣ Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2️⃣ Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // 3️⃣ Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));

        // 4️⃣ Assignment Operators
        int c = 5;
        System.out.println("\nAssignment Operators:");
        c += 2;  // c = c + 2
        System.out.println("c += 2 : " + c);
        c -= 1;
        System.out.println("c -= 1 : " + c);
        c *= 2;
        System.out.println("c *= 2 : " + c);
        c /= 2;
        System.out.println("c /= 2 : " + c);

        // 5️⃣ Unary Operators
        int d = 10;
        System.out.println("\nUnary Operators:");
        System.out.println("d++ : " + d++);
        System.out.println("++d : " + ++d);
        System.out.println("d-- : " + d--);
        System.out.println("--d : " + --d);

        // 6️⃣ Bitwise Operators
        int m = 5, n = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n  : " + (m & n));
        System.out.println("m | n  : " + (m | n));
        System.out.println("m ^ n  : " + (m ^ n));
        System.out.println("~m     : " + (~m));
        System.out.println("m << 1 : " + (m << 1));
        System.out.println("m >> 1 : " + (m >> 1));

        // 7️⃣ Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max value = " + max);
    }
}
