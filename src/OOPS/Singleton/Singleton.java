package OOPS.Singleton;
//Singleton class are those claases which have only one instance/object
public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;

    public static Singleton getInstance(){
        //check one obj is created or not
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
