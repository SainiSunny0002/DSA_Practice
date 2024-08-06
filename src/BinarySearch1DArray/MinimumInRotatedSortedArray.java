package BinarySearch1DArray;

public class MinimumInRotatedSortedArray {
    //array has unique elements
    //TC O(log2n) SC O(1)
    public static int minimumRotatedSorted(int arr[]){
        int n = arr.length,ans = Integer.MAX_VALUE;
        int low = 0,high = n-1;
        while (low <= high){
            int mid = (low+high)/2;
            if(arr[low] <= arr[high]){
                ans = Math.min(ans,arr[low]);
                break;
            }
            if (arr[low] <= arr[mid]){
                ans = Math.min(ans,arr[low]);
                low = mid+1;
            }else {
                ans = Math.min(ans,arr[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.print(minimumRotatedSorted(arr));
    }
}
