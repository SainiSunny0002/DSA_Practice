package HardArrays;

import java.util.ArrayList;
import java.util.List;

public class CountInversion {
    //brute force approach TC O(n^2) SC O(1)
//    public static int countInversion(int arr[]){
//        int count = 0;
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[i] > arr[j]) count++;
//            }
//        }
//        return count;
//    }

    //optimal approach TC O(nlogn) SC O(n)
    public static int  mergeSort(int[] arr,int low,int high){
        int count = 0;
        if (low >= high) return count;
        int mid = (low+high)/2;
        count += mergeSort(arr,low,mid);
        count += mergeSort(arr,mid+1,high);
        count += merge(arr,low,mid,high);
        return count;
    }
    public static int merge(int[] arr,int low,int mid,int high){
        List<Integer> list = new ArrayList<>();
        int left = low,right = mid+1;
        int count = 0;
        while (left <= mid && right <= high){
            if (arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }else {
                list.add(arr[right]);
                count += (mid-left+1);
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
        return count;
    }
    public static int countInversion(int arr[]){
        int low = 0, high = arr.length-1;
        return  mergeSort(arr,low,high);
    }
    public static void main(String[] args) {
        int arr[] = {5,3,2,4,1};
        System.out.print(countInversion(arr));
    }
}
