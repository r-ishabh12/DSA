package OOPS.AbstarctDemo;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am a coder");
    }

    @Override
    void partner() {
        System.out.println("I am a pepeprhbd");
    }
}
