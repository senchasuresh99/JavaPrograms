package com.programs;

public class ArmstrongNo {

	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int sum = 0, r;
		while (temp != 0) {
			r = temp % 10;
			//System.out.println(",,,,"+r);
			sum = sum + r * r * r;
			temp = temp / 10;
			//System.out.println(temp);s
		}
		if (n==sum) {
			System.out.println("Armstrong No");
		} else {
			System.out.println("Not Armstrong No");
		}
	}
}
