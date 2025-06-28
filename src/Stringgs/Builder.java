package Stringgs;

import java.util.Scanner;

public class Builder {
    public static void main(String[] args) {
//        stringBuilderfunc();
//        toggle();
//        reverse();
        toggleString();




    }
    static void stringBuilder1(){
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);
        str.append(" world");
        System.out.println(str);
    }
    static void stringBuilderfunc(){
//        StringBuilder str = new StringBuilder("Hello");
//        str.setCharAt(0,'A');
//        System.out.println(str);
//        str.append(true);
//        System.out.println(str);
//        str.insert(2, 'c');
//        System.out.println(str);
//        str.deleteCharAt(0);
//        System.out.println(str);

        // REVERSE
//        StringBuilder str = new StringBuilder("Physics");
//        System.out.println(str.reverse());

        // DELETE
        StringBuilder str = new StringBuilder("Physics");
        System.out.println(str.delete(2, 3));
    }
    static void toggle(){
       Scanner sc = new Scanner(System.in); // Taking input
        StringBuilder str = new StringBuilder(sc.nextLine());
        // PhySIcs
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            int ascii = (int) ch;
            if (ascii < 65) continue;

            if (ascii >= 65) {
                if (ascii >= 97) {
                    flag = false;
                }
                if (flag == true) {
                    ascii += 32;
                    char db = (char) ascii;
                    str.setCharAt(i, db);
                } else {
                    ascii -= 32;
                    char db = (char) ascii;
                    str.setCharAt(i, db);
                }
            }
        }
        System.out.println(str);
    }
    static void toggleString(){
        Scanner sc = new Scanner(System.in); // Taking input
       String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            int ascii = (int) ch;
            if (ascii < 65) continue;

            if (ascii >= 65) {
                if (ascii >= 97) {
                    flag = false;
                }
                if (flag == true) {
                    ascii += 32;
                    char db = (char) ascii;
                    str = str.substring(0, i) + db + str.substring(i+1);
                } else {
                    ascii -= 32;
                    char db = (char) ascii;
                    str = str.substring(0, i) + db + str.substring(i+1);
                }
            }
        }
        System.out.println(str);
    }

}
