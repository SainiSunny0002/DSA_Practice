package MediumArrays;

import java.util.ArrayList;
import java.util.List;

public class SortZeroes_Ones_Twos {
    //brute force approach using any sorting algorithm TC O(nlogn) SC O(n)
//    public static void sortZeroes_ones_twos(int arr[],int low,int high){
//        if (low >= high) return;
//        int mid = (low+high)/2;
//        sortZeroes_ones_twos(arr,low,mid);
//        sortZeroes_ones_twos(arr,mid+1,high);
//        merge(arr,low,mid,high);
//    }
//    public static void merge(int arr[],int low,int mid,int high){
//        List<Integer> list = new ArrayList<>();
//        int left = low,right = mid+1;
//        while (left <= mid && right <= high){
//            if (arr[left] <= arr[right]){
//                list.add(arr[left]);
//                left++;
//            }else {
//                list.add(arr[right]);
//                right++;
//            }
//        }
//        while (left <= mid){
//            list.add(arr[left]);
//            left++;
//        }
//        while (right <= high){
//            list.add(arr[right]);
//            right++;
//        }
//        for (int i=low;i<=high;i++){
//            arr[i] = list.get(i-low);
//        }
//    }

    //better approach TC O(2n) SC O(1)
//    public static void sortZeroes_ones_twos(int arr[]){
//        int counter0 = 0,counter1 = 0,counter2 = 0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i] == 0) counter0++;
//            else if (arr[i] == 1) counter1++;
//            else counter2++;
//        }
//        for (int i=0;i<counter0;i++){
//            arr[i] = 0;
//        }
//        for (int i=counter0;i<counter0+counter1;i++){
//            arr[i] = 1;
//        }
//        for (int i=counter0+counter1;i<arr.length;i++){
//            arr[i] = 2;
//        }
//    }

    //optimal approach (Dutch national flag algorithm) TC O(n) SC O(1)
    public static void sortZeroes_ones_twos(int arr[]){
        int low = 0,mid = 0,high = arr.length-1;
        while (mid <= high){
            if (arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 1) mid++;
            else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,1,2,1,2,0,0,0,1};
//        sortZeroes_ones_twos(arr,0,arr.length-1);
        sortZeroes_ones_twos(arr);
        for (int element : arr) System.out.print(element + " ");
    }
}
