/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.chapter;

/**
 *
 * @author pc
 */
public class Function_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        greet();
        int sum = add(5,5);
        System.out.println(sum);
        pattern();
    }
    
    public static void greet() {
        System.out.println("Hello from Java!");
    }

    public  static  int add(int a, int b){
        return  a+b;
    }

    public  static  void  pattern(){
        int rows =0;
        while (rows<5){
            int  i=0;
            while (i<=rows){
                System.out.print("* ");
                i++;
            }
            System.out.print("\n");
            rows++;
        }
    }
    
}
