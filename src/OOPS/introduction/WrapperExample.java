package OOPS.introduction;

public class WrapperExample {
    public static void main(String[] args) {

        final A rishabh = new A("Something Something");
        System.out.println(rishabh.name);
       rishabh.name = "rishabh jain";
        System.out.println(rishabh.name);
        rishabh.name = "kunal jain";
        System.out.println(rishabh.num);
        System.out.println(rishabh.name);

        A obj;

        for (int i = 0; i <100000000; i++){
            obj = new A("Random Number");
        }
    }
}
class A{
    final int num =10;
    String name;

    A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
