/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.oops;

/**
 *
 * @author pc
 */
class Employee2 {
    int id;
    String name;

    void setDetails(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}
public class This {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee2 e1 = new Employee2();
        e1.setDetails(1, "AJ");
        e1.display();
    }
    
}
