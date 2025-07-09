package OOPS.Access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(21,"rishabh");
        //  need to do a few things
        // 1.  access the data members
        // 2.  modify the data members

//        ArrayList<Integer> list = new ArrayList<>(10);
//        list.DEFAULT_CAPACITY;

        // private means it is ony access in class
        // public means you can access it anywhere
        obj.setNum(34);
        System.out.println(obj.getNum());

    }
}
