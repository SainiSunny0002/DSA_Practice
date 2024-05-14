package Patterns;

import java.util.Scanner;

public class RotatedTriangle_10 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
//        for (int i=0;i<n;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n-i-1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for (int i=1;i<=2*n-1;i++){
            int stars = i;
            if (i > n) stars = 2*n-i;
            for (int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
