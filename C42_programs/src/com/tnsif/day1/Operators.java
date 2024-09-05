package com.tnsif.day1;

public class Operators {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		 int x = 10;
		System.out.println("a and b value before the operations: " + a + " " + b);
		//a and b value before the operations: 10 20

		++a;//11
		//12+20+12
		int c = ++a + b + a--;
		System.out.println("c value after the operations: " + c);
		//c value after the operations: 44

		//45+11+19
		int d = c++ + a + b--;
        System.out.println("d value after the operations: " + d);
    	//d value after the operations: 75

		System.out.println("a , b,c,d values after the operations: " + a + " " + b + " " + c + " " + d);
		//a , b,c,d values after the operations: 11 19 45 75
				
		//Ternary operator demonstration
		  x = (10 == x) ? 1 : 0;	
		  System.out.println(x);
		  //1
	}


}
