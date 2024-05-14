package Patterns;

import java.util.Scanner;

public class ReverseNumTriangle_6 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for(int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
    }
}
