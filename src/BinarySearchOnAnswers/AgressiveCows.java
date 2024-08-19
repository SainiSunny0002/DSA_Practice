package BinarySearchOnAnswers;

import java.util.Arrays;

public class AgressiveCows {
    //agressive cows means min distance between two cows is max
    //brute force approach TC O(NlogN) + O(N *(max(arr[])-min(arr[]))) SC O(1)
//    public static int aggressiveCows(int arr[],int cows){
//        int n = arr.length;
//        Arrays.sort(arr);
//        int limit = arr[n-1] - arr[0];
//        for (int i=0;i<n;i++){
//            if (canWePlace(arr,i,cows) == false) return (i-1);
//        }
//        return limit;
//    }
    public static boolean canWePlace(int arr[],int dist, int cows){
        int n = arr.length; //size of array
        int cntCows = 1; //no. of cows placed
        int last = arr[0]; //position of last placed cow.
        for (int i = 1; i < n; i++) {
            if (arr[i] - last >= dist) {
                cntCows++; //place next cow.
                last = arr[i]; //update the last location.
            }
            if (cntCows >= cows) return true;
        }
        return false;
    }

    //optimal approach TC O(NlogN) + O(N * log(max(stalls[])-min(stalls[]))) SC O(1)
    public static int aggressiveCows(int arr[], int cows){
        int n = arr.length;
        Arrays.sort(arr);
        int low = 0, high = arr[n-1]-arr[0];
        while (low <= high){
            int mid = (low+high)/2;
            if (canWePlace(arr, mid, cows) == true) {
                low = mid + 1;
            } else high = mid - 1;
        }
        return high;
    }
    public static void main(String[] args) {
        int arr[] = {0,3,4,7,10,9};
        int cows = 4;
        System.out.print(aggressiveCows(arr,cows));
    }
}
