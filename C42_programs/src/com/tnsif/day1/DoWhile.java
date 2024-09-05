package com.tnsif.day1;

public class DoWhile {
	public static void main(String[] args) {
		//Initialize the statement
		int i=10;
		
		//check the while statement 
		//condition is not satisfied run a do statement one time 
		do {
			System.out.println(i);
			//condition is not satisfied the loop will be continuously run
			//so the i++ is given to satisfied the condition
			//when the condition is satisfied the loop is stop 
			i++;
		}while(i<=12);

	}


}
