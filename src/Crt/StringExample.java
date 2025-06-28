package Crt;

import java.util.Arrays;

public class StringExample {
    static void reversed(String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
//       String fullName = "Aman";
////        fullName.concat(" Jain");
//        System.out.println( fullName.concat(" Jain"));
//       fullName = fullName.concat(" Jain");
//        System.out.println(fullName);
//
//        String city = "jaipur";
//        System.out.println("city " +city.toUpperCase());
//        System.out.println("city " + city);
//        city = city.toUpperCase();
//        System.out.println("city " + city);
//        System.out.println("city " + city.toLowerCase());
//        city = city.toLowerCase();
//
//        System.out.println(fullName.toUpperCase());
//
//        String name = "sohan";
//
//        reversed(name);
//
//        String sub = name.substring(2);
//        System.out.println("sub : " + sub);
//        String rep = name.replace('s','R');
//        System.out.println("rep :"+rep);
//
//        String batch1 = "gamma";
//        String batch2 = "gamma ";
//        System.out.println(batch1 == batch2);
//        System.out.println(batch1.equals(batch2.trim()));
//
//        String str = "Rishabh";
//        char[] str1 = str.toCharArray();
//
//        System.out.println(Arrays.toString(str1));

        String str = "Hello";

        reversed(str);



    }
}
