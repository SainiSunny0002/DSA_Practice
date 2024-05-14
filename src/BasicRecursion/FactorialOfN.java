package BasicRecursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorialOfN {
    public static List<Long> factorialNumbers(long n) {
        List<Long> result = new ArrayList<>();
        recursiveCall(n, 1, 2, result);
        return result;
    }

    public static void recursiveCall(long n, long fact, long i, List<Long> result) {
        if (fact > n) return;
        result.add(fact);
        recursiveCall(n, fact * i, i + 1, result);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long n = cin.nextLong();
        System.out.println(factorialNumbers(n));
    }
}
