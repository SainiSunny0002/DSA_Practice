package Patterns;

import java.util.Scanner;

public class ReverseLetterTriangle_15 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for (int i=0;i<n;i++){
            int num = 65;
            for (int j=n;j>i;j--){
                System.out.print((char)(num) + " ");
                num++;
            }
            System.out.println();
        }
    }
}
