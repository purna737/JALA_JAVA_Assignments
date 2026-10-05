package com.jala.arrays;

public class Q13_FindSecondLargest {

    static void findSecondLargest(int[] arr) {

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second largest element: " + secondLargest);
    }

    public static void main(String[] args) {

        int[] arr = {10, 40, 20, 50, 30};

        findSecondLargest(arr);
    }
}