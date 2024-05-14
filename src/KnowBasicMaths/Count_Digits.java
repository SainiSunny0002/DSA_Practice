package KnowBasicMaths;

import java.util.Scanner;

public class Count_Digits {
    public static int countDigits(int n) {
        int count = 0, temp = n;
        while (temp > 0) {
            int lastDigit = temp % 10;
            if (lastDigit != 0) {
                if (n % lastDigit == 0) {
                    count++;
                }
            }
            temp = temp / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println(countDigits(n));
    }
}
