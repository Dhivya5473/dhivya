package com.tnsif.day3;

class Manager
{
	final void show() {
		System.out.println("Show method in parant class");
	}
}

class Employee extends Manager
{
	void show() {
		System.out.println("Show method in child class");
	}
}

public class Final {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.show();

	}

}
