package Recursion;



public class CountZeroes {
    static int countZero1(int n){
        if (n == 0)  return 0;
        return (n%10 == 0) ? 1 + countZero1(n/10) : countZero1(n/10);
    }


    static int countZero2(int n){
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if (n == 0){
            return c;
        }
        if(n%10 == 0){
            return helper(n/10,c+1);
        }
       return helper(n/10, c);
    }

    public static void main(String[] args) {
        System.out.println(countZero1(30204));
        System.out.println(countZero2(30204));
    }
}
