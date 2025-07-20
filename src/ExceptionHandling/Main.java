package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
//            int c = a/b;
//            divide(a,b);
//            throw new ArithmeticException("just for fun");
            String name = "rishabh";
            if (name.equals("rishabh")){
                throw new MyException("name is rishabh");
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("THis will always be run");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("please do not divide by zero");
        }
        return a/b;
    }
}
