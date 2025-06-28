package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class ArraylistExmaple {
    public static void main(String[] args) {
//        ArrayListPractice();
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(4);
//        list.add(6);
//        list.add(8);
//        list.add(9);
//        list.add(2);
//        System.out.println("Orignial list: " + list);
//        Collections.reverse(list);
//        ReverseArrayList(list);
//        Collections.sort(list);
//        System.out.println("Ascending order: " + list);
//        Collections.reverse(list);
//        Collections.sort(list, Collections.reverseOrder());
//        System.out.println("Descending order: " + list);

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("to");
        l1.add("physics");
        l1.add("Wallah");
        System.out.println(l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println(l1);



    }
    static void Arrraylist() {
        Scanner sc = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(45);
//        list.add(54);
//        list.add(78);
//        list.add(39);
//        list.add(27);

//        list.set(0, 99);

//        list.remove(2);

//        System.out.println(list);

//        System.out.println(list.contains(54));

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
//    static void mulArraylist(){
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        for ()
//    }
    static void ArrayListPractice(){
         // Wrapper classes
//        Integer i = Integer.valueOf(4);
//        System.out.println(i);
//
//        Float f = Float.valueOf(4.5f);
//        System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>();
//        ArrayList<Boolean> l2 = new ArrayList<>();
//        ArrayList<Float> l3 = new ArrayList<>();

        // add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // get an element at index i
        System.out.println(l1.get(1)); // 6

        // print with for loop
        for (int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i) + " "); // 5, 6, 7, 8
        }

        //printing the array list directly
        System.out.println();
        System.out.println(l1); // [5, 6, 7, 8]

        // adding element at some index i
        l1.add(1, 100);
        System.out.println(l1);

        // modifying element at index i
        l1.set(1, 10);
        System.out.println(l1);

        //removing element at index i
        l1.remove(1);
        System.out.println(l1);


        // removing an element e
        System.out.println(l1.remove(Integer.valueOf(7)));
        System.out.println(l1);

        //checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(60));
        System.out.println(ans);

        // If you don't specify class, you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("Rishabh");
        l.add(7);
        l.add(true);
        l.add('a');

        System.out.println(l);
    }
    static void ReverseArrayList(ArrayList<Integer> list){
        int i = 0, j = list.size() - 1;

        while(i < j){
            /*
            int temp = a;
            a = b;
            b = temp;
             */
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);

            i++;
            j--;

        }
    }
}
