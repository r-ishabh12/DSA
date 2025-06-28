package Revision;

public class EncapsulationExample {

    public static void main(String[] args) {
        Student rishabh = new Student();
        System.out.println(rishabh.getrollno());
        System.out.println(rishabh.getName());
        String name = "rishabh";
        rishabh.setName(name);
        System.out.println(rishabh.getName());

    }
}
class Student{
    private int rollno;
    private String name;
    private float marks;

    //Getter
    public String getName(){
        return name;
    }
    //Setter
    public void setName(String name){
        this.name = name;
    }

    public int getrollno(){
        return rollno;
    }

    public void setrollno(int rollno){
        this.rollno = rollno;
    }
}
