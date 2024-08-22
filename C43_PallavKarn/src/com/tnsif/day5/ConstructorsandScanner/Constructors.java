package com.tnsif.day5.ConstructorsandScanner;

import com.tnsif.day3.Oops.Constructor;

public class Constructors {
	public String name;
    public int age;
    public String dept;

     public Constructors() {
    	System.out.println("Default Constructor"); 
     }
     
     //Parameterized Constructor
     //use this keyword
     public void Constructor(String ConstructorName,int ConstructorAge,String ConstructorDept) {
     	System.out.println("Parameterized Constructor"); 
     	this.name=ConstructorName;
     	this.age=ConstructorAge;
     	this.dept=ConstructorDept;
      }
     
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    @Override
    public String toString() {
     return "OopsConcept [Name="+name+",Age="+ age +",Dept="+dept+"]";
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();
        obj.setName("Pallav");
        obj.setAge(22);
        obj.setDept("Tech");
        System.out.println( obj);
 
    }
}

}
