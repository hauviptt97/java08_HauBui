package com.haubui.view;

public class Ex04 {
	public static void main(String[] args) {
		int numbers[] = { 44, 66, 100, 67, 33, 22, 55 };
		System.out.println(getSecondLargestOddNumber(numbers));
	}

	public static int getSecondLargestOddNumber(int[] numbers) {
		int max = numbers[0];
		int result = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				if (numbers[i] > max) {
					result = max;
					max = numbers[i];
				} else if (numbers[i] > result) {
					result = numbers[i];
				}
			}
		}
		return result;
	}
}
