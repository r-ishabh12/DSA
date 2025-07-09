package OOPS.Singleton;

import OOPS.Access.SubClass;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        //all 3 refernce variable are pointing to one object

//        SubClass a = new SubClass(21, "khxvj");
//        a.num;


    }
}
