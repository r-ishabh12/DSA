package Crt;

import java.util.Scanner;

public class TwoDimenArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long[][] arr = {
//                {1, 6874839},
//                {2, 7657578},
//                {3, 8564656},
//                {4, 8568652},
//                {5, 8749649},
//                {6, 8965464},
//                {7, 7923984},
//                {8, 9857845},
//                {9, 8405483},
//                {10,6856456}
//        };
//
//        System.out.println("Enter the uid: ");
//        int uid = sc.nextInt();
//        int i = 0;
//
//        while (i < 10) {
//            if (uid == arr[i][0]) {
//                System.out.println(arr[i][1]);
//                break;
//            }
//            else{
//                i++;
//            }
//        int[] arr = {1, 2, 3, 4, 5};
//        ascendingArray(arr);
        int[] arr = {0,1,1,0,1,1,0,1,1,1,1,0};
        consecutiveOne(arr);
        }
        static void ascendingArray(int[] arr){
        boolean flag = true;
       for (int i = 1; i < arr.length; i++){
           if (arr[i] < arr[i-1]){
              flag = false;
           }
       }
            System.out.println(flag);
    }
    static void consecutiveOne(int[] arr){
        int count = 0;
        int[] ans = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
                count++;
            }
            if (arr[i] != 1){
                ans[k] = count;
                k++;
                count = 0;
            }
        }
        int max = 0;
        for (int i = 0; i < ans.length; i++){
            if (ans[i] > max){
                max = ans[i];
            }
        }
        System.out.println(max);
    }

}
