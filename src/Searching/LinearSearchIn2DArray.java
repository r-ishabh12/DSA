package Searching;

import java.util.Arrays;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2,5,6,8},
                {5,9,7,10,11},
                {48,56,48,26,58},
                {12,356,84,365}
        };
//        int target = 14;
//        int[] ans = search(arr, target);
//        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));

//        String[] check ={"Even" , "Odd"};
//        System.out.println(check[target %2]);
    }
    static int[] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == target){

                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] elements : arr){
            for (int x : elements){
                if (max < x){
                    max = x;
                }
            }
        }
        return max;
    }
}
