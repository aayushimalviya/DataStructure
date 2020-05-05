package com.practice.array;

public class RotateArrayByOneIndex {
	public void rotateArray(int[] arr) {
		int j = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = j;
	}

	public static void main(String[] args) {
		RotateArrayByOneIndex rotate = new RotateArrayByOneIndex();
		int[] arr = { 4, 5, 1, 2, 8, 9 };
		rotate.rotateArray(arr);
		for (int a : arr) {
			System.out.print(a +" ");
		}
	}
}
