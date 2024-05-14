package Patterns;

import java.util.Scanner;

public class StarTriangle_7 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for (int i=0;i<n;i++){
            //spaces
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //star
            for (int j=0;j<2*i+1;j++){
                System.out.print("x");
            }
            //spaces
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
