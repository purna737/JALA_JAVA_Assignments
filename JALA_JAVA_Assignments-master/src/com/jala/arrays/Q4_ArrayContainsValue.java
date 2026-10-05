package com.jala.arrays;

public class Q4_ArrayContainsValue {

    static void checkValue(int[] arr, int value) {

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == value) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(value + " is present in the array");
        } else {
            System.out.println(value + " is not present in the array");
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        checkValue(arr, 30);
    }
}