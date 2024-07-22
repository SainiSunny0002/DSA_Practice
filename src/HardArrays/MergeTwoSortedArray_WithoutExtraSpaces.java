package HardArrays;

import java.util.Arrays;

public class MergeTwoSortedArray_WithoutExtraSpaces {
    //brute force TC O(n+m)+O(n+m) SC O(n+m)
//    public static int[] mergeTwoSortedArray(int arr1[],int arr2[]){
//        int n = arr1.length;
//        int m = arr2.length;
//        int arr3[] = new int[n+m];
//        int left = 0,right = 0,index = 0;
//        while (left < n && right < m){
//            if (arr1[left] <= arr2[right]){
//                arr3[index] = arr1[left];
//                left++;
//                index++;
//            }else {
//                arr3[index] = arr2[right];
//                right++;
//                index++;
//            }
//        }
//        while (left < n) arr3[index++] = arr1[left++];
//        while (right < m) arr3[index++] = arr2[right++];
//
//        //push back into arr1 and arr2
//        for(int i=0;i<n+m;i++){
//            if (i<n) arr1[i] = arr3[i];
//            else arr2[i-n] = arr3[i];
//        }
//        return arr3;
//    }

    //optimal approach-1 TC O(min(n,m))+O(nlogn)+O(mlogm) SC O(1)
    public static void mergeTwoSortedArray(int arr1[],int arr2[]){
        int n = arr1.length,m = arr2.length;
        int left = n-1,right = 0;
        while (left >= 0 && right < m){
            if (arr1[left] > arr2[right]){
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }else break;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int element : arr1) System.out.print(element + " ");
        System.out.println();
        for(int element : arr2) System.out.print(element + " ");
    }
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7};
        int arr2[] = {0,2,6,8,9};
        //for brute force approach
//        int arr3[] = mergeTwoSortedArray(arr1,arr2);
//        for (int element : arr3) System.out.print(element + " ");
        mergeTwoSortedArray(arr1,arr2);
    }
}
