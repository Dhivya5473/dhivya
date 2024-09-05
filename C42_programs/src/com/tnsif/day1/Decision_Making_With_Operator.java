package com.tnsif.day1;

public class Decision_Making_With_Operator {
	public static void main(String[] args) {
		//Initializing  the elements
		int x=8, y=7;
		int a=10;
		int b=11;
		
		//compare the variables
		if(x>=y) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		//gate statement is used to compare
		if(!(a<b) || (a==b)) {
			System.out.println("Condition is True");
		}
		else {
			System.out.println("Condition is False");
		}

	}

}
