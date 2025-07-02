package Recursion.String;

public class Ascii {
    public static void main(String[] args) {
//        char ch = 'a';
//        System.out.println(0+ch);
        asciiSub("","ab");
    }
    static void asciiSub(String p, String up){
        if (up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        int a = up.charAt(0);

        asciiSub(p+ch, up.substring(1));
        asciiSub(p+a,up.substring(1));
        asciiSub(p,up.substring(1));
    }
}
