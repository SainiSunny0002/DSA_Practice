package BasicRecursion;

import java.util.Scanner;

public class FibonacciNumber {
    public static int[] generateFibonacciNumbers(int n) {
//        int[] result = new int[n];
//        fibonacciSeries(result, n - 1);
//        return result;

        int[] result = new int[n];
        calculateFibonacci(result, 0, 1, 0);
        return result;
    }

    // this is optimal solution for fibonacci series
    static void calculateFibonacci(int[] result, int a, int b, int i) {
        if (i >= result.length) {
            return;
        }
        result[i] = a;
        calculateFibonacci(result, b, a + b, i + 1);
    }

    // this is less optimal for fibonacci series
//    public static int fibonacciSeries(int[] result, int i) {
//        if (i <= 1) {
//            result[i] = i;
//            return i;
//        }
//        result[i] = fibonacciSeries(result, i - 1) + fibonacciSeries(result, i - 2);
//        return result[i];
//    }

    //  this is for fibonacci number
    public static int fib(int n){
        if (n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] fibonacciNumber = generateFibonacciNumbers(n);
        for (int i=0;i<fibonacciNumber.length;i++){
            System.out.print(fibonacciNumber[i] + ", ");
        }
//        System.out.println(fib(n));
    }
}
