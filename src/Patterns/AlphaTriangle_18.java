package Patterns;

import java.util.Scanner;

public class AlphaTriangle_18 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for (int i=0;i<n;i++){
            int ch = 65+n-1;
            for (int j=0;j<=i;j++){
                System.out.print((char) ch + " ");
                ch--;
            }
            System.out.println();
//            ch++;
        }

//        for(int i = 0; i < n; i++) {
//            for(int ch = 65 + (n - i - 1); ch < 65 + n; ch++) {
//                System.out.print((char) ch + " ");
//            }
//            System.out.println();
//        }

        //commented print    if n = 3        C  BC  ABC
    }
}
