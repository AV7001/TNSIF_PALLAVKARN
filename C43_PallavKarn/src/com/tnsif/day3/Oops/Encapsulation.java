package com.tnsif.day3.Oops;

public class Encapsulation {
    public String name;
    public int age;
    public String dept;

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

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("Pallav");
        obj.setAge(22);
        obj.setDept("Tech");
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Department: " + obj.getDept());
    }
}
