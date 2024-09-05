package com.tnsif.day4;

class one 
{
	void disp(int c)
	{
		System.out.println("The disp method in one class");
	}
}


class two extends one
{
	void disp(int c)
	{
		System.out.println(c);
	}
}

public class Override {

	public static void main(String[] args) {
		two t = new two();
		t.disp(29);

	}

}
