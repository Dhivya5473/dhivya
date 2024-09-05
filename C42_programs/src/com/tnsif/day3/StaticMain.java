package com.tnsif.day3;

class Student
{
	String name;
	int rollNum;
	static String teacherName;


void display() {
	System.out.println("Student name: "+name);
	System.out.println("Student rollNum: "+rollNum);
	System.out.println("Student teacherName: "+teacherName);
}
	static {
		Student.teacherName="Malar";
	
}
}
public class StaticMain {
	static void method()
	{
		System.out.println("Static keyword in this method");
	}
	

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name="George";
		s1.rollNum=1001;
		
		s2.name="Arivu";
		s2.rollNum=1002;
		
		
		s1.display();
		s2.display();
		
		method();
	}

}
