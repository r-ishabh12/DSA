package OOPS.StaticExample;

//this is a demo to show initialization of static variables
public class StaticBlock {
    static int a = 4;
    static int b;

    // this will run one timw definitely
    static {
        System.out.println("I am in static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " "+StaticBlock.b);
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


    }


}
