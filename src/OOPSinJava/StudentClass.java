package OOPSinJava;

import Crt.Main;

public class StudentClass {

    // Creating a new data type
    public static void fun(Student x){
        System.out.println(x.name);
    }
    public static void main(String[] args) {

        // Class_name object_name = new Class_name();
//        Student s1 = new Student(); // declaration
//        s1.name = "Rishabh";
//        s1.rno = 1;
//        s1.percent = 76.5;
//
//        Student s2 = new Student();
//        s2.name = "Sachin";
//        s2.rno = 3;
//        s2.percent = 84.5;
//
//        fun(s1);
//        Student s1 = new Student();
//        System.out.println(s1.rno);

//        System.out.println(s1.getRno());
//        s1.setRno(78);
//        System.out.println(s1.getRno());
        Student s1 = new Student("Rishabh",79, 73);
//        s1.name = "Rishabh";
//        s1.rno = 79;
//        s1.percent = 98;
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);
        System.out.println(s1.studentsnumber);

        Student s2 = new Student("AAyush",68, 98);
        System.out.println(s2.name);
        System.out.println(s2.rno);
        System.out.println(s2.percent);
        System.out.println(s1.studentsnumber);


    }
}
