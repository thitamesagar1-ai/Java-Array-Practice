package com.java.Array;


public class ArrayAnalyzer {

    static void analyzeArray(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        int even = 0;
        int odd = 0;

        System.out.println("Array Elements:");

        for (int i = 0; i < arr.length; i++) {

            System.out.println(
                "Index " + i + " = " + arr[i]
            );

            sum += arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        double average = (double) sum / arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Even count = " + even);
        System.out.println("Odd count = " + odd);
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 30, 5, 40};

        analyzeArray(arr);
    }
}
