package com.tnsif.day1;

public class BreakDemo {
	public static void main(String[] args) {
		//using for loop for iterating the i value 5-10
		for(int i=5; i<=10; i++) {
			//hear check the i value is equal 
			//if it's equal the break statement will work and give no output
			//in this case i is not equal so the break statement not work so print the i value
			if(i == 4) 
				break;
				System.out.println(i);
				//output is 5 6 7 8 9 10
			
		}

	}

}
