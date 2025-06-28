package Recursion.ArraysQuestion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,5};
        int target = 5;
//        System.out.println(search1(arr,target,0));
//        System.out.println(search2(arr,target,0));
//        System.out.println(search3(arr,target,0));
//        search4(arr,target,0);
//        System.out.println(list);
//        System.out.println(search6(arr,target,0,new ArrayList<>()));
        System.out.println(search7(arr, 5, 0));

    }

    static boolean search1(int[] arr, int target, int index){
        if (index == arr.length) return false;
        if (arr[index] == target) return true;
        return (search1(arr,target,index+1));
    }
    static boolean search2(int[] arr, int target, int index){
        if (index == arr.length) return false;

        return arr[index] == target || (search1(arr,target,index+1));
    }
    static int search3(int[] arr, int target, int index){
        if (index == arr.length) return -1;
        if (arr[index] == target) {
            return index;
        }
        return (search3(arr,target,index+1));
    }
    static List<Integer> list = new ArrayList<>();
    static void search4(int[] arr, int target, int index){
        if (index == arr.length) return;
        if (arr[index] == target) {
           list.add(index);
        }
       search4(arr,target,index+1);
    }
    static List<Integer> search5(int[] arr, int target, int index, List<Integer> list){
        if (index == arr.length) return list;
        if (arr[index] == target) {
            list.add(index);
        }
        return search5(arr,target,index+1,list);
    }
    static ArrayList<Integer> search6(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length) return list;
        if (arr[index]  == target){
            list.add(index);
        }
        return search6(arr, target, index +1, list);
    }
    static ArrayList<Integer> search7(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) return list;
        if (arr[index]  == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = search7(arr, target, index +1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

}
