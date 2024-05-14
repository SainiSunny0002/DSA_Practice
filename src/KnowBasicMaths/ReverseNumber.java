package KnowBasicMaths;

import java.util.Scanner;

public class ReverseNumber {
    static void reverse(int n){
        int reverseNumber = 0,lastDigit;
        while (n>0){
            lastDigit = n%10;
            n = n/10;
            reverseNumber = (reverseNumber*10)+lastDigit;
        }
        System.out.println(reverseNumber);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        reverse(n);
    }
}
