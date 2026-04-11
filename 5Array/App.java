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
        int[] myArr = new int[5];
        myArr[0]=66;
        myArr[1]=61;
        myArr[2]=144;
        myArr[3]=99;
        myArr[4]=11;
        System.out.println(myArr[0]);

        int[] arry = {5,4,1,2,3};
        int value = 55;
        arry[3]=value;
        System.out.println(arry[0]);
        System.out.println(arry[3]);

        int index = 0;
//        while (index<5){
        while (index<arry.length){
            System.out.println(arry[index]);
            index++;
        }

        //array is a object and length is property of array object
    }
}
