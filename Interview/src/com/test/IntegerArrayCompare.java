package com.test;

public class IntegerArrayCompare {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 0, 40, 0, 50};

        // Sort the array with zeros at the end
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if ((arr[j] == 0) && (arr[j + 1] != 0)) {
                    // Swap elements to move zero to the end
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else if ((arr[j] > arr[j + 1]) && (arr[j + 1] != 0)) {
                    // Swap elements for ascending order, ignoring zeros
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}