package Searching;

public class splitArray {
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }
        //binary search
        while(start < end){
            int mid = start + ( end - start ) /2;
            int sum = 0;
            int peices = 0;

          for (int num : nums){
              if (sum + num > mid){
                  sum = num;
                  peices++;
              }else{
                 sum += num;
              }
          }
          if(peices > k){
              start = mid +1;
          }else{
              end = mid;
          }
        }
        return end;

    }

    public static void main(String[] args) {

    }
}
