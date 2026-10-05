package com.jala.arrays;

public class Q18_RemoveDuplicatesReturnNewArray {

    static int[] removeDuplicates(int[] arr) {

        int count = 0;

        // Count unique elements
        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                count++;
            }
        }

        // Create new array with unique elements
        int[] newArr = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                newArr[index] = arr[i];
                index++;
            }
        }

        return newArr;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10, 50};

        int[] newArr = removeDuplicates(arr);

        System.out.println("New array after removing duplicates:");

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}