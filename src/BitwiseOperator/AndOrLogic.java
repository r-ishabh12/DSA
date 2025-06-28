package BitwiseOperator;

public class AndOrLogic {
    public static void main(String[] args) {
        int n = 71;

        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
      return (n & 1) == 1;
    }
}
