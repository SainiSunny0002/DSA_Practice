package KnowBasicMaths;

import java.util.Scanner;

public class CheckArmstrong {
    static void checkArmstrong(int n){
        int sum = 0,temp = n,digit,count=0;
        while (n>0){
            n = n/10;
            count++;
        }
        n = temp;
        while (n>0){
            digit = n%10;
            sum = sum + ((int) Math.pow(digit,count));
            n = n/10;
        }
        if (sum == temp) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        checkArmstrong(n);
    }
}
