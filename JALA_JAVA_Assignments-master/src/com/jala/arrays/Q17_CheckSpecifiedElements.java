package com.jala.arrays;

public class Q17_CheckSpecifiedElements {

    static void checkElements(int[] arr, int first, int second) {

        boolean firstFound = false;
        boolean secondFound = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == first) {
                firstFound = true;
            }

            if (arr[i] == second) {
                secondFound = true;
            }
        }

        if (firstFound && secondFound) {
            System.out.println("Both " + first + " and " + second
                    + " are present in the array");
        } else {
            System.out.println("Both elements are not present in the array");
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 12, 15, 20, 23, 30};

        checkElements(arr, 12, 23);
    }
}