package com.programs;

public class PalindromeNo {

	public static void main(String[] args) {
		int n = 12123;
		int temp = n;
		int rev = 0, rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (n == rev) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Not palindrome No");
		}
	}
}
