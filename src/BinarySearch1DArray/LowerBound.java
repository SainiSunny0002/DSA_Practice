package BinarySearch1DArray;

public class LowerBound {
    // TC O(log2n) SC O(1)
    //smallest index such that arr[index] >= x
    public static int lowerBound(int arr[],int n,int x){
        int low = 0,high = n-1;
        int ans = n;
        while (low <= high){
            int mid = (low+high)/2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,7,8,9,9,9,11};
        int n = arr.length;
        int x = 1;
        System.out.print(lowerBound(arr,n,x));
    }
}
