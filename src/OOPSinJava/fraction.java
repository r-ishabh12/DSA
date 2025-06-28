package OOPSinJava;

public class fraction {
    public static int gcd(int num, int deno){
        int min = Math.min(num,deno);
        for (int i = min; i >= 1; i--){
            if (num % i == 0 && deno % i == 0) return i;
        }
        return min;
    }
    public static Fraction add(Fraction f1,Fraction f2){
        int numerator = f1.num * f2.deno + f2.num * f1.deno;
        int denominator = f1.deno * f2.deno;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }
    public static class Fraction{
        int num;
        int deno;

        public Fraction(){
        }
        public Fraction(int num, int deno){
            this.num = num;
            this.deno = deno;
            simplify();
        }
        public void simplify(){
           int hcf = gcd(num,deno);
           num /= hcf;
           deno /= hcf;
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(35,21);
        System.out.println(f1.num+ "/" +f1.deno);

        Fraction f2 = new Fraction(7,3);
        System.out.println(f2.num+ "/" +f2.deno);

        Fraction f3 = add(f1,f2);
        System.out.println(f3.num+ "/" +f3.deno);


    }
}
