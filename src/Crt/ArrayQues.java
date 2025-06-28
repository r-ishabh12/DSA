package Crt;

import java.util.Arrays;

public class ArrayQues {
    public static void main(String[] args) {
        int[] arr = {2,-3,10,5,-4,-6};
        int[] negative = new int[arr.length];
        int[] positive = new int[arr.length];
        int[] ans = new int[5];
        int k = 0;
        for (int i = 0 ; i < arr.length; i++){
            if(arr[i] < 0){
                ans[k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                ans[k] = arr[i];
                k++;
            }
        }

        System.out.println(Arrays.toString(ans));


    }
}

