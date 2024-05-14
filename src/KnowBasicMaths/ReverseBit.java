package KnowBasicMaths;

import java.util.Scanner;

public class ReverseBit {
    static long reverseBit(long n){
        long dn = 0; // variable for new decimal number
        int j = 30; // initial value of j
        // loop to find the reversed binary bit
        for (int i = 0; i < 32; i++) {
            int k = (int)((n >> i) & 1); // k will be the required bit
            if (k != 0) { // if bit is set then only convert in decimal
                if (j == -1) { // since if j = -1 then left shift operator will not work
                    dn = Math.abs(dn) + (long)Math.pow(2, 0);
                } else {
                    dn = Math.abs(dn) + (2 << j); // here left shift operator calculates 2 to power j for making code efficient
                }
            }
            j--; // j is decreased in each iteration
        }
        return Math.abs(dn);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long n = cin.nextLong();
        System.out.println(reverseBit(n));
    }
}
