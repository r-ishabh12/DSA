package Generics.Comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.marks = marks;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return marks + " ";
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("incomapare methid");
        int diff = (int)(this.marks-o.marks);
        return diff;
    }
}
