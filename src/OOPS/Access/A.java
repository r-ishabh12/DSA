package OOPS.Access;

public class A {
//    private int num;// data hiding
    protected int num;
    String name;
    int[] arr;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
