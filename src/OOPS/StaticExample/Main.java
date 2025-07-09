package OOPS.StaticExample;

public class Main {
    public static void main(String[] args) {
//        Human rishabh = new Human(21,"Rishabh", 10000, false);
//        Human rahul = new Human(22,"rahul", 15000, true);
//        Human arpit = new Human(22,"arpit", 15000, true);

//        System.out.println(rishabh.age);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
        Main main = new Main();
        main.greeting();
    }
    static void fun(){
//        greeting();// cant be use here cozz it requires an instance
        // but the you are in does not depeendent on instance
        // you  cannot access non static stuff without referencing their instances in
        // a static context
        //hence, here i am referencing it
        Main obj = new Main();
        obj.greeting();

    }
    // in the end any non static will be called in static main method
    // non static method can call non static method without an object
    void fun2(){
        greeting();
    }
    // which is not static that means they belong to an object
    void greeting(){
//        fun();
        System.out.println("hello World!");
    }
}
