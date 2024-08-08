package BinarySearch1DArray;

public class FindPeekElement {
    //brute force approach TC O(n) SC O(1)
//    public static int peekElement(int arr[]){
//        int n = arr.length;
//        for (int i=0;i<n;i++){
//            if ((i == 0 || arr[i-1] < arr[i]) && (i == n-1 || arr[i] > arr[i+1])) return arr[i];
//        }
//        return -1;
//    }

    //optimal approach TC O(log2n) SC O(1)
    public static int peekElement(int arr[]){
        int n = arr.length;
        int low = 1,high = n-2;
        if (n == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[n-1] > arr[n-2]) return n-1;
        while (low <= high){
            int mid = (low+high)/2;
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return mid;
            if (arr[mid] > arr[mid-1]) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,5,1};
        System.out.print(peekElement(arr));
    }
}
