package com.practice.array;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingInteger {

	public int findFirstUnique(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}

		}

		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) == 1) {
				return arr[i];
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		FirstNonRepeatingInteger x = new FirstNonRepeatingInteger();
		int arr[] = { 2, 2, 4, 1, 3, 4, 3, 5, 6, 8 };
		int unique = x.findFirstUnique(arr);
		System.out.println("First Non Repeating Integer:" + unique);

	}

}
