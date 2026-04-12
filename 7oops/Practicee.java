/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.oops;

/**
 *
 * @author pc
 */
class Student {
    int id;
    String name;
    int m1, m2, m3;
    int total;
    double percentage;

    // Constructor
    Student(int id, String name, int m1, int m2, int m3) {
        this.id = id;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    // Method to calculate total and percentage
    void calculate() {
        total = m1 + m2 + m3;
        percentage = total / 3.0;
    }

    // Method to find result
    void result() {
        if (percentage >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }

    // Display method
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total: " + total);
        System.out.println("Percentage %.2f: " +  String.format("%.2f", percentage));
        result();
        System.out.println("----------------------");
    }
}
public class Practicee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student(1, "Amit", 80, 75, 90);
        Student s2 = new Student(2, "Rahul", 30, 40, 35);

        s1.calculate();
        s2.calculate();

        s1.display();
        s2.display();
    }
    
}
