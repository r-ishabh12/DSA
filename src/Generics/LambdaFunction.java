package Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            list.add(i);
        }
        list.forEach((item) -> System.out.print(item*2 + " ") );
        Consumer<Integer> fun = (item) -> System.out.print(item*2 + " ");
       list.forEach(fun);
        System.out.println();
        Operation sum = (a,b) -> a+b;
        Operation sub = (a,b) -> a-b;
        Operation prod = (a,b) -> a*b;
        LambdaFunction myCalculator = new LambdaFunction();

        System.out.println(myCalculator.operate(5,6,sum));
        System.out.println(myCalculator.operate(5,6,sub));
        System.out.println(myCalculator.operate(5,6,prod));
    }
    private int operate(int a, int b, Operation op){
        return op.op(a,b);
    }
}
interface Operation{
    int op(int a, int b);
}
