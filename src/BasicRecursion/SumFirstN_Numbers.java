package BasicRecursion;

import java.util.Scanner;

public class SumFirstN_Numbers {
    public static long sumFirstN(long n) {
        //with recursion time and space complaxity is O(n)
        if (n == 1) return 1;
        return n+sumFirstN(n-1);
        //with formula time and space complaxity is O(1)
//        long sum = n * (n + 1) / 2;
//        return sum;
    }

    public static long factorial(long n) {
        if (n == 1) return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long n = cin.nextLong();
        System.out.println(sumFirstN(n));
        System.out.println(factorial(n));
    }
}
