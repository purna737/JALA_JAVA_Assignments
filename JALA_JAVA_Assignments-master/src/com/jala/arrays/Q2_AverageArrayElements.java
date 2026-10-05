package com.jala.arrays;

public class Q2_AverageArrayElements {

    static void calculateAverage(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("Average of array elements: " + average);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        calculateAverage(arr);
    }
}