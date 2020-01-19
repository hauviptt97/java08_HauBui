package com.haubui.view;

public class Ex01 {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = 7;

		if (b >= a && b >= c) {
			System.out.println("Output: " + (a > c ? c + " " + a : a + " " + c) + " " + b);
		} else if (c >= a && c >= b) {
			System.out.println("Output: " + (a > b ? b + " " + a : a + " " + b) + " " + c);
		} else
			System.out.println("Output: " + (c > b ? b + " " + c : c + " " + b) + " " + a);
	}
}
