package com.tnsif.day8.Polymorphism;

public class Overloading {
	int num1;
	int num2;
	int result;
	
	void sum(int a,int b) //method we going to store variable numbers
	{
		num1=a;
		num2=b;
		result=num1+num2;
		
		System.out.println("The result are:"+result);
	}
	void sum(int a,double b) //method we going to store variable numbers
	{
		num1=a;
		num2=(int)b;
		result=num1+num2;
		
		System.out.println("The result are:"+result);
	}
	
	void sum(double a,double b) //method we going to store variable numbers
	{
		num1=(int)a;
		num2=(int)b;
		result=num1+num2;
		
		System.out.println("The result are:"+result);
	}
	

	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.sum(5, 10); 
		obj.sum(5, 10.5); 
		obj.sum(5.5, 10.5); 
	}
}
