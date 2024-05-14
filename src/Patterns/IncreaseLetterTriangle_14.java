package Patterns;

import java.util.Scanner;

public class IncreaseLetterTriangle_14 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int num = 65;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print((char) (num+j) + " ");
            }
            System.out.println();
        }
    }
}
