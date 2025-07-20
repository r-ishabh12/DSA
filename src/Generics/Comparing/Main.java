package Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student rishabh = new Student(23,75.68f);
        Student kunal = new Student(24,79.0f);
        Student arpit = new Student(26,89.0f);
        Student sachin = new Student(27,99.0f);
        Student sahil = new Student(28,59.0f);

        Student[] list = {rishabh,kunal,arpit,sachin,sahil};

        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks - o2.marks);
//            }
//        });
        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));



//        if (result < 0){
//            System.out.println("rishabh has more marks");
//        }else{
//            System.out.println("kunla has more marks");
//        }

    }
}
