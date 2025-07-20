package Generics;

import java.util.Arrays;

public class CustomGenericsArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericsArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }
    public boolean isFull(){
        return size == data.length;
    }
    public void resize(){
        Object[] temp = new Object[data.length*2];
        //copy the items in the new aray
        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    public T remove(){
        T remove = (T) data[--size];
        return remove;
    }
    public T get(int index){
        return (T) data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
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
        CustomGenericsArrayList<String> list = new CustomGenericsArrayList<>();
        list.add("Strnig");
        list.add("ADD");
        System.out.println(list);


    }
}
