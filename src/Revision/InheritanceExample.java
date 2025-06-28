package Revision;

public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
        Puppy p = new Puppy();
        p.teeth();
        p.bark();
        p.eat();

    }
}

class Animal{
    void eat(){
        System.out.println("Eat your food!");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks!");
    }
}

class Puppy extends Dog{
    void teeth(){
        System.out.println("No teeth!");
    }
}
