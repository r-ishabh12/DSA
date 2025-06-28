package Crt;

public class Recursion {

    public static int evenSeries(int no){
      int no1 = 0;
      if (no1 > no){
          return 1;
      }
      if (no1 % 2 == 0){
          return evenSeries(no1 +2);
      }
      return 1;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(evenSeries(n));
    }
}
