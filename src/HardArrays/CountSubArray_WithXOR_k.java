package HardArrays;

import java.util.HashMap;
import java.util.Map;

public class CountSubArray_WithXOR_k {
    //brute force approach TC O(n^3) SC O(1)
//    public static int countSubArray_withXor_k(int arr[],int K){
//        int count = 0;
//        for (int i=0;i<arr.length;i++){
//            for (int j=i;j<arr.length;j++){
//                int xor = 0;
//                for (int k=i;k<=j;k++){
//                    xor = xor ^ arr[k];
//                }
//                if (xor == K) count++;
//            }
//        }
//        return count;
//    }

    //better approach TC O(n^2) SC O(1)
//    public static int countSubArray_withXor_k(int arr[],int K){
//        int count = 0;
//        for (int i=0;i<arr.length;i++){
//            int xor = 0;
//            for (int j=i;j<arr.length;j++){
//               xor = xor ^ arr[j];
//               if (xor == K) count++;
//            }
//        }
//        return count;
//    }

    //optimal approach TC O(nlogn) SC O(n)
    public static int countSubArray_withXor_k(int arr[],int K){
        int xr = 0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(xr,1);
        for (int i=0;i<arr.length;i++){
            xr = xr ^ arr[i];
            int x = xr ^ K;
            if (map.containsKey(x)) {
                count += map.get(x);
            }
            if (map.containsKey(xr)) {
                map.put(xr, map.get(xr) + 1);
            } else {
                map.put(xr, 1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,2,6,4};
        int K = 6;
        System.out.print(countSubArray_withXor_k(arr,K));
    }
}
