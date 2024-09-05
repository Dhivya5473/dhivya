package com.tnsif.day1;

public class Continue {
	public static void main(String[] args) {
		//normal iterating process
		for(int i=1; i<=10; i++) {
			//check the number is even 
			//when it's even continue statement is work
			//odd number is skipped
			if(i%2 !=0)
				continue;
			//now print only the even number
			System.out.print(i + " " );
			//output is 2 4 6 8 10
		}

	}

}
