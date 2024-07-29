package BinarySearch1DArray;

public class FindX_inSortedArray {
    // TC O(log2n) SC O(1)
//    public static int findXInSortedArray(int arr[],int target){
//        int low = 0,high = arr.length-1;
//        while (low <= high){
//            int mid = (low+high)/2;
//            if (arr[mid] == target) return mid;
//            else if(arr[mid] < target) low = mid+1;
//            else high = mid-1;
//        }
//        return -1;
//    }

    //recursive approach
    public static int findXInSortedArray(int arr[],int low,int high,int target){
        if (low > high) return -1;
        int mid = (low+high)/2;
        if (arr[mid] == target) return mid;
        else if(arr[mid] < target) return findXInSortedArray(arr,mid+1,high,target);
        return findXInSortedArray(arr,low,mid-1,target);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,7,9,11,12,45};
        int target = 3;
//        System.out.print(findXInSortedArray(arr,target));
        System.out.print(findXInSortedArray(arr,0,arr.length-1,target));
    }
}
