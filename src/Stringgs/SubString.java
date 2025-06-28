package Stringgs;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
//        subStringSS();
//        generateSubstring();
        subStringSS();
    }
    static void subStringSS(){
        //Sub String(i,j)
//        String str = "abcde";
//        System.out.println(str.substring(1, 3));
//        System.out.println(str.substring(1));

        // Ques
//        String str = "Physics";
//
//        for (int i =2; i < 4; i++){
//            System.out.print(str.substring(i));
//        }

        // Immutability of strings
        String str = "Hello";
        str = str.substring(0, 2) + "y" + str.substring(3);
        System.out.println(str);
    }
    static void performance(){

    }
    static void generateSubstring(){
        Scanner sc = new Scanner(System.in);

        //a ab abc abcd b bc bcd c cd d
        String str = sc.nextLine();
        for (int i = 0 ; i < str.length(); i++){
            for (int j = i+1; j <= str.length(); j++){
                System.out.print(str.substring(i, j) +" ");
            }
        }
    }

}
