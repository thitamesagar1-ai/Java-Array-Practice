package com.java.Array;

/**
 * PrintArray - Program to print array elements
 * This program demonstrates how to use a method to display an array
 */
public class SeperateMethod {

    /**
     * Displays all elements of the given array
     
     */
    static void displayArray(int[] arr) {
        // Loop through each element of the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // Print current element
        }
    }

    public static void main(String[] args) {
        // Main method - program execution starts here

        // Initialize an array with 5 numbers
        int[] numbers = {10, 20, 30, 40, 50};

        // Call the method to display the array
        displayArray(numbers);
    }
}