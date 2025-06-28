package Stringgs;

public class Palindrome {
    public static void main(String[] args) {
//        strIsPalindrome();
//        anotherMethodstrIsPalindrome();
        palindromeStringIs();
    }
    static void strIsPalindrome(){
        String str = "abcdcba";
        StringBuilder rstr = new StringBuilder(str);
        rstr.reverse();
        String s = rstr + "";
        if (str.equals(s)){
            System.out.println("Palindrome");
        }
        else System.out.println("Not Palindrome ");
    }
    static void anotherMethodstrIsPalindrome(){
        String str = "abcdjcba";
        int i = 0;
        int j = str.length() - 1;
        boolean flag = true;

        while(i < j){
            if (str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if (flag == true)  System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
    static void palindromeStringIs(){
        String str = "abcdg cba";
        int i = 0;
        int j = str.length()-1;
        boolean flag = true;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if (flag == true) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
