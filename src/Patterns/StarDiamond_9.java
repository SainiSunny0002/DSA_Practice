package Patterns;

import java.util.Scanner;

public class StarDiamond_9 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
