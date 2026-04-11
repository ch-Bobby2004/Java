/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class z_ArrayUtility {
      // Method to take array input
    public static int[] inputArray() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        return arr; // return array to main
        
        
    }
    // Method to find sum
    public static int findSum(int[] arr){
        int sum = 0;

        for(int num : arr){
            sum += num;
        }

        return sum;
    }

    // Method to find average
    public static double findAverage(int[] arr){
        int sum = findSum(arr);
        return (double) sum / arr.length;
    }
    
    //method to find number of occurances
    public static int findOccur(int[] arr,int num){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                count++;
            }   
        }  
        return count;
    }
    
//    min amd max element in array
public static void findMinMax(int[] arr){

    int min = arr[0];
    int max = arr[0];

    for(int num : arr){

        if(num < min){
            min = num;
        }

        if(num > max){
            max = num;
        }
    }

    System.out.println("Minimum = " + min);
    System.out.println("Maximum = " + max);
}


}
    
    
