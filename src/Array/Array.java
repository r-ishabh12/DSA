package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    static void swapArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseArrayBySwapping(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while(i <= j){
            swapArray(arr, i, j);
            i++;
            j--;
        }
        printArray(arr);
    }
    static  void removeDuplicate(int[] arr){
        int[] ans = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] != arr[i+1]) {
                ans[j++] = arr[i];
            }
            }
        System.out.println(ans[0]);
        System.out.println(ans[1]);
        System.out.println(ans[2]);


        }


    public static void main(String[] args) {
        int[] arr = {1,1,2};
        reverseArrayBySwapping(arr);
//        int[] ans = removeDuplicate(arr);
//        printArray(ans);
    }

    public static class Array_1 {
        //calculate the sum of all elements in the given array
        static void sumArray(int[] arr){
            int sum = 0;
            for (int i = 0; i < arr.length; i++){
                sum += arr[i];
            }
            System.out.println(sum);
        }
        ///calculate the maximum value out of alll the elemnts in the array
        static void maxValue(int[] arr){
            int max = 0;
             for (int i = 0; i < arr.length; i++){
                 if (max < arr[i]){
                     max = arr[i];
                 }
             }
            System.out.println(max);

        }
        //search
        static void searchEle(int[] arr, int x){
            int ans = -1;
             for (int i = 0; i < arr.length; i++){
                 if (arr[i] == x){
                     ans = i;
                     break;
                 }
             }
            System.out.println(ans);
        }
        //Print Array.Array Function
        static void printArray(int[] arr){

            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i]+ " ");
            }
        }
        //User input
        static void userInput(int[] arr){
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
        }
        //Count the number of occurences of a particular elemenr x.
        static void countOccurences(int[] arr, int x){
            int count = 0;
    //        for (int i = 0; i < arr.length; i++){
            for (int j : arr){        //for each loop

                if (j == x){
                    count++;
                }
            }
            System.out.println(count);
        }
        //Find the last occurrence of an element x in a given array
        static void lastOccuerence(int[] arr,int x){
            int lastIndex = -1;
            for (int i = 0; i < arr.length; i++){
                if (x == arr[i]){
                    lastIndex = i;
                }
            }
            System.out.println(lastIndex);
        }
        //count the no of elements strictly greater than the value x.
        static int countGreater(int[] arr, int x){
            int count  = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > x) {
                    count ++;
                }
            }
            return count;
        }
        //check if the given Array.Array is soretd or not
        static boolean arraySort(int[] arr)
        {
            boolean check = true;
            for (int i = 1; i < arr.length; i++){
                if (arr[i] < arr[i-1]){
                    check = false;
                    return check;
                }
            }
            return check;
        }
        //
        static int[] smallestAndLargest(int[] arr){

            int[] ans = new int[2];
            int smallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;


            for (int i = 0; i < arr.length; i++){
                if (arr[i] < smallest){
                    smallest = arr[i];
                } else if (arr[i] > largest) {
                    largest = arr[i];
                }
            }
            ans[0] = smallest;
            ans[1] = largest;
            return ans;
        }
        // Kth smallest and largest element
        static int[] kSmallestLargest(int[] arr, int k){
            Arrays.sort(arr);
            int[] ans = {arr[k-1], arr[arr.length - k]};
            return ans;
        }
        //Find the total no. of pairs in the array whose sum is equal to the given value x.
        static void totalPairs(int[] arr, int x){
            int count = 0;
            for (int i = 0; i< arr.length; i++){
                for (int j = i+1; j < arr.length; j++){
                    if (arr[i] + arr[j] == x){
                        count++;
                        System.out.println(count+"------");
                        System.out.print("{"+arr[i]+",");
                        System.out.println(arr[j]+"}");
                    }
                }
            }
        }
        //Count the number of triplets whose sum is equal to the given value x.
        static void tripletSum(int[] arr, int x){
            int n = arr.length;
            int ans = 0;

            for (int i = 0; i < n; i++){
                for (int j = i+1; j < n; j++){
                    for (int k = j+1; k < n; k++){
                        if (arr[i] + arr[j] + arr[k] == x){
                            ans++;
                            System.out.print(ans+"--");
                            System.out.print("{"+arr[i]+",");
                            System.out.print(arr[j]+",");
                            System.out.println(arr[k]+"}");
                        }
                    }
                }
            }
        }
         //PATTERN: Array.Array Manipulation
        //Find the unique number in a given Array.Array where all the elements are beung repeated twice with one value being unique
         static int uniqueNu(int[] arr){
             for (int i = 0; i < arr.length; i++){
                 for (int j = i+1; j < arr.length; j++){
                      if (arr[i] == arr[j]){
                          arr[i] = -1;
                          arr[j] = -1;
                      }

                 }
             }
             int ans = -1;
             for (int i = 0; i < arr.length; i++){
                 if (arr[i] > -1){
                     ans = arr[i];
                 }
             }
             return ans;
         }
         //find the maximum no in an array for all +ve no.
        static void maxNo(int[] arr){
            int mx = 0;
            for (int i = 0; i < arr.length; i++){
                if (arr[i] > mx){
                    mx = arr[i];
                }
            }
            System.out.println(mx);
        }
        //find the second largest element in the given array
        static void secondNu(int[] arr){
            int mx = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++){
                if (arr[i] > mx){
                    mx = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == mx){
                    arr[i] = Integer.MIN_VALUE;
                }
            }
            mx = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++){
                if (arr[i] > mx){
                    mx = arr[i];
                }
            }
    //        for (int i = 0; i < arr.length; i++){
    //            if (arr[i] == mx){
    //                arr[i] = Integer.MIN_VALUE;
    //            }
    //        }
            System.out.println(mx);
        }
        //Third largest
        static void thirdNu(int[] arr){
            int mx = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++){
                if (arr[i] > mx){
                    mx = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == mx){
                    arr[i] = Integer.MIN_VALUE;
                }
            }
            mx = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++){
                if (arr[i] > mx){
                    mx = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == mx){
                    arr[i] = Integer.MIN_VALUE;
                }
            }
            mx = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++){
                if (arr[i] > mx){
                    mx = arr[i];
                }
            }
            System.out.println(mx);
        }
        //Given an array a conssiting of integers. return the first value is repeating in this array. if no value is being repeated return -1.
        static int repeatedNu(int[] arr){
            int ans = -1;
            for (int i = 0; i < arr.length; i++){
                for (int j = i+1; j < arr.length; j++){
                    if (arr[i] == arr[j]){
                        ans = arr[i];
                        return ans;
                    }
                }
            }
            return ans;
        }
        //Given two integers a and b .SWap the given values using temporary variables
        static void swap(int a, int b){
            int temp = a;
            a = b;
            b = temp;
            System.out.println(a);
            System.out.println(b);
        }
        //swap through using sum and difference
        static void swapSumAndDiff(int a, int b){
            System.out.println("Before a "+a);
            System.out.println("before b "+b);
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("after a "+a);
            System.out.println("after b "+b);
        }
        //Reverse an array
        static int[] reveseArray(int[] arr){
            int[] ans = new int[arr.length];
            int j = 0;
    //        for (int i = arr.length-1; i >= 0; i--){
    //            ans[j] = arr[i];
    //            j++;
    //        }
    //         return ans;
            //with while loop
            int n = arr.length;
            int i = n-1;
            while ( i >= 0){
                ans[j++] = arr[i--];
            }
            return ans;
        }
        //reverse an array through swapping
        static void swapArray(int[] arr, int i , int j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        static void reverseArrayBySwapping(int[] arr){
            int n = arr.length;
            int i = 0;
            int  j = n-1;

            while (i < j){
                swapArray(arr, i ,j);
                i++;
                j--;
            }
        }
        //Rotate the given array a by k steps, where k is non-negative.
        //first approach
        static void rotateArray(int[] arr, int k){
            int n = arr.length;
            k = k % n;
            int[] ans = new int[n];
            int j = 0;

            for (int i = n-k; i < n; i++){
                ans[j++] = arr[i];
            }
            for (int i = 0; i < n-k; i++){
                ans[j++] = arr[i];
            }
            printArray(ans);

        }
        ///second approach
        static void swappppp(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        static void reverse(int[] arr, int i, int j){
    //        int n = arr.length;
    //        int i = 0, j = n-1;
            while(i < j){
                swappppp(arr, i, j);
                i++;
                j--;
            }
        }
        static void rotateInPlace(int[] arr, int k){
            int n = arr.length;
            k = k % n;

            reverse(arr, 0, n-k-1);
            reverse(arr, n-k, n-1);
            reverse(arr, 0, n-1);
        }
        /////////////////////////////////////////////////////////////////////////////////
        static int[] makeFreqArray(int[] arr){
            int[] freq = new int[100005];

            for (int i = 0; i < arr.length; i++){
                freq[arr[i]]++;
            }
            return freq;
        }
        ///////////////////////////////////////////////////////////////TWO POINTERS
        //Sort 0 and 1 in an array without using any sorting and inbuilt function
        static void sortArray(int[] arr){
            int countZ = 0;
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == 0){
                    countZ++;
                }
            }
            for (int i = 0; i < countZ; i++){
                arr[i] = 0;
            }
            for (int i = countZ; i < arr.length; i++){
                arr[i] = 1;
            }
            printArray(arr);
        }
        ////another approach
        static void swappppppp(int[] arr,int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        static void sortZeOn(int[] arr){
            int n = arr.length;
            int i = 0;
            int j = n-1;

            while(i < j){
                if (arr[i] == 1 && arr[j] == 0){
                    swappppppp(arr, i, j);
                    i++;
                    j--;
                }
                if (arr[i] == 0){
                    i++;
                }
                if (arr[j] == 1){
                    j--;
                }
            }
            printArray(arr);
        }
        ///arrrnge even no. in starting and odd no. in ending
        static void swapOddEven(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        static void sortEvOd(int[] arr){
            int n = arr.length;
            int left = 0;
            int right = n-1;

            while (left < right){
                if (arr[left] % 2 != 0 && arr[right] % 2 == 0){
                    swapOddEven(arr, left, right);
                    left++;
                    right--;
                }
                if (arr[left] % 2 == 0){
                    left++;
                }
                if (arr[right] % 2 != 0){
                    right--;
                }
            }
            printArray(arr);
        }
        /////square elements which are present in array.
        static void swapS(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        static void reverseS(int[] arr){
            int i = 0;
            int j = arr.length-1;
            while (i < j){
                swapS(arr, i, j);
                i++;
                j--;
            }
        }
        static int[] squareArray(int[] arr){
            int n = arr.length;
            int left = 0, right = n-1;
            int[] ans = new int[n];
            int k = 0;
            while (left <= right){
                if (Math.abs(arr[left]) > Math.abs(arr[right])){
                    ans[k++] = arr[left] * arr[left];
                    left++;
                }
                else {
                    ans[k++] = arr[right] * arr[right];
                    right--;
                }
            }
            return ans;
        }
        ///////////////////////////////Prefix sum array//////////////////////////////////////////
        static int[] makePrefixArraySum(int[] arr){
            int n = arr.length;
            int[] prefix = new int[n];
            prefix[0] = arr[0];
            for (int i = 1; i < n; i++){
                prefix[i] = prefix[i-1] + arr[i];
            }
            return prefix;
        }
        ///
        static int[] sumArrayPre(int[] arr){
            for (int i = 1; i < arr.length; i++){
                arr[i] = arr[i-1] + arr[i];
            }
            return arr;
        }
        ///////Given array of integers of size n. Answer q queris where you need to print the sum of values of a given array of indices from l to r.

    //    static int sumArrayQueries(int[] arr, int left, int right){
    //        int ans = 0;
    //        for (int i = 2; i < arr.length; i++){
    //            arr[i] += arr[i-1];
    //        }
    //        if(left > 1) {
    //            ans = arr[right] - arr[left-1];
    //        }
    //        ans = arr[right];
    //        return  ans;
    //    }
        /////////////
        static int[] makePrefixSumArray(int[] arr){
            for (int i = 1; i < arr.length ; i++){
                arr[i] += arr[i-1];
            }
            return arr;
        }
        /////////////////////////////////////make sub arrays with equal sum of array
    //    static int[] prefixSum(int[] arr){
    //        for (int i = 1; i < arr.length; i++){
    //            arr[i] += arr[i-1];
    //        }
    //        return arr;
    //    }
    //    static int[] suffixSum(int[] arr){
    //        for (int i = arr.length-2 ; i >= 0; i--){
    //            arr[i] += arr[i+1];
    //        }
    //        return arr;
    //    }
        static int findArraySum(int[] arr){
            int totalsum = 0;
            for (int i = 0; i < arr.length; i++){
                totalsum += arr[i];
            }
            return totalsum;
        }

        static boolean equalSumPartition(int[] arr){
           int totalSum = findArraySum(arr);
            int prefSum = 0;
            for (int i = 0 ; i < arr.length; i++){
                prefSum += arr[i];
                int suffixSum = totalSum - prefSum;
                if (suffixSum == prefSum){
                    return true;
                }
            }
            return false;
        }

    //    2-D Array.Array



        public static void main(String[] args) {
    //        int[] ages =  {10,12,13,9,12};
    //        Scanner sc = new Scanner(System.in);
    //        int x = sc.nextInt();
    //        sumArray(ages);
    //        maxValue(ages);
    //        searchEle(ages,x);

            //USER input

            Scanner sc = new Scanner(System.in);
    //        System.out.println("Enter no. of elements: ");
    //        int n = sc.nextInt();
    //        int[] arr = new int[n];
    //        System.out.println("Enter "+ n + "Elements: ");
    //        userInput(arr);
    //        printArray(arr);

            //cloning
    //        int[] arr = {1,2,3,4,5};
    //        printArray(arr);
    //        System.out.println();
    //        int[] arr_2 = arr.clone(); //Array_name.clone();
    //        int[] arr_2 = Arrays.copyOf(arr,arr.length);//copyOf function helps to copy element
    //        int[] arr_2 = Arrays.copyOfRange(arr,3,arr.length);//copyOfRange function help to copy from and end position
    //        printArray(arr_2);
    //
    //        //changing some values of array2
    //        arr_2[0] = 0;
    //        arr_2[1] = 0;
    //        System.out.println();
    //        printArray(arr);
    //        System.out.println();
    //        printArray(arr_2);

    //        int[] arr = {1,4,5,6,3};
    //        int k = 12;
    //        countOccurences(arr,5);
    //        lastOccuerence(arr,5);
    //        System.out.println("Greater element than value: "+countGreater(arr,5));
    //        System.out.println("check sorted or not:  "+arraySort(arr));
    //        printArray(smallestAndLargest(arr));
    //        printArray(kSmallestLargest(arr, k));
    //        totalPairs(arr,k);
    //        tripletSum(arr,k);

            //Taking input of array
    //        System.out.println("Enter array size: ");
    //        int n = sc.nextInt();
    //        int[] arr = new int[n];
    //
    //        System.out.println("Enter "+n+" elements");
    //        for (int i = 0; i < arr.length; i++){
    //            arr[i] = sc.nextInt();
    //        }
    //        System.out.println("Unique element: "+uniqueNu(arr));

    //        System.out.println("Enter array size: ");
    //        int n = sc.nextInt();
    //        int[] arr = new int[n];
    //
    //        System.out.println("Enter "+n+" elements: ");
    //        for (int i = 0; i < arr.length; i++){
    //            arr[i] = sc.nextInt();
    //        }
    //        maxNo(arr);
    //        secondNu(arr);

    //        int[] arr = {1,2,4,6,7};
    //        System.out.println(repeatedNu(arr));
    //        int a = 9;
    //        int b = 3;
    //        swap(a, b);
    //        swapSumAndDiff(a, b);
    //
    //        int[] arr = {1,3};
    //        int k = 1;
    //        int[] ans = reveseArray(arr);
    //        reverseArrayBySwapping(arr);
    //        printArray(arr);
    //        rotateArray(arr,k);
    //        int i = 0;
    //        int j = arr.length - 1;
    //        reverse(arr,i,j);
    //        printArray(arr);

    //        rotateInPlace(arr, k);
    //        printArray(arr);


            ///Queryy question
    //        int[] arr = {10,89,78,63,1};
    //        int[] freqArray = makeFreqArray(arr);
    //        System.out.println("Enter no. of queies: ");
    //        int q = sc.nextInt();
    //        while(q-->0){
    //            System.out.println("Enter queries:");
    //            int x = sc.nextInt();
    //            if (freqArray[x] > 0){
    //                System.out.println("yes");
    //            }
    //            else{
    //                System.out.println("no");
    //            }
    //      }


            ////Two pointers approach
    //        int[] arr = {1,0,0,0,1,1,0,0,0};
    //        sortArray(arr);
    //        sortZeOn(arr);
    //
    //        int[] arr = {1,2,3,4,5,6,7};
    //        sortEvOd(arr);

    //        int[] arr = {1,2,5,3,4};
    //        int[] ans = squareArray(arr);
    ////        printArray(ans);
    //        reverseS(ans);
    //        printArray(ans);
            ////////////////////////////////
    //        int[] arr = {2,5,3,6,18};
    //
    //        int[] prefix = makePrefixArraySum(arr);
    //        System.out.println("prefix sum: ");
    //        printArray(prefix);
    //        int[] prefix1 = sumArrayPre(arr);
    //        System.out.println("array sum: ");
    //        printArray(prefix1);
    //        int [] arr = {1,2,3,4,5,6,7};
    //        int ans = sumArrayQueries(arr,0,4);
    //        System.out.println(ans);
    //        System.out.println("enter no . of elements in the array: ");
    //        int n = sc.nextInt();
    //        int[] arr = new int[n+1];
    //
    //        System.out.println("enter "+n+" no. of elements: ");
    //
    //        for (int i = 1; i <= n; i++){
    //            arr[i] = sc.nextInt();
    //        }
    //        System.out.println("Array.Array: ");
    //         for (int i = 1; i <= n; i++){
    //             System.out.print(arr[i]+" ");
    //         }
    //        System.out.println();

    //        System.out.println("Q queries: ");
    //
    //         int q = sc.nextInt();

    //         while(q-- > 0){
    //             System.out.println("left: ");
    //             int left = sc.nextInt();
    //             System.out.println("right: ");
    //             int right = sc.nextInt();
    //            int ans =  sumArrayQueries(arr,left,right);
    //             System.out.println(ans);
    //         }
    //       int[] prefix = makePrefixArraySum(arr);
    //
    //        System.out.println("Enter no. of querues:");
    //        int q = sc.nextInt();
    //
    //        while(q-- > 0){
    //            System.out.println("Enter range:");
    //            System.out.print("left: ");
    //            int left = sc.nextInt();
    //            System.out.print("right: ");
    //            int right = sc.nextInt();
    //
    //            int ans = prefix[right] - prefix[left-1];
    //            System.out.println("sum: "+ans);
    //        }

    //        //////////////////////////////////////////////////////////////////////////////////////////////////////
    //        int[] arr = {5,3,2,6,3,1};
    ////        int[] arr1 = Arrays.copyOf(arr,arr.length);
    //        int[] prefix = prefixSum(arr);
    ////        int[] suffix = suffixSum(arr1);
    //        printArray(prefix);
    //        System.out.println();
    //        printArray(suffix);
            int[] arr = {1,3,5,6,2,1};
            System.out.println( equalSumPartition(arr));

    //        2-D Array.Array
    //        initialize
    //        int[][] matrix = new int[3][3];
            int[][] a = {
                         {1,2,3},
                         {4,5,6},
                         {7,8,9}
                         };
        }
    }

    public static class Array_2 {
        public static void main(String[] args) {
    //        array_Initialisation();
            MutliDimAraay();

        }
        static void array_Initialisation(){
            //syntax
            //datatype[] variable_name = new datatype[size];
            //store 5 rollno
    //        int[] rnos = new int[5];
    //        System.out.println(rnos[0]);
    //        int[] rnos;//decalaration of array ros is getting defined in stack
    //        rnos = new int[5];// initialization actually here object is created in the memory(heap)
    //        System.out.println(rnos[0]);// It gives 0 only
    //
    //        String[] arr = new String[5];
    //        System.out.println(arr[0]);

            Scanner sc = new Scanner(System.in);

            //Array.Array of primitive
            int[] arr = new int[5];
    //        System.out.println("Enter elements of array: ");
    //        //Input using for loops
    //        for (int i = 0; i < arr.length; i++){
    //            arr[i] = sc.nextInt();
    //        }
    //
    //        for (int i = 0; i < arr.length; i++){
    //            System.out.print(arr[i] + " " );
    //        }
    //
    //        System.out.println();
    //        for (int num : arr){ // for every element in array,print the element
    //            System.out.print(num + " ");// here num represent element of the array
    //        }

    //        System.out.println(arr[5]);// index out of bound

    //        System.out.println(Arrays.toString(arr));// printing array using inbuild function

            //array of objects
    //        String[] str = new String[6];
    //        System.out.println("Enter elements of a string array: ");
    //        for (int i = 0; i < str.length; i++){
    //            str[i] = sc.next();
    //        }
    //        System.out.println(Arrays.toString(str));
    //
    //        str[1] = "rishabh";
    //
    //        System.out.println(Arrays.toString(str));
        }
        static void MutliDimAraay(){
            /*
            1  2  3
            4  5  6
            7  8  9
             */

            Scanner sc = new Scanner(System.in);

    //        int[][] arr = new int[3][3];
    //        int[][] arr_1 = new int[3][];

    //        int[][] arr = {
    //                {1, 2, 3}, // 0th index
    //                {4, 5},    // 1st index
    //                {6, 7, 8, 9}// 2nd index
    //                };

    //        System.out.println(Arrays.toString(arr_1[0]));

            int[][] arr = new int[3][2];

            System.out.println(arr.length); // it will provide the no of rows

            // input

            //taking input for every row
            for (int row = 0; row < arr.length; row++) {
                // taking input for every column
                for (int col = 0; col < arr[row].length; col++) {
                    arr[row][col] = sc.nextInt();
                }
            }










        }
    }
}
