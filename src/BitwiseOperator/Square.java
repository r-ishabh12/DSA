package BitwiseOperator;

public class Square {
    public static void main(String[] args) {
        int n = 36;
        int p = 3;

        System.out.printf("%.3f",sqrt(n,p));

//        System.out.printf("%.3f" , Math.sqrt(40));
    }
    static double sqrt(int n, int p){
        int s = 0;
        int e = n;

        double root = 0.0;
        while(s<=n){
            int m = s + (s-e)/2;
            if(m*m == n){
                return m;
            }else if ( m * m < n){
                e = m -1;
            }else{
                s = m +1;
            }
        }
            double incr = 0.1;
        for (int i = 0; i < p; i++){
            while(root * root <= n){
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
