package com.haubui.view;

public class Ex03 {
	public static int revert(int number) {
		String result = "";
		while (number > 0) {
			result += number % 10;
			number /= 10;
		}
		return Integer.parseInt(result);
	}

	public static boolean isSymmetric(int number) {
		return number == revert(number);
	}

	public static void main(String[] args) {
		System.out.println(isSymmetric(13331));
	}
}
