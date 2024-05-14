package Patterns;

import java.util.Scanner;

public class NumberCrown_12 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int space = 2*(n-1);
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print((j+1) + " ");
            }
            for (int j=0;j<space;j++){
                System.out.print(" ");
            }
            for (int j=i;j>=0;j--){
                System.out.print((j+1) + " ");
            }
            System.out.println();
            space = space-2;
        }
    }
}
