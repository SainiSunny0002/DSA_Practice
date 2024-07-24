package HardArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repeating_MissingNumber {
    //brute force approach TC O(n^2) SC O(1)
//    public static List<Integer> repeatingAndMissing(int arr[], int n){
//        List<Integer> list = new ArrayList<>();
//        int repeating = -1,missing = -1;
//        for (int i=1;i<=n;i++){
//            int count = 0;
//            for (int j=0;j<arr.length;j++){
//                if (arr[j] == i) count++;
//            }
//            if (count == 2) repeating = i;
//            else if (count == 0) missing = i;
//            if (repeating != -1 && missing != -1) break;
//        }
//        list.add(repeating);
//        list.add(missing);
//        return list;
//    }

    //better approach using hashing TC O(2n) SC O(n)
//    public static List<Integer> repeatingAndMissing(int arr[],int n){
//        int hashArr[] = new int[n+1];
//        for (int i=0;i<arr.length;i++){
//            hashArr[arr[i]] += 1;
//        }
//        int repeating = -1, missing = -1;
//        for (int i=1;i<=n;i++){
//            if (hashArr[i] == 2) repeating = i;
//            else if (hashArr[i] == 0) missing = i;
//            if (repeating != -1 && missing != -1) break;
//        }
//        return Arrays.asList(repeating,missing);
//    }

    //optimal approach using Math TC O(n) SC O(1)
    public static List<Integer> repeatingAndMissing(int arr[],int n){
        //s1-sn = x-y
        //s2-s2n
        int sn = (n*(n+1))/2;
        int s2n = (n*(n+1)*(2*n+1))/6;
        int s1 = 0,s2 = 0;
        for (int i=0;i<n;i++){
            s1 += arr[i];
            s2 += arr[i]*arr[i];
        }
        int val1 = s1 - sn;
        int val2 = s2 - s2n;
        val2 = val2/val1;
        int x = (val1 + val2)/2;
        int y = x - val1;
        return Arrays.asList(x,y);
    }

    public static void main(String[] args) {
        int arr[] = {4,3,6,2,1,1};
        int n = 6;
        System.out.print(repeatingAndMissing(arr,n));
    }
}
