package Sorting.CyclicSort;

//import static Sorting.CyclicSort.CyclicSort.cyclicSort;

public class MIssingNum {
    static int missingNum(int[] nums){
        int missing = 0;
        cyclicSort(nums);
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != i){
                missing = i;
                break;
            }
        }
        return missing;
    }
    public static void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctindex = nums[i];
            if (correctindex != nums.length ) {
                int temp = nums[i];
                nums[i] = nums[correctindex];
                nums[correctindex] = temp;
            } else {
                i++;
            }
        }
    }

    static int missingnum2(int[] nums){
        int i = 0;
        while (i < nums.length){
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        //sorted
        for (int j = 0 ; j < nums.length; j++){
            if (nums[j] != j){
                return j;
            }
        }

        //edge case
        return nums.length;
    }
    static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0,1};
        System.out.println(missingnum2(arr));
    }
}
