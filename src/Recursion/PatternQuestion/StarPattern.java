package Recursion.PatternQuestion;

public class StarPattern {
    static void reverseTrianlge(int r, int c){
        if (r == 0){
            return;
        }
        if (c < r){
            System.out.print("*" + " ");
            reverseTrianlge(r,c+1);
        }else{
            System.out.println();
            reverseTrianlge(r-1, 0);
        }
    }
    static void Trianlge(int r, int c){
        if (r == 0){
            return;
        }
        if (c < r){
            Trianlge(r,c+1);
            System.out.print("*" + " ");

        }else{
            Trianlge(r-1, 0);
            System.out.println();

        }
    }


    public static void main(String[] args) {
//        reverseTrianlge(4,0);
        Trianlge(4,0);
    }
}
