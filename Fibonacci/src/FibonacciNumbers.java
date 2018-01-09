/*
Fibonacci numbers
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciNumbers {

    public static void main(String[] args) {
        System.out.println("Fibonacci numbers");
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        //ArrayList<Integer> fibonacciList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("How many Fibonacci numbers you want?");
        int n = 0;
        try {
            n = sc.nextInt();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }
        //f0 = 0, f1 = 1, f2 = 1, f3 = 2, f4 = 3
//        fibonacciList.add(0);
//        fibonacciList.add(1);
//        int fibonacciResult = 0;

        for(int i = 0; i <= n; i++){
            System.out.println(fibonacciNumbers.fibonacci(i));
//            fibonacciResult = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
//            fibonacciList.add(fibonacciResult);
        }

    }

    public int fibonacci(int n){
        if(n <= 1) {
            return n;
        }else {
            return fibonacci(n -1) + fibonacci(n - 2);
        }
    }
}
