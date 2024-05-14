package BasicRecursion;

import java.util.Scanner;

public class NToOne_WithoutLoop {
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        recursiveCall(x,arr);
        return arr;
    }

    public static void recursiveCall(int x, int[] arr) {
        if (x==0) return;
        arr[arr.length - x]=x;
        recursiveCall(x-1,arr);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int newArr[] = printNos(n);
        for(int element : newArr){
            System.out.print(element+" ");
        }
    }
}
