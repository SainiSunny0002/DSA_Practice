package MediumArrays;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithGivenSum {
    //brute force approach TC O(n^3) SC O(1)
//    public static int countSubArrayWithGivenSum(int arr[],int K){
//        int count = 0;
//        for (int i=0;i<arr.length;i++){
//            for (int j=i;j<arr.length;j++){
//                int sum=0;
//                for (int k=i;k<=j;k++){
//                    sum += arr[k];
//                }
//                if (sum == K) count++;
//            }
//        }
//        return count;
//    }

    //better approach TC O(n^2) SC O(1)
//    public static int countSubArrayWithGivenSum(int arr[],int K){
//        int count=0;
//        for (int i=0;i<arr.length;i++){
//            int sum=0;
//            for (int j=i;j<arr.length;j++){
//                sum += arr[j];
//                if (sum == K) count++;
//            }
//        }
//        return count;
//    }

    //optimal approach TC O(nlogn) SC O(n)
    public static int countSubArrayWithGivenSum(int arr[],int K){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int preSum=0,count=0;
        for (int i=0;i<arr.length;i++){
            preSum += arr[i];
            int remove = preSum-K;
            count += map.getOrDefault(remove,0);
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2,4};
        int K = 6;
        System.out.print(countSubArrayWithGivenSum(arr,K));
    }
}
