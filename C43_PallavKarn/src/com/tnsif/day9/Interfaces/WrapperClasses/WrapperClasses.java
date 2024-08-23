package com.tnsif.day9.Interfaces.WrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {
		
    	//Unboxing - COnverting explicity
    	Integer i= new Integer(10);
    	System.out.println(i);
    	int b=i.intValue(); //predefined method
    	System.out.println(b);
    	
    	//without using intVlaue
    	int c=i;
    	System.out.println(c);
    	
    	//Autoboxing - COnverting explicity
    	int a=100;
    	Integer i1=a;
    	System.out.println(i1);
    	
	}
}
