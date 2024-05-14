package Patterns;

import java.util.Scanner;

public class SymmetricVoid_19 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int initialSpaces = 0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for (int j=0;j<initialSpaces;j++){
                System.out.print(" ");
            }
            for (int j=0;j<n-i;j++){
                System.out.print("*");
            }
//            for (int j=n;j>i;j--){
//                System.out.print("*");
//            }
            initialSpaces += 2;
            System.out.println();
        }
        initialSpaces = 2*n-2;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            for (int j=0;j<initialSpaces;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
//            for (int j=n;j>i;j--){
//                System.out.print("*");
//            }
            initialSpaces -= 2;
            System.out.println();
        }
    }
}
