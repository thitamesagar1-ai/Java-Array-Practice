package com.java.Array;

/**
 * SimpleArray - Program to print array elements with their index
 * Description: This program initializes an array and prints each element
 * along with its index position.
 */
public class SimpleArray {

    public static void main(String[] args) {
        // Main method - starting point of the program

        // Initialize an integer array with 10 elements
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 10};

        // Loop through the array from 0 to arr.length-1
        for (int i = 0; i < arr.length; i++) {
            // Print the current index and its corresponding value
            System.out.println("Element Index: " + i + ", Values: " + arr[i]);
        }
    }
}