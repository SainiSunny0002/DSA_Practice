package BinarySearch1DArray;

public class SingleElementSortedArray {
    //brute force approach TC O(n) SC O(1)
//    public static int singleElement(int arr[]){
//      int n = arr.length;
//      if (n == 1) return arr[0];
//      for (int i=0;i<n;i++){
//          if (i == 0){
//              if (arr[i] != arr[i+1]) return arr[i];
//          }else if (i == n-1){
//              if (arr[i] != arr[i-1]) return arr[i];
//          }else {
//              if (arr[i] != arr[i+1] && arr[i] != arr[i-1]) return arr[i];
//          }
//      }
//      return -1;
//    }

    //optimal approach TC O(log2n) SC O(1)
    public static int singleElement(int arr[]){
        int n = arr.length;
        int low = 1,high = n-2;
        if (n == 1) return arr[0];
        if (arr[0] != arr[1]) return arr[0];
        if (arr[n-1] != arr[n-2]) return arr[n-1];
        while (low <= high){
            int mid = (low+high)/2;
            if (arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]) return arr[mid];
            //we are on left so eleminate left half
            if ((mid % 2 == 1 && arr[mid] == arr[mid-1]) || (mid % 2 == 0 && arr[mid] == arr[mid+1])){
                low = mid+1;
            }
            // we are on right so eleminate right half
            else high = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};
        System.out.print(singleElement(arr));
    }
}
