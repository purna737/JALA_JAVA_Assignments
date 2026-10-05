package com.jala.arrays;

public class Q3_FindArrayElementIndex {

    static void findIndex(int[] arr, int value) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == value) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }

        System.out.println("Element not found");
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        findIndex(arr, 30);
    }
}