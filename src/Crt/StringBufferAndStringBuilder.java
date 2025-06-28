package Crt;

public class StringBufferAndStringBuilder {
    public static void main(String[] args) {

        // StringBuffer
//        StringBuffer stringBuffer = new StringBuffer(); // new object
//
//        stringBuffer.append("Rishabh"); // no new object
//        stringBuffer.append(" Jain");
//
//        stringBuffer.reverse();
//        System.out.println(stringBuffer.charAt(3));
//        System.out.println(stringBuffer.indexOf("s"));
//        stringBuffer.trimToSize();
//
//
//
//        String stringBufferValue = stringBuffer.toString();
//
//        System.out.println(stringBufferValue);
//
//        // StringBuilder
//
//        StringBuilder stringBuilder = new StringBuilder();
//
//        stringBuilder.append("Rishabh");
//        stringBuilder.append(" Jain");
//
//        stringBuilder.reverse();
//        System.out.println( stringBuilder.length());
//
//        System.out.println(stringBuilder.deleteCharAt(4));
//        stringBuilder.setCharAt(5,'G');
//
//        System.out.println(stringBuilder);

        /*
        [4, 3, 2, 9]
        "aakash"
        // find max
        max: s, min: a
         */

//        String name = "aakash";
//        char[] name1 = name.toCharArray();
//        int[] arr = new int[name1.length];
//
//        for (int i = 0; i < name1.length; i++){
//            int s = name1[i];
//           arr[i] = s;
//        }
//
//        int max = arr[0], min = arr[0];
//
//        for (int nums : arr){
//            if (nums > max) max = nums;
//            if (nums < min) min = nums;
//        }
//
//        System.out.println("Max: " + max + ", Min: " + min);
//
//        char maxchar = (char) max;
//        char minchar = (char) min;
//
//        System.out.println("maxchar : " + maxchar + " ,minchar : " + minchar);

        // Task 2
        // abc : a , b , c, ab , ac, bc, abc


        // racecar
        String palin = "abca";
        int i = 0;
        int j = palin.length()-1;

        boolean isPalindrome = false;

        while (i < j){
           if(palin.charAt(i) == palin.charAt(j)){
               isPalindrome = true;
               i++;
               j--;
           }
           else{
               isPalindrome = false;
               i++;
               j--;
           }
        }
        System.out.println(isPalindrome);


    }
}
