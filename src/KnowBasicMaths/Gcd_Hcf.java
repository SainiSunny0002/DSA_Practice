package KnowBasicMaths;

import java.util.Scanner;

public class Gcd_Hcf {
    static void calculateGcdOrHcf(int n, int m){
//        int gcd = 1;
//        for (int i=1;i<=n;i++){
//            if (n%i == 0 && m%i == 0){
//                gcd = i;
//            }
//        }

//        for (int i=1;i<=Math.min(n,m);i++){
//            if (n%i == 0 && m%i == 0){
//                gcd = i;
//            }
//        }

        //equilateral algorithm gcd(a,b) = gcd(a-b,b)(a>b)   optimal approach
        while (n>0 && m>0){
            if (n>m) n = n%m;
            else m = m%n;
        }
        if (n==0) System.out.println("gcd("+n+","+m+") = " + m);
        else System.out.println("gcd("+n+","+m+") = " + n);
//        System.out.println("gcd("+n+","+m+") = " + gcd);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        calculateGcdOrHcf(n,m);
    }
}
