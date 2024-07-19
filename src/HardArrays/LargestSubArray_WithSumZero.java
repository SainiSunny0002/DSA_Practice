package HardArrays;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArray_WithSumZero {
    //brute force approach TC O(n^3) SC O(1)
//    public static int largestSubArray_withSumZero(int arr[]){
//        int maxLength=0;
////        for(int i=0;i<arr.length;i++){
////            for (int j=i;j<arr.length;j++){
////                int sum=0;
////                for(int k=i;k<=j;k++){
////                    sum+=arr[k];
////                }
////                if (sum == 0) maxLength = Math.max(maxLength,j-i+1);
////            }
////        }
//        for(int i=0;i<arr.length;i++){
//            int sum=0;
//            for (int j=i;j<arr.length;j++){
//               sum+=arr[j];
//               if (sum == 0) maxLength = Math.max(maxLength,j-i+1);
//            }
//        }
//        return maxLength;
//    }

    //optimal approach TC O(nlogn) SC O(n)
    public static int largestSubArray_withSumZero(int arr[]){
        Map<Integer,Integer> prefixSum = new HashMap<>();
        int sum = 0, maxLength = 0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
            if (sum == 0){
                maxLength = Math.max(maxLength,i+1);
            }
            int remaning = sum - 0;
            if (prefixSum.containsKey(remaning)){
                int length = i-prefixSum.get(remaning);
                maxLength = Math.max(maxLength,length);
            }
            if (!prefixSum.containsKey(sum)){
                prefixSum.put(sum,i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int arr[] = {1,-1,3,2,-2,-8,1,7,10,23};
        System.out.print(largestSubArray_withSumZero(arr));
    }
}
