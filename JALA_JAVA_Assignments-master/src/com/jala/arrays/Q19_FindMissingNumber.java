package com.jala.arrays;

public class Q19_FindMissingNumber {

    static void findMissingNumber(int[] arr) {

        int n = 100;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number: " + missingNumber);
    }

    public static void main(String[] args) {

        int[] arr = new int[99];

        int index = 0;

        for (int i = 1; i <= 100; i++) {

            if (i != 57) {
                arr[index] = i;
                index++;
            }
        }

        findMissingNumber(arr);
    }
}