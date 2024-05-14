package BasicRecursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsequence {
    public static void printSubsequence(int i, List<Integer> list, int[] arr) {
        if (i >= arr.length){
            System.out.println(list);
            return;
        }
        list.add(arr[i]);
        printSubsequence(i+1,list,arr);
        list.remove(list.size()-1);
        printSubsequence(i+1,list,arr);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int arr[] = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            arr[i] = cin.nextInt();
        }
        printSubsequence(0,list,arr);
    }
}
