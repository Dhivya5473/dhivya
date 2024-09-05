package com.tnsif.day3;

abstract class value1
{
	abstract void one();
}

class value2 extends value1
{
	public void one () {
		System.out.println("Abstract method in abstract class");
	}
}


public class Abstraction {

	public static void main(String[] args) {
		value2 val = new value2();
		val.one();
	}

}