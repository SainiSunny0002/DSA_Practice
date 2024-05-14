package Patterns;

import java.util.Scanner;

public class Seeding_5 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
//        for(int i=0;i<n;i++){
//            for (int j=n;j>i;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for(int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
