package com.practice.array;

import java.util.Scanner;

public class FindSum {

	public int[] findSum(int[] arr, int n) {
		int[] newArr = new int[2];
		boolean detect = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - 1; j++) {      
				if (arr[i] + arr[j] == n) {
					newArr[0] = arr[i];
					newArr[1] = arr[j];
					detect = true;
					break;
				}
			}
		}

		if (detect == false) {
			return arr;
		}
		return newArr;
	}
	
	
	

	public static void main(String[] args) {
		FindSum sum = new FindSum();
		System.out.println("enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int ar[] = { 3, 5, 4, 89, 12, 34, 54, 16, 68, 85 };
		int[] resultArr = sum.findSum(ar, n);
		System.out.print("arr = {");
		for (int i = 0; i < resultArr.length; i++) {
			System.out.print(resultArr[i] + " ");
		}
		System.out.print("}");
	}

}
