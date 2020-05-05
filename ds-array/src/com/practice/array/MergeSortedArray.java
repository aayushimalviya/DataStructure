package com.practice.array;

import java.util.Arrays;

public class MergeSortedArray {

	public int[] mergeArrays(int arr1[], int arr2[]) {
		int size = arr1.length + arr2.length;
		int result_index = 0;
		int mergerdArr[] = new int[size];
		for (int i = 0; i < arr1.length; i++) {
			mergerdArr[result_index++] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			mergerdArr[result_index++] = arr2[i];
		}

		Arrays.sort(mergerdArr);

		return mergerdArr;

	}

	public static void main(String[] args) {
		MergeSortedArray m = new MergeSortedArray();
		int arr1[] = { 12, 50, 46, 38, 29 };
		int arr2[] = { 21, 13, 4, 27, 90 };
		int resultArray[] = m.mergeArrays(arr1, arr2);
		System.out.println("merged sorted array : ");
		for (int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i] + " ");
		}

	}

}
