package com.rzit;

import java.util.HashMap;

public class SumWithArrayIndex {
	
	// This question asked by Emaratech Dubai company
	// find index whose sum of two element is given 

	public static void main(String[] args) {
		int[] intArray = new int[] { 4, 7, 9, 2, 5, 3, 6 };
		int sumOf = 5;
		printIndexSumOf(intArray, sumOf);
		printIndexSumOfWithSingleLoop(intArray, sumOf);

	}

	private static void printIndexSumOf(int[] intArray, int sumOf) {
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i; j < intArray.length; j++) {
				if (sumOf == intArray[i] + intArray[j]) {
					System.out.println("first index " + i + "\t second index" + j);
					return;
				}
			}
		}
	}

	private static void printIndexSumOfWithSingleLoop(int[] intArray, int sumOf) {
		HashMap<Integer, Integer> targetMap = new HashMap<>();
		for (int i = 0; i < intArray.length; i++) {
			targetMap.put(intArray[i], i); // here index will be latest in case of duplicate array elements
			// here hashMap .contains method will o(1) because of it will check based on
			// haskKey , here logic is we are storing previous value and checking with required pair 
			if (targetMap.containsKey(sumOf - intArray[i])) {
				System.out.println("first index " + targetMap.get(sumOf - intArray[i]) + "\t second index" + i);
				return;
			}
		}
	}
}