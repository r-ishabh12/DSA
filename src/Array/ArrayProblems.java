package Array;

import java.util.Arrays;

public class ArrayProblems {
    public static void reverse(int[] arr){

        int left = 0,right = arr.length-1;

        while(left < right){
            int temp;
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reverse : " + Arrays.toString(arr));

    }

   public static void maxAndMin(int[] arr){
        int max = arr[0], min = arr[0];

        for (int num : arr){
            if (num > max) max = num;
            if (num < min) min = num;
        }

       System.out.println("max : " + max);
       System.out.println("min : " + min);

   }

   public static void sortedArray(int[] arr){
        boolean isSorted = true;

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i-1]){
                isSorted = false;
                break;
            }
        }

       System.out.println( isSorted ? "sorted" : "unsorted");
   }

    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5};
       reverse(arr);
       maxAndMin(arr);
       sortedArray(arr);


       //

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = 0;
        int j = 1;
        int k =0;
        //   int count = 1;
        int[] ans = new int[nums.length];

        while(j < nums.length){
            if(nums[i] == nums[j]){
                // count++;
                i++;
                j++;
            }
            if(nums[i] != nums[j]){
                nums[i] = ans[k];
                k++;
                // count = 1;
                i++;
                j++;
            }
        }

      

        System.out.println(k);
    }
}
