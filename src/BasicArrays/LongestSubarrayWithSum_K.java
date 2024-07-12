package BasicArrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSum_K {
    //brute force approach TC O(n^3) SC O(1) if we use 3 for loops and if we use 2 for loops TC O(n^2)
//    public static int longestSubarrayWithSum_k(int arr[],int k){
//        int maxLength = 0;
////        for (int i=0;i<arr.length;i++){
////            for (int j=i;j<arr.length;j++){
////                int sum = 0;
////                for (int K=i;K<=j;K++){
////                    sum += arr[K];
////                }
////                if (sum == k) maxLength=Math.max(maxLength,j-i+1);
////            }
////        }
//        for (int i=0;i<arr.length;i++){
//            int sum = 0;
//            for (int j=i;j<arr.length;j++){
//                sum += arr[j];
//                if (sum == k) maxLength=Math.max(maxLength,j-i+1);
//            }
//        }
//        return maxLength;
//    }

    //better approach for positive array only using hashing TC O(n*logn)(ordered map) SC O(n)
    //for array contain positive and negative both numbers this is optimal approach
//    public static int longestSubarrayWithSum_k(int arr[],int k){
//        Map<Integer,Integer> prefixSum = new HashMap<>();
//        int sum = 0, maxLength = 0;
//        for (int i=0;i<arr.length;i++){
//            sum += arr[i];
//            if (sum == k){
//                maxLength = Math.max(maxLength,i+1);
//            }
//            int remaning = sum - k;
//            if (prefixSum.containsKey(remaning)){
//                int length = i-prefixSum.get(remaning);
//                maxLength = Math.max(maxLength,length);
//            }
//            if (!prefixSum.containsKey(sum)){
//                prefixSum.put(sum,i);
//            }
//        }
//        return maxLength;
//    }

    //optimal approach for positive array elements TC O(2n) SC O(1)
    public static int longestSubarrayWithSum_k(int arr[],int k){
        int left = 0, right = 0, sum = arr[0], maxLength = 0;
        while (right<arr.length){
            while (left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength,right-left+1);
            }
            right++;
            if (right < arr.length) sum+=arr[right];
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,4,2,3};
        int k = 3;
        System.out.print(longestSubarrayWithSum_k(arr,k));
    }
}
