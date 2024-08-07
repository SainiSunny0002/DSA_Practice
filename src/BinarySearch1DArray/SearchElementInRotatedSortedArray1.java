package BinarySearch1DArray;

public class SearchElementInRotatedSortedArray1 {
    //array only have unique elements
    // TC O(log2n) SC O(1)
    public static int searchElement(int arr[],int target){
        int n = arr.length;
        int low = 0,high = n-1;
        while (low <= high){
            int mid  = (low+high)/2;
            if (arr[mid] == target) return mid;
            if (arr[low] <= arr[mid]){
                if (arr[low] <= target && target <= arr[mid]) high = mid-1;
                else low = mid+1;
            }else {
                if (arr[mid] <= target && target <= arr[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {7,8,9,1,2,3,4,5,6};
        int target = 1;
        System.out.print(searchElement(arr,target));
    }
}
