package com.haubui.view;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println(get200thPrimeNumber());
	}

	public static boolean isPrime(int number) {
		if (number <= 1)
			return false;

		for (int i = 2; i < number; i++)
			if (number % i == 0) {
				return false;
			}

		return true;
	}

	public static int get200thPrimeNumber() {
		int result = 2;
		int count = 1;
		while (count <= 200) {
			if (isPrime(result)) {
				count++;
			}
			result++;
		}
		return result - 1;
	}
}
