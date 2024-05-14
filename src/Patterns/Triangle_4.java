package Patterns;

import java.util.Scanner;

public class Triangle_4 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((i+1) + " ");
            }
            System.out.println();
        }
    }
}
