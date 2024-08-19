package BinarySearchOnAnswers;

public class KthMissingPositiveNumber {
    //brute force approach TC O(n) SC O(1)
//    public static int missing(int arr[],int k){
//        for (int i=0;i<arr.length;i++){
//            if (arr[i] <= k) k++;
//            else break;
//        }
//        return k;
//    }

    //optimal approach O(log2n) SC O(1)
    public static int missing(int arr[], int k){
        int n = arr.length;
        int low = 0, high = n-1;
        while (low <= high){
            int mid = (low+high)/2;
            int missing = arr[mid] - (mid+1);
            if (missing < k) low = mid+1;
            else high = mid-1;
        }
        return high+1+k; //or low+k
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,7,11};
        int k = 5;
        System.out.print(missing(arr,k));
    }
}
