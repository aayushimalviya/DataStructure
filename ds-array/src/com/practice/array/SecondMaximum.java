package com.practice.array;

import java.util.Arrays;

public class SecondMaximum {
	public int secondMaximum(int[] arr) {
		Arrays.sort(arr);// DualPivotQuicksort
		int size = arr.length;
		return arr[size - 2];
	}

	public static void main(String[] args) {
		SecondMaximum max = new SecondMaximum();
		int[] arr = { 32, 45, 31, 63, 75, 89, 67, 100 };
		int secondMax = max.secondMaximum(arr);
		System.out.println("second maximum element in array is:" + secondMax);

	}

}
