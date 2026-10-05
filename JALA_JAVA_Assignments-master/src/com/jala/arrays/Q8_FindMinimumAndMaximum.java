package com.jala.arrays;

public class Q8_FindMinimumAndMaximum {

    static void findMinAndMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    public static void main(String[] args) {

        int[] arr = {40, 10, 50, 20, 30};

        findMinAndMax(arr);
    }
}
