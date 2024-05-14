package Patterns;

import java.util.Scanner;

public class IncreasingNumberTriangle_13 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int num = 1;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(num + " ");
                num = num +1;
            }
            System.out.println();
        }
    }
}
