package OOPS.Inheritance;

public class BoxPrice extends BoxWeight{
    double price;

    public BoxPrice() {
        this.price = -1;
    }

    public BoxPrice(BoxPrice old) {
        super(old);
        this.price = old.price;
    }

    public BoxPrice(double l, double b, double w, double weight, double price) {
        super(l, b, w, weight);
        this.price = price;
    }
    BoxPrice(double side, double weight, double price){
        super(side,weight);
        this.price = price;
    }
}
