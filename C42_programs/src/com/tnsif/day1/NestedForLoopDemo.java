package com.tnsif.day1;

public class NestedForLoopDemo {
	public static void main(String[] args) {
		int start = 2;
		int end = 10;
		for(int i=start; i<=end; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(j+"x"+i+"="+i*j);
			}
			System.out.println();
		}

	}


}
