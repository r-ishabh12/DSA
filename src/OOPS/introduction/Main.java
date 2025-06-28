package OOPS.introduction;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store
//        Student rishabh = new Student();
//        rishabh.rollno = 1;
//        rishabh.name = "rishabh jain";
//
//        System.out.println(rishabh.rollno);
//        System.out.println(rishabh.name);
//        System.out.println(rishabh.marks);

        Student rishabh = new Student();
        System.out.println(rishabh.rollno);
        System.out.println(rishabh.name);
        System.out.println(rishabh.marks);

        rishabh.Greetings("rahul");

        Student random = new Student(rishabh);
        System.out.println(rishabh.rollno);

        Student one = new Student();
        Student two = one;

        one.name = "Something Something";
        System.out.println(two.name);





    }

}
class Student{
    int rollno;
    String name;
    float marks;

    void Greetings(String name){
        System.out.println("Hello! I am " + this.name );
    }

    Student(Student other){
        this.name= other.name;
        this.rollno= other.rollno;
        this.marks=other.marks;
    }

    Student(){
        this(13,"default person", 87.9f);
    }

    Student(int rollno, String name, float marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}
