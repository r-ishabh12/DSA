package Searching;

public class SearchRotatedArray {
    static int pivotElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) /2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] > arr[end]){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
    static int rotation(int[] arr){
        int index = pivotElement(arr);
        return index +1;
    }

        public static int findMaxConsecutiveOnes(int[] nums) {
            int len = 0;
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 1){
                    count++;
                }else{
                    len = Math.max(len,count);
                    count = 0;
                }
            }
            return len;
        }


    public static void main(String[] args) {
        //to find out that how many times arrr is rotated
        int[] arr = {1,1,0,1,1,1,0};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
