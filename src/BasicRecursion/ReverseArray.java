package BasicRecursion;

import java.util.Scanner;

public class ReverseArray {
//    public static int[] reverseArray(int l, int r, int[] arr) {
//        if (l >= r) return arr;
//        int temp = arr[l];
//        arr[l] = arr[r];
//        arr[r] = temp;
//        reverseArray(l+1,r-1,arr);
//        return arr;
//    }

    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int i = 0;
        recursiveCall(i,n,nums);
        return nums;
    }

    public static void recursiveCall(int i, int n, int[] nums){
        if (i >= n/2) return;
        int temp = nums[i];
        nums[i] = nums[n-i-1];
        nums[n-i-1] = temp;
        recursiveCall(i+1,n,nums);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = cin.nextInt();
        }
//        int[] newArr = reverseArray(0,n-1,arr);
        int[] newArr = reverseArray(n, arr);
        for (int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
