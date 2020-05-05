package com.practice.array;

public class RearrangePositiveNegative {

	/*
	 * public void rearrange(int[] arr) {
	 *  Arrays.sort(arr); 
	 * }
	 */

	public void rearrange(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}

	}

	public static void main(String[] args) {
		RearrangePositiveNegative rearrange = new RearrangePositiveNegative();
		int[] arr = { 0, -3, 4, 2, -9, -1, 5, -6, 8 };
		rearrange.rearrange(arr);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}