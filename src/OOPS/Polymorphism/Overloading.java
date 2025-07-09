package OOPS.Polymorphism;
// same name but different arguments,types;
public class Overloading {
    int sum(int a, int b){
        return a+b;
    }
    int sum(double a, int b){
        return (int) a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.sum(2,3);
        obj.sum(2,3,4);


    }
}
