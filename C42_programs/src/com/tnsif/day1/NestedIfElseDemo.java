package com.tnsif.day1;

public class NestedIfElseDemo {
	public static void main(String[] args) {
		int a=10,b=20,c=5;
		System.out.println("The largest number is :");
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}
			System.out.println(c);
		}
		else {
			if(c>b) {
				System.out.println(c);
			}
			else {
				System.out.println(b);
			}
		}

	}

}
