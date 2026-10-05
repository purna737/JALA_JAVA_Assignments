package com.jala.arrays;

public class Q6_CopyArray {

    static void copyArray(int[] arr) {

        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        System.out.println("Copied array:");

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        copyArray(arr);
    }
}