package BasicJava;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {
    public static String solve(int n){
        BigInteger num = new BigInteger("1");
        for(int i=2;i<=n;i++){
            num=num.multiply(BigInteger.valueOf(i));
        }
        return num.toString();
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println(solve(n));
    }
}
