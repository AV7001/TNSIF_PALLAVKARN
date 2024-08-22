package com.tnsif.day6.Inheritance;

 class Inherit {
    void show() {
        System.out.println("I am Parent");
    }
}

class Demo extends Inherit {
    public void child() {
        System.out.println("I am Child");
    }
}

public class Main {
    public static void main(String[] args) {
        Inherit obj = new Inherit();
        obj.show();
        Demo obj1 = new Demo();
        obj1.child();
    }
}
