package Revision;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        try{
            System.out.println(arr[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Arrays index out of range ");
        }
    }
}
