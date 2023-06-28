package com.first.program;

public class Sample {
	int sum;
	float sum1;
	public static void main(String args[])
	{
		Sample obj=new Sample();
		obj.add(4,9);
		obj.add(45,6,10);
		obj.add(12.8f,9.4f);
		
	
	}
	public void add(int a,int b)
	{
		sum=a+b;
		System.out.println(sum);
	}
	public void add(int a,int b,int c)
	{
		sum=a+b+c;
		System.out.println(sum);
	}
public void add(float a,float b)
	{
		sum1=a+b;
		System.out.println(sum1);
	}		
		
	

}
