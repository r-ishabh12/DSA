package Searching;

import java.util.Arrays;

public class LinearSearch {
    static int search(int[] arr, int n){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {6,4,7,2,8,9};
        int n = 7;
//        System.out.println("index: "+search(arr,n));
//        String name = "risahbh";
//        System.out.println(Arrays.toString(name.toCharArray()));
//        char ch = 'h';
//        boolean ans = search2(name,ch);
//        System.out.println(ans);
//        boolean ch = searchInRange(arr, n, 1,arr.length-1);
//        System.out.println(ch);

        System.out.println(min(arr));
    }
    //linear search in string
    static boolean search2(String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
    //Search in range
    static boolean searchInRange(int[] arr, int target, int start, int end){
        for (int i = start; i <= end; i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }
    //min in the arrray
    static int min(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
