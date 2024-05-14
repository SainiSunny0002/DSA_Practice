package Patterns;

import java.util.Scanner;

public class NTriangles_3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j <= i; j++){
//                System.out.print((j + 1) + " ");
//            }
//            System.out.println();
//        }
    }
}
