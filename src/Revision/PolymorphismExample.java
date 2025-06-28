package Revision;

public class PolymorphismExample {
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        int a = 12, b = 14, c = 17;
        System.out.println(m.add(a,b));
        System.out.println(m.add(a,b,c));
        a a1 = new a();
        m.Greetings();
        a1.Greetings();

    }
}

//method overloading
class MethodOverloading{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    void Greetings(){
        System.out.println("Heloo! Developer");
    }
}

//Method overriding
class a extends MethodOverloading{
    @Override
    void Greetings(){
        System.out.println("Hello! Handsome");
    }
}
