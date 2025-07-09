package OOPS.Polymorphism;

import com.sun.jdi.connect.Connector;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        circle.area();
        
    }
}
