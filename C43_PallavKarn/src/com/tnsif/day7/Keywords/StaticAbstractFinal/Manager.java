package com.tnsif.day7.Keywords.StaticAbstractFinal;

class Demo { // This class can be extended because it's not declared as final
    final String name = "Apple"; // final variable
    final void show() { // final method
        System.out.println("Final Statement");
        // name = "XYZ"; // This line would cause a compile-time error
    }
}

class value extends Demo { // This class extends Demo
    void display() {
        System.out.println("Hello");
    }
}

public class Manager {
    public static void main(String[] args) {
        value obj = new value(); 
        obj.display(); 
        obj.show(); 
    }
}
