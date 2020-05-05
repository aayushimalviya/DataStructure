package com.practice.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindMinimum {

	public int findMinimum(int[] arr) {
		int minimum = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < minimum) {
				minimum = arr[i];
			}
		}
		return minimum;

	}
	
	/***********Another Solution Using Streams*********/
	
	public int findMin(int[] arr) {
		OptionalInt minimum = Arrays.stream(arr).min();
		return minimum.getAsInt();

	}

	public static void main(String[] args) {
		FindMinimum min = new FindMinimum();
		int[] arr = { 2, 4, 1, 3 , 0};
		int minimum = min.findMinimum(arr);
		int minValue = min.findMin(arr);
		System.out.println("minimum element in array is:" + minimum);
		System.out.println("minimum element in array is:" + minValue);
	}

}
