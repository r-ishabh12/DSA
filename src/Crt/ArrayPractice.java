package Crt;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[10];
//       for (int i = 0; i < 10 ; i++){
//           arr[i] = i * 10;
//       }
//       for (int i = 0; i < 10; i++){
//           System.out.print(arr[i]+" ");
//       }
//        maxElement();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        float b = sc.nextFloat();
        System.out.println(b);
        long c = sc.nextLong();
        System.out.println(c);
        byte d = sc.nextByte();
        System.out.println(d);
        String e = sc.nextLine();
        System.out.println(e);
    }
    static void maxElement(){
        int[] arr = {1,3,4,5,6};
        int max = 0;
        for (int i = 0; i < 5; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }

}
