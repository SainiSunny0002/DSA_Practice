package Patterns;

import java.util.Scanner;

public class BinaryNumTriangle_11 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int num = 0;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                if ((i+j)%2 != 0) {
                    num = 0;
                }else{
                    num = 1;
                }
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
