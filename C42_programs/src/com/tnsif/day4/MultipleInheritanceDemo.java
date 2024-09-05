package com.tnsif.day4;

interface onee
{
	void show();
}

interface twoo
{
	void show();
}

class three
{
	public void display()
	{
		System.out.println("This is child");
	}
}

class four extends three implements twoo, onee
{
	public void show()
	{
		System.out.println("This is parent 1");
	}
	
	public void disp()
	{
		System.out.println("This is parent 2");
	}
}

public class MultipleInheritanceDemo {
	public static void main(String[] args) {
		four f = new four();
		f.disp();
		f.display();
		f.show();
	}

}
