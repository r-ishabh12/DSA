package OOPSinJava;

import java.util.Arrays;

public class arraylist {
    public static class Arraylist{
        int[] arr = new int[2];
        int ind = 0;
        int size = 0;

        public void add(int ele){
            if (size == arr.length){
                int[] brr = Arrays.copyOf(arr,arr.length*2);
                arr = brr;
            }
            arr[ind] = ele;
            ind++;
            size++;
        }
        public void set(int ind, int value){
            arr[ind] = value;
        }
        public void print(){
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Arraylist arr = new Arraylist();
        arr.add(1);
        arr.add(2);
        arr.set(1,10);
        arr.print();


    }
}
