package KnowBasicMaths;

import java.util.Scanner;

public class PrintAllDivisors {
    static void printSumOfAllDivisors(int n){
        //sum of all digit divisors from 1 to n
        int sum = 0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (i % j == 0){
                    sum = sum + j;
                }
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        printSumOfAllDivisors(n);
    }
}
