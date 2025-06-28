package Revision;

public class Ques {
   static void greet(){
        System.out.println("Good Morning!");
    }

    static int square(int n){
       int squareNo = n*n;
       return squareNo;
    }

    static int findMax(int a, int b, int c){
       return a > b && a > c ? a : b > c ? b : c;
    }
    static void factorial(int n){
       int fact = 1;
       for (int i = n ; i > 0; i--){
          fact *= i;
       }
        System.out.println("Factorial of "+ n + " " + fact);
    }

    public static void main(String[] args) {
//        greet();
//        System.out.println( square(4));
//        System.out.println(findMax(1,3,2));
//        factorial(6);

        BankAccount ba1 = new BankAccount();
        ba1.AccountNumber = 0001;
        ba1.balance = 2000.00;
        ba1.deposit(1000);




    }
}

class BankAccount{
    int AccountNumber;
    double balance;

    void deposit(int amount){
        balance = balance + amount;
        System.out.println("Current balance in your Account is " + balance);
    }
    void withdraw(int amount){
        balance = Math.abs(balance - amount);
        System.out.println("Current balance in your Account is " + balance);
    }
}
