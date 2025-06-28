import java.util.Arrays;

public class Pattern {

    public static void main(String[] args) {
        for (int i = 1 ; i <= 5; i ++){
            for (int j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
//        pattern2(5);
//        pattern1(4);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        rightAngledTriangle();
//        hollowSquareyy();
//        starDiamond();
//        rightAligned();
//        fun();
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++){
            // for every row, run the col
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = 1; row <= n; row++){
            // for every row, we run the col
            for (int col = 5; col >= row; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i = 1; i <= 2 * n; i++){
            for (int j = 1; j <= 4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void rightAngledTriangle(){
        for (int i = 5; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void hollowSquareyy(){
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 ){
                    System.out.print("*");
                } else if (j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void starDiamond(){
       for (int i = 1; i <= 5; i++){
           for (int j = 1; j <= 9; j++){
               System.out.print("*" + " ");
           }
           System.out.println();
       }
    }
    static void rightAligned(){
        char a = 'A';


        for(int i = 5; i >= 1; i--){
            for ( int j = 1; j <= 5; j++){
               if (i <= j){
                   System.out.print(a + " ");
               }
               else{
                   System.out.print(" " + " ");
               }
            }
            a++;
            System.out.println();
        }
    }
    static void fun(){
        int[] arr = {3,15,5,8,10};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 3 == 0){
                for (int j = i+1; j < arr.length; j++){
                    if (arr[j] % 5 == 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void pattern10(int k){

    }

}
