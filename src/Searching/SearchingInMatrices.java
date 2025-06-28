package Searching;

import java.util.Arrays;

public class SearchingInMatrices {
    static void search(int[][] matrix,int target){
        for (int i = 0; i < matrix.length;i++){
            for (int j = 0; j < matrix[i].length;j++){
                if (matrix[i][j] == target){
                    System.out.println("Found at row " + i + " column " + j);
                }
            }
        }
    }
    //Binary search
    static int[] search2(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;
        while(r < matrix.length && c>= 0){
            if (matrix[r][c] > target){
                c--;
            }
            else if (matrix[r][c] < target){
                r++;
            }
            else{
                return new int[] {r , c};
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6}
        };
//        search(matrix,5);
        double sum = 0;
        int[] nums = {1,12,-5,-6,50,30};
        int k = 4;
        double maxavg = Integer.MIN_VALUE;
//        System.out.println(Arrays.toString(search2(matrix,5)));
        for(int i = 0; i < nums.length-k
                ; i++) {
            for (int j = i; j < i+k; j++) {
                sum += nums[j];
            }
            System.out.println(sum);
            double avg = sum/4;
            System.out.println(avg);
            maxavg = Math.max(maxavg,avg);
            System.out.println(maxavg);
            sum = 0;

        }
    }
}
