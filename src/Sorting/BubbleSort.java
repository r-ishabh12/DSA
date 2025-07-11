package Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        boolean swapped = true;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step; max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is samller than the previous item
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            /// if you do not
            if (!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

