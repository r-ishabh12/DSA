package OOPS.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }


   BoxWeight(BoxWeight old){
        super(old);
        this.weight = old.weight;
   }

    public BoxWeight(double l, double b, double w, double weight) {
        super(l, b, w);// What is this???? Call the parent class constructor
        // use to initialise values present in parent class
        this.weight = weight;
    }
    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
//    @Override
//    static void greeting(){
//        System.out.println("Hello, I  am the best");
//    }
}
