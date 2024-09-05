package com.tnsif.day1;

public class ForEachLoopDemo {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};	
		//for integer array
		// i is a variable name and call the a
				for(int i:a)
				{
					System.out.println(i);
				}
				
				char ch[]= {'j','a','v','a'};
				for(char c:ch){
					System.out.print(c);
				}
				//we can't use println in above ch
				//so we use a empty prit statement for the next line
				System.out.println(" ");
				String s1[]= {"Java","programming","learning"};
				//for String array
				for(String s:s1){
					System.out.print(s+" ");		
				}
	}

}
