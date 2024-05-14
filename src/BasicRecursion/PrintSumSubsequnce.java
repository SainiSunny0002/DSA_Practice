package BasicRecursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintSumSubsequnce {
    //print all subsequence whose sum is equal to specified sum
    static void printSumSubsequence(int i,int s, int sum, int[] arr,List<Integer> list){
        if (i >= arr.length){
            if (s == sum){
                System.out.println("Sum Subsequence : "+list);
            }
            return;
        }
        list.add(arr[i]);
        s+=arr[i];
        printSumSubsequence(i+1,s,sum,arr,list);
        s-=arr[i];
        list.remove(list.size()-1);
        printSumSubsequence(i+1,s,sum,arr,list);
    }

    //print any one subsequence
    static boolean printOneSubsequence(int i,int s, int sum, int[] arr,List<Integer> list){
        if (i >= arr.length){
            if (s == sum){
                System.out.println("Any One Subsequence : "+list);
                return true;
            }
            return false;
        }
        list.add(arr[i]);
        s+=arr[i];
        if(printOneSubsequence(i+1,s,sum,arr,list)==true) return true;
        s-=arr[i];
        list.remove(list.size()-1);
        if(printOneSubsequence(i+1,s,sum,arr,list)==true) return true;
        return false;
    }

    //print count of subsequence
    static int printCountSubsequence(int i,int s, int sum, int[] arr){
        if (i >= arr.length){
            if (s == sum){
                return 1;
            }
            return 0;
        }
        s+=arr[i];
        int l = printCountSubsequence(i+1,s,sum,arr);
        s-=arr[i];
        int r = printCountSubsequence(i+1,s,sum,arr);
        return l+r;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = cin.nextInt();
        System.out.print("Enter value of arr : ");
        int arr[] = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            arr[i] = cin.nextInt();
        }
        System.out.print("Enter value of sum : ");
        int sum = cin.nextInt();
        printSumSubsequence(0,0,sum,arr,list);
        printOneSubsequence(0,0,sum,arr,list);
        System.out.println("Count : "+printCountSubsequence(0,0,sum,arr));
    }
}
