package Gui;

public class Student {
    private String name;
    private String rollno;
    private String marks;

    public Student(String name,String rollno,String marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    // convert into a file format
    public String tofileformat(){
        return name + "," + rollno + "," + marks;
    }
}
