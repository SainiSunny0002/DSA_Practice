package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int[] sort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
    public static int binarySearch(int[] arr, int key){
        int low = 0,high = arr.length-1;
        while (low <= high){
            int mid = low + (high-low)/2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] < key)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int arr[] = new int[n];
        int i = 0;
        while (i < n){
            arr[i] = cin.nextInt();
            i++;
        }
        int key = cin.nextInt();
        int sortedArr[] = sort(arr);
        for (int element : sortedArr){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(binarySearch(sortedArr,key));
    }
}
