package com.tnsif.day3;

public class Inheritance {
public static void main(String[] args) {
		
	    //single inheritance
		puppy puppy = new puppy();
		puppy.bark();
		puppy.sleep();
		
		//multilevel inheritance
		//child class 1
		car c= new car();
		c.drive();
		c.start();
		
		//child class 2
		bike b= new bike();
		b.ride();
		c.drive();
		b.start();
		
		//hierarchical
		Rose r= new Rose();
		r.bloom();
		r.blooming();
		
		Tulip t= new Tulip();
		t.bloom();
		t.bud();
	}
}
	
	class Dog
	{
		void bark()
		{
			System.out.println("The dog is barking");
		}
	}
	//child class 
	class puppy extends Dog
	{
		void sleep()
		{
			System.out.println("The Puppy is sleeping");
		}
}

	
	//multilevel inheritance
	
	//parent class
	class vehical{
		
		void start() {
			System.out.println("The vehicle is started");
		}
	}
	
	//child class 1
class car extends vehical{
		
		void drive() {
			System.out.println("The car is driven by driver");
		}
	}

//child class 2
class bike extends car{
	
	void ride() {
		System.out.println("The bike is ride by rider");
	}
}


//hierarchical inheritance
//parent class

class Flower{
	void bloom() {
		System.out.println("The flower is about bloom");
	}
}

class Rose extends Flower{
	void blooming() {
		System.out.println("The flower is about blooming");
	}
}

class Tulip extends Flower{
	void bud() {
		System.out.println("The tulip is bud state");
	}

}
