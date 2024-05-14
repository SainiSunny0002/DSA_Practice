package Patterns;

import java.util.Scanner;

public class Ninja_Number_Pattern_22 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
//        for (int i=0;i<2*n-1;i++){
//            for (int j=0;j<2*n-1;j++){
//                int top = i, left = j, right = (2*n-2)-j, bottom = (2*n-2)-i;
//                System.out.print((n - Math.min(Math.min(top,bottom),Math.min(left,right))));
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int x = Math.abs(i - n + 1);
                int y = Math.abs(j - n + 1);
                int currCell = (int)Math.max(x, y) + 1;
                System.out.print(currCell);
            }
            System.out.println();
        }
    }
}
