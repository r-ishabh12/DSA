package Recursion.String;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
//        ArrayList<String> ans = new ArrayList<>();
//        ans = permutationList("","abc");
        int ans = permutationCount("","abc");
        System.out.println(ans);
    }
    static void permutation(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f + ch + s, up.substring(1));
        }

    }
    static ArrayList<String> permutationList(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationList(f + ch + s, up.substring(1)));
        }
        return ans;
    }
    static int permutationCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + permutationCount(f + ch + s, up.substring(1));
        }
        return count;

    }

}
