package Recursion;

public class NumbersExampleRecursion {
    static void print(int n){

        // BASE Condition
        if (n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //recursive calls
        //this is the last function call
        // it is a tail recursion
        print(n+1);
    }
    //fibonacci series
    static void normalFibo(int n){
        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
          first = second;
             second = next;
        }
    }
    // fibonaacci using recursion
    static int fibo(int n){
        //base condition
        if(n<2){

            return n;
        }
        //recursive calls
        return   fibo(n-1) + fibo (n-2);
    }

    public static void main(String[] args) {
//        print(1);
//        normalFibo(7);
        System.out.println(fibo(50));
    }
}
