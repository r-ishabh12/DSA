package Searching;

public class EvenDigits {
    static int findNumber(int[] nums){
        int count = 0;

        for (int num : nums){
            if (even(num)){
                count++;
            }
        }

        return count;
    }

    static boolean even(int num){
        int numberOfDigits = digits2(num);
//        if (numberOfDigits % 2 == 0){
//            return true;
//        }
        return numberOfDigits % 2 == 0;
    }

    static int digits2(int num){
        return (int)(Math.log10(num) + 1);
    }

    static int digits(int num){

        int count = 0;

        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] num = {12,345,2,6,7896,4567};
        System.out.println(findNumber(num));
        System.out.println(digits2(345));
    }
}
