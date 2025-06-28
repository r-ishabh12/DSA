package Array;

import java.util.Scanner;

public class Multi_Dim {
    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){//row
            for (int j = 0; j < matrix[i].length; j++){//column
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if (r1 != r2 || c1 != c2){
            System.out.println("wrong input - Addition not possible");
            return;
        }
        int[][] sum = new int[r1][c1];

        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c1; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(sum);
    }


    public static void main(String[] args) {
//        int[][] matrix = {
//                         {1,2,3},
//                         {4,5,6},
//                         {7,8,9}
//                         };
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of rows: ");
//        int r = sc.nextInt();
//        System.out.println("Enter number of columns: ");
//        int c = sc.nextInt();
//        int[][] matrix = new int[r][c];
//
//        System.out.println("Enter "+ r*c + "elemnts: ");
//        for (int i = 0; i < r; i++){
//            for (int j = 0; j < c; j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        printMatrix(matrix);

//        System.out.print("Enter no. of rows: ");
//        int r1 = sc.nextInt();
//        System.out.println("Enter no. of columns: ");
//        int c1 = sc.nextInt();
//        int[][] a = new int[r1][c1];
//
//        System.out.println("Enter "+ r1*c1 +" elements:");
//        for (int i = 0; i < r1; i++){
//            for (int j = 0; j < c1; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        System.out.print("Enter no. of rows: ");
//        int r2 = sc.nextInt();
//        System.out.println("Enter no. of columns: ");
//        int c2 = sc.nextInt();
//        int[][] b = new int[r2][c2];
//
//        System.out.println("Enter "+ r1*c1 +" elements:");
//        for (int i = 0; i < r2; i++){
//            for (int j = 0; j < c2; j++){
//                b[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Matrix a: ");
//        printMatrix(a);
//        System.out.println("Matrix b: ");
//        printMatrix(b);
//
//        add(a,r1,c1,b,r2,c2);

    }
}
