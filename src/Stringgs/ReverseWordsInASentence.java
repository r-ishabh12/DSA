package Stringgs;

public class ReverseWordsInASentence {
    public static void main(String[] args) {
//        String str = "I am an online educator";
//        reverseWords(str);
        String str = "aaabbbcccdde";
        stringCompression(str);

    }
    static void reverseWords(String str){
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch != ' '){
                sb.append(ch);
            }
            else {
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
    static void stringCompression(String str){
        String ans = "" + str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++){
            char current = str.charAt(i);
            char prev = str.charAt(i-1);
            if (current == prev){
                count++;
            }
            else {
               if (count > 1) ans += count;
                count = 1;
                ans += current;
            }
        }
        if (count > 1) ans += count;
        System.out.println(ans);
    }

}
