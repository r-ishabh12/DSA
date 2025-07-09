package OOPS.StaticExample;


// outside class cannot be static
public class InnerClass {
    /// Inner class can be static
    static class Test{
         String name;
        public Test(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        //without object this will not work
        Test a = new Test("Rishabh");
        Test b = new Test("Kunal");
        System.out.println(a);
//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}
