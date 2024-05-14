package Patterns;

import java.util.Scanner;

public class ReverseStarTriangle_8 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
//        for (int i=0;i<n;i++){
//            for (int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            for (int j=0;j<2*n-(2*i+1);j++){
//                System.out.print("*");
//            }
//            for (int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
        int gap = 0, stars = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < gap; j++) {
                System.out.print(' ');
            }
            for (int j = gap ; j < gap + stars; j++) {
                System.out.print('*');
            }
            System.out.println();
            gap++;
            stars -= 2;
        }
    }
}
