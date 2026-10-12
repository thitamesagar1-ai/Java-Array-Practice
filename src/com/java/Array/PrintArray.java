package com.java.Array;

import java.util.Scanner; // Import Scanner class to take user input

/**
 * PrintArray - Dynamic Array Program
 * Description: Takes array size and elements from user and prints them with index
 */
public class PrintArray {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask user for array size
        System.out.println("Enter Array Size");
        int size = sc.nextInt();

        // Validate array size - size should be greater than 0
        if (size <= 0) {
            System.out.println("Invalid Array Size");
            sc.close();
            return; // Exit the program if size is invalid
        }

        // Create a new array with user-defined size
        int[] arr = new int[size];

        // Ask user to enter array elements
        System.out.println("Enter " + size + " elements");

        // Loop to read elements from user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Display all array elements with their index
        System.out.println("Array Elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index :" + i + " = " + arr[i]);
        }

        // Close scanner to prevent resource leak
        sc.close();
    }
}



















