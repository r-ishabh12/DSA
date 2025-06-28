package Crt;

import java.util.Arrays;

public class StringTAsk {
    public static void main(String[] args) {
        // task 1 :" Akash";
        //count A occurence: 3

        String name = "aakash";
//        int[] arr = new int[name.length()];
//
//        int count = 0;
//        for(int i = 0; i < name.length(); i++){
//            if ('A' == name.charAt(i) || 'a' == name.charAt(i)){
//              count++;
//            }
//        }
//        System.out.println(count);

        // count every occurence of element

//        for (int i = 0; i < name.length(); i++){
//            int count = 0;
//            char c = name.charAt(i);
//            for (int j = 0; j < name.length(); j++){
//                if (c == name.charAt(j)){
//                    count++;
//                }
//            }
//            arr[i] = count;
//        }
//        System.out.println(Arrays.toString(arr));

        // remove duplicate characters

        char[] name1 = name.toCharArray();

        System.out.println(Arrays.toString(name1));







    }

}
