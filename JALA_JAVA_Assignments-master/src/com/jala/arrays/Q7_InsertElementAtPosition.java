package com.jala.arrays;

public class Q7_InsertElementAtPosition {

    static void insertElement(int[] arr, int value, int position) {

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        newArr[position] = value;

        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println("Array after insertion:");

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        insertElement(arr, 25, 2);
    }
}