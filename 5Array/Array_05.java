/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.chapter;

/**
 *
 * @author pc
 */
public class Array_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] numArr = new int[2][3];
        numArr[0][0]= 6;

        int[][] inArr= {{},{}};
        System.out.println(inArr.length);
        System.out.println(inArr[0].length);

        int[][] inArray = {{1,2,5},{3,4},{8,9,4}};
        System.out.println(inArray[0][2]);
//        System.out.println(inArray[1][2]); 
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

        int i = 0 ;
        while (i<inArray.length){
            int j = 0;
            while (j<inArray[i].length){
                System.out.print(inArray[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
