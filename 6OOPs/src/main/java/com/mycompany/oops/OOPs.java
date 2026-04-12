/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oops;

/**
 *
 * @author pc
 */
class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is driving");
    }
}
public class OOPs {

    public static void main(String[] args) {
        Car c1 = new Car();  // object creation

        c1.color = "Red";
        c1.speed = 120;

        c1.drive();
        System.out.println(c1.speed);
    }
}
