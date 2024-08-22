package com.tnsif.day7.Keywords.StaticAbstractFinal;

abstract class Value { //abstract class
    void show() { //normal method
        System.out.println("Abstraction");
    }
}
//create another class and extend it
class Concrete extends Value {
    void D() {
        System.out.println("Values");
    }
}

public class Student {
    //abstract int a; is not possible
    public static void main(String[] args) {
        Concrete obj = new Concrete();
        obj.show();
        obj.D();
    }
}
