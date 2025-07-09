package OOPS.AbstarctDemo;

public class Son extends Parent {

    @Override
    void career() {
        System.out.println("I am agoing to be a doctor ");
    }

    public Son(int age) {
        super(age);
//        this.age = age;
    }

    @Override
    void partner() {
        System.out.println("My partbner she is ");
    }
}
