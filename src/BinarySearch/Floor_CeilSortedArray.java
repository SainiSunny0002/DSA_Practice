package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class Floor_CeilSortedArray {
    //TC O(logn) SC O(1)
    //floor = largest num in array <= x // ceil =  smallest num in array >= x
    public static int getFloor(int arr[],int n,int x){
        int low = 0,high = n-1;
        int floor = -1;
        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid] <= x){
                floor = arr[mid];
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return floor;
    }

    public static int getCeil(int arr[],int n,int x){
        int low = 0,high = n-1;
        int ceil = -1;
        while (low <= high){
            int mid = (low+high)/2;
            if (arr[mid] >= x){
                ceil = arr[mid];
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ceil;
    }
    public static int[] floor_ceilSortedArray(int arr[], int x){
        int n = arr.length;
        int floor = getFloor(arr,n,x);
        int ceil = getCeil(arr,n,x);
        return new int[]{floor,ceil};
    }
    public static void main(String[] args) {
        int arr[] = {3,4,7,8,8,10};
        int x = 5;
       int ans[] = floor_ceilSortedArray(arr,x);
       System.out.print(ans[0] + " " + ans[1]);
    }
}
