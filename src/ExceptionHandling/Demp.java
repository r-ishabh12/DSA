package ExceptionHandling;

public class Demp {
    public static void main(String[] args) throws Exception {
        try{
            Main.divide(3,0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
