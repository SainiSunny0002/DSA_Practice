package KnowBasicMaths;

import java.util.Scanner;

public class PrimeNumber {
    static void checkPrimeNumber(int n){
        int count = 0;
        //time complexity O(n)
//        for (int i=1;i<=n;i++){
//            if (n%i == 0){
//                count++;
//            }
//        }
        //optimal approach with time complexity O(SquareRoot(n))
        for (int i=1;i*i<=n;i++){ //i*i or i<= Math.sqrt(n)
            if (n%i == 0){
                count++;
                if((n/i) != i) count++;
            }
        }
        if (count <= 2) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        checkPrimeNumber(n);
    }
}
