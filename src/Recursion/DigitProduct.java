package Recursion;

public class DigitProduct {
    public static void main(String[] args) {
    int ans = prod(1432);
        System.out.println(ans);
    }
    static int prod(int n){
//        if (n == 0) return 1;
        if (n%10 == n) return 1;
        return n%10 * prod(n/10);
    }
}
