package Recursion;

public class BS {
    static int search(int[] arr, int  target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s)/2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }
             return search(arr, target, m+1, e);
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        int target = 6;
        System.out.println(search(arr,target,0,arr.length-1));

    }
    }
    
