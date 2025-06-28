package BitwiseOperator;

public class findUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,4,2,5,3,6};

        System.out.println(unique(arr));
    }
    static int unique(int[] arr){
        int unique = 0;

        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
