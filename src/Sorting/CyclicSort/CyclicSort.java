package Sorting.CyclicSort;


import java.util.Arrays;



public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){                 //arr[i] != arr[correct]
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] nums, int i, int correctIndex) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
