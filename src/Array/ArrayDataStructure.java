package Array;

import java.util.Arrays;

public class ArrayDataStructure {
    public static void main(String[] args) {
        int nums[] = {3, 10, 2, 5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int arr[]){
        arr[0] = 99;
    }
}
