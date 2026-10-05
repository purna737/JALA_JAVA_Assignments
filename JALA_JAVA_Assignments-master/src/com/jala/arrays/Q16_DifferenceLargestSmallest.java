package com.jala.arrays;

public class Q16_DifferenceLargestSmallest {

    static void findDifference(int[] arr) {

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        int difference = largest - smallest;

        System.out.println("Largest value: " + largest);
        System.out.println("Smallest value: " + smallest);
        System.out.println("Difference: " + difference);
    }

    public static void main(String[] args) {

        int[] arr = {10, 40, 20, 50, 30};

        findDifference(arr);
    }
}