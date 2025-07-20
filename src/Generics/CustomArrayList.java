package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }
    public boolean isFull(){
        return size == data.length;
    }
    public void resize(){
        int[] temp = new int[data.length*2];
        //copy the items in the new aray
        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    public int remove(){
        int remove = data[--size];
        return remove;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(45);
//        list.set(1,67);
//        list.get(4);
//        list.remove(0);
//        list.size();
//        list.isEmpty();
        CustomArrayList list = new CustomArrayList();
        list.add(45);
        list.add(3);
        System.out.println(list);
        list.remove();
        System.out.println(list);


    }
}
