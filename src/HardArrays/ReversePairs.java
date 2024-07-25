package HardArrays;

import java.util.ArrayList;
import java.util.List;

public class ReversePairs {
    //brute force approach TC O(n^2) SC O(1)
//    public static int reversePairs(int arr[]){
//        int count = 0;
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[i] > 2*arr[j]) count++;
//            }
//        }
//        return count;
//    }

    //optimal approach TC O(2nlogn) SC O(n)
    public static int mergeSort(int[] arr,int low,int high){
        int count = 0;
        if (low >= high) return count;
        int mid = (low+high)/2;
        count += mergeSort(arr,low,mid);
        count += mergeSort(arr,mid+1,high);
        count += countPairs(arr,low,mid,high);
        merge(arr,low,mid,high);
        return count;
    }

    private static int countPairs(int[] arr, int low, int mid, int high) {
        int count = 0;
        int right = mid+1;
        for (int i=low;i<=mid;i++){
            while (right <= high && arr[i] > 2*arr[right]) right++;
            count += (right - (mid+1));
        }
        return count;
    }

    public static void merge(int[] arr,int low,int mid,int high){
        List<Integer> list = new ArrayList<>();
        int left = low,right = mid+1;
        while (left <= mid && right <= high){
            if (arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }else {
                list.add(arr[right]);
                right++;
            }
        }
        while (left <= mid){
            list.add(arr[left]);
            left++;
        }
        while (right <= high){
            list.add(arr[right]);
            right++;
        }
        for (int i=low;i<=high;i++){
            arr[i] = list.get(i-low);
        }
    }
    public static int reversePairs(int arr[]){
       return  mergeSort(arr,0,arr.length-1);
    }
    public static void main(String[] args) {
        int arr[] = {40,25,19,12,9,6,2};
        System.out.print(reversePairs(arr));
    }
}
