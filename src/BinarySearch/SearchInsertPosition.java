package BinarySearch;

public class SearchInsertPosition {
    //TC O(log2n) SC O(1)
    public static int searchInsertPosition(int arr[],int num){
        int low = 0,high = arr.length-1;
        int value = arr.length;
        while (low <= high){
            int mid = (low+high)/2;
            if (arr[mid] >= num){
                value = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return value;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,7};
        int num = 6;
        System.out.print(searchInsertPosition(arr,num));
    }
}
