package com.practice.array;

public class RemoveEven {
	public int[] removeEven(int[] arr) {
	
		int oddNumbers = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddNumbers++;
			}
		}

		int newArr[] = new int[oddNumbers];
		int result_index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				newArr[result_index++] = arr[i];
			}
		}

		return newArr;

	}

	public static void main(String[] args) {
		RemoveEven c = new RemoveEven();
		int ar[] = { 2, 5, 7, 8, 5, 1, 2, 9 };
		System.out.println("Before removing even:");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();

		int a[] = c.removeEven(ar);

		System.out.println("After removing even:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
