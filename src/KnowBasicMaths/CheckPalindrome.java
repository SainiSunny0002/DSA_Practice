package KnowBasicMaths;

import java.util.Scanner;

public class CheckPalindrome {
    static void checkPalindrome(int n){
        int temp = n,digit,sum = 0;
        while (n>0){
            digit = n%10;
            n = n/10;
            sum = (sum*10)+digit;
        }
        if (temp == sum) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        checkPalindrome(n);
    }
}
