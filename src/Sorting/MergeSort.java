package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void mergeSort(int[] arr,int low,int high){
        if (low >= high) return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
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
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,3};
        int low = 0,high = arr.length-1;
        mergeSort(arr,low,high);
        for (int element : arr) System.out.print(element +" ");
    }
}
