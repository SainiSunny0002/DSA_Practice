package BinarySearchOnAnswers;

public class SmallestDivisor {
    //brute force appraoch TC O(max(arr)*n) SC O(1)
//    public static int smallestDivisor(int arr[],int limit){
//        int max = Integer.MIN_VALUE;
//        for (int i=0;i<arr.length;i++){
//            max = Math.max(max,arr[i]);
//        }
//        for (int i=1;i<=max;i++){
//            int sum = 0;
//            for (int j=0;j<arr.length;j++){
//                sum += Math.ceil((double)arr[j]/(double) i);
//            }
//            if (sum <= limit) return i;
//        }
//        return -1;
//    }

    //optimal approach TC O(log(max(arr)*n) SC O(1)
    public static int smallestDivisor(int arr[],int limit){
        int n = arr.length; int ans = -1;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        int low = 1,high = max;
        while (low <= high){
            int mid = (low+high)/2;
            if (sumOfDivision(arr,mid) <= limit){
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return ans;
    }
    public static int sumOfDivision(int arr[],int mid){
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum += Math.ceil((double) arr[i]/(double) mid);
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,9};
        int limit = 6;
        System.out.print(smallestDivisor(arr,limit));
    }
}
