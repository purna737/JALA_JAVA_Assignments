package com.jala.arrays;

public class Q5_RemoveElementFromArray {

    static void removeElement(int[] arr, int value) {

        int[] newArr = new int[arr.length - 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != value) {
                newArr[j] = arr[i];
                j++;
            }
        }

        System.out.println("Array after removing " + value + ":");

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        removeElement(arr, 30);
    }
}