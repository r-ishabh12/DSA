package Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0 ;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j +1){
                list.add(j +1);
            }
        }
        return list;
        
    }
    static int duplicate(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }
        int ans = 0;

        for(int j = 0; j < nums.length-1; j++){
            if(nums[j] == nums[j+1]){
                ans = nums[j];
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(duplicate(arr));

    }
}