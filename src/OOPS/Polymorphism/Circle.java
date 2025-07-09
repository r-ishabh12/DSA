package OOPS.Polymorphism;

public class Circle extends Shapes{
    //this will run when obj of circle is created
    // hence it is oveerrirding the parent method
    @Override // this is calles annotation
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
