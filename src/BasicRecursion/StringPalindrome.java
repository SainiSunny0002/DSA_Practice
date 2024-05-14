package BasicRecursion;

import java.util.Scanner;

public class StringPalindrome {
    public static boolean isPalindrome(String str) {
        int i = 0;
        return recusrsiveCall(i,str);
    }

    public static boolean recusrsiveCall(int i, String str) {
        if (i >= str.length()/2) return true;
        if (str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        return recusrsiveCall(i+1,str);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.next();
        boolean validPalindrome = isPalindrome(str);
        System.out.println(validPalindrome);
    }
}
