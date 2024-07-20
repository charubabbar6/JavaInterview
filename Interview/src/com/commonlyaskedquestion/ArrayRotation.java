package com.commonlyaskedquestion;
/*2. Array Rotation

Rotate the array clockwise and anticlockwise by no of positions.*/

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int num = 2;
        rightRotation(arr, num);
        leftRotation(arr,num);
	}

	private static void leftRotation(int[] arr, int num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < num; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.println("Input Array After Left Rotation By " + num +
         " Positions :");

        System.out.println(Arrays.toString(arr));
		
	}

	private static void rightRotation(int[] arr, int num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < num; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
		}
		System.out.println("Input Array After Right Rotation By " + num + 
		        " Positions :");

		        System.out.println(Arrays.toString(arr));
	}

}
