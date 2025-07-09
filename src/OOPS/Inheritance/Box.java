package OOPS.Inheritance;
public  class Box {
     private double l; // data hiding
    double b;
    double w;

    static void greeting(){
        System.out.println("Hey, i am in box.");
    }

    public double getL() {
        return l;
    }

    Box(double side){
        this.l = side;
        this.b = side;
        this.w = side;
    }

    Box(double l, double b, double w) {
        System.out.println("Present in supper class");
        this.l = l;
        this.b = b;
        this.w = w;
    }

    Box() {
        this.l = -1;
        this.b = -1;
        this.w = -1;
    }

    //copy constuctor
    Box(Box old){
        this.l = old.l;
        this.b = old.b;
        this.w = old.w;
    }

    void information(){
        System.out.println("Running the box");
    }
}
