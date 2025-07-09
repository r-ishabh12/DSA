package OOPS.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("Hello World");
//        System.out.println(this.age); // cant use this because it is used as refernce object in static method you dont need to create an object

    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;

    }


}
