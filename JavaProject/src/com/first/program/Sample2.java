package com.first.program;

public class Sample2 {

	public static void main(String[] args) {
		
		Sample2.add(15,20f);
		Sample2.add(30,60);
		
		
	}
	
	public static void add(int a,float b) 
		{
			float sum=a+b;
			System.out.println(sum);
			
		}
	public static void add(int a,int b) 
		{
			int sum=a+b;
			System.out.println(sum);
		}

}
