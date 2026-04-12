/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.oops;

/**
 *
 * @author pc
 */
class Employee3 {
    int id;
    String name;

    // Constructor
    Employee3(int id, String name) {
        this.id = id;
        this.name = name;
    }
    Employee3(){}  // create default constructor   if no argument is pass 

    void display() {
        System.out.println(id + " " + name);
    }
}
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee3 e1 = new Employee3(1, "AJ");  // constructor called automatically
        e1.display();
         Employee3 e2 = new Employee3();  
        e2.display();
    }
    
}
