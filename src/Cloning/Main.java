package Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human kunal = new Human(23,"kunal");
//        Human twin = new Human(kunal);
//        System.out.println(twin.name);
//        try{
//            Human twin =(Human) kunal.clone();
//        }catch (CloneNotSupportedException cn){
//            System.out.println(cn.getMessage());
//        }
        Human twin = (Human) kunal.clone();
        System.out.println(twin.name + " " + twin.age);
    }
}
