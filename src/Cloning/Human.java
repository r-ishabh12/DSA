package Cloning;

import java.util.concurrent.atomic.AtomicLongArray;

public class Human implements Cloneable {
    int age;
    String name;
    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Object clone() throws CloneNotSupportedException{
        //this is a shallow copy
        return super.clone();
    }
}
