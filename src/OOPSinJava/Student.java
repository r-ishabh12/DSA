package OOPSinJava;

public class Student{
    String name;
     int rno;
    double percent;
//    final String schoolNAme = "GIT";
    static int studentsnumber;

    public int getRno(){ //getter
        return rno;
    }
    public void setRno(int rno){ //setter
        this.rno = rno;
    }
    //DEFAULT CONSTRUCTOR
    public Student(){

    }
    // CONSTRUCTOR
    public Student(String name, int rno, double percent){
        this.name = name;
      this.rno  = rno;
        this.percent = percent;
        studentsnumber++;
    }
}
