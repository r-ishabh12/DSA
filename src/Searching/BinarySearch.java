package Searching;

import java.util.Arrays;

public class BinarySearch {
    static int binarySearch(int[] arr, int target){
      int start = 0;
      int end = arr.length;

      while(start <= end){

          int mid = start +(end -start)/2;

          if (target < arr[mid]){
              end = mid -1;
          }else if (target > arr[mid]){
              start = mid +1;
          }else {
              return mid;
          }
      }

      return -1;
    }

    //Order Agnostic bunary search
    static int orderAgnostic(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        // find whether the array is ascen or not
        boolean isAsec = arr[start] < arr[end];
        while(start <= end){

            int mid = start +(end -start)/2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsec) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;

                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//    int[] arr = {1,2,3,4,5,6,7,8 };
        int[] arr = {8,7,6,5,4,6,2,1};

//        Arrays.sort(arr);
        System.out.println(orderAgnostic(arr, 7));


    }
}
