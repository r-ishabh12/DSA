package Recursion;

public class Nto1 {
    static void fun(int n){
        if (n==0){   //otherwise n can also be put as 1
//            System.out.println(1);
            return;
        }


        fun(n-1);
        System.out.println(n);
    }
    static void fun1(int s, int t){
        if (s==t){   //otherwise n can also be put as 1
            System.out.println(s);
            return;
        }

        System.out.println(s);
        fun1(s+1, t);
    }
    static void funBoth(int n){
        if(n==0) return;
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        funBoth(5);
    }
}
