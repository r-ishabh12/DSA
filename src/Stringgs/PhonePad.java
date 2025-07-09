package Stringgs;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
//        ArrayList<String> ans = pad1("","12");
//        System.out.println(ans);
        System.out.println(padCount("", "13"));
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digits = up.charAt(0) - '0';
        for (int i = (digits - 1) * 3; i < digits * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> pad1(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digits = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digits - 1) * 3; i < digits * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(pad1(p + ch, up.substring(1)));
        }
        return ans;
    }

    static int padCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digits = up.charAt(0) - '0';

        for (int i = (digits - 1) * 3; i < digits * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }
}

