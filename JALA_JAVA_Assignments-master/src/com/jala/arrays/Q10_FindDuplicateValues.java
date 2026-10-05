package com.jala.arrays;

public class Q10_FindDuplicateValues {

    static void findDuplicates(int[] arr) {

        System.out.println("Duplicate values:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 50, 30};

        findDuplicates(arr);
    }
}