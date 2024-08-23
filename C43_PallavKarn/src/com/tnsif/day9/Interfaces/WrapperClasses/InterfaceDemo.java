package com.tnsif.day9.Interfaces.WrapperClasses;

interface one {
    // only abstract method
    // will have default public abstract
    int age = 20; // final and static
    void show(); // default public abstract
    void age();
}

class two implements one {
    @Override
    public void show() {
        System.out.println("Interface Method one");
    }

    @Override
    public void age() {
        System.out.println("Age: " + age);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        two obj = new two();
        obj.show();
        obj.age();
    }
}
