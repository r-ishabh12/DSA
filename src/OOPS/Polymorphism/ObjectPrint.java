package OOPS.Polymorphism;

public class ObjectPrint {
    int num;
    public ObjectPrint(int num) {
        this.num = num;
    }

//    @Override
//    public String toString() {
//        return "ObjectPrint{" +
//                "num=" + num +
//                '}';
//    }

    public static void main(String[] args) {
        ObjectPrint object = new ObjectPrint(54);
        System.out.println(object);
    }
}
