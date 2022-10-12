package com.programs;

public class RevNumber {

	public static void main(String[] args) {
		int no= 54321, rev=0, rem;
		while(no!=0) {
			//System.out.println(no);
			rem= no%10;
			rev=rev*10+rem;
			no=no/10;
			//System.out.println(no);
			//System.out.println(rev);
		}
		System.out.println(rev);
	}
}
