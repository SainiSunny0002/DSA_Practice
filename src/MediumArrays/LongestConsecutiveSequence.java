package MediumArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    //brute force approach TC O(n^2) SC O(1)
//    public static int longestConsecutiveSequence(int arr[]){
//        int longest=1;
//        for (int i=0;i<arr.length;i++){
//            int x=arr[i];
//            int counter=1;
//            while (linearSeach(arr,x+1)){
//                x = x+1;
//                counter++;
//            }
//            longest = Math.max(longest,counter);
//        }
//        return longest;
//    }
//
//    private static boolean linearSeach(int[] arr, int x) {
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==x) return true;
//        }
//        return false;
//    }

    //better approach O(nlogn) + O(n) SC O(1)
//    public static int longestConsecutiveSequence(int arr[]){
//        int longest=1,lastSmaller=Integer.MIN_VALUE,counter=0;
//        Arrays.sort(arr);
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]-1 == lastSmaller){
//                counter += 1;
//                lastSmaller = arr[i];
//            }else if(lastSmaller != arr[i]){
//                counter = 1;
//                lastSmaller = arr[i];
//            }
//            longest = Math.max(longest,counter);
//        }
//        return longest;
//    }

    //optimal approach TC O(3n) SC O(n)
    public static int longestConsecutiveSequence(int arr[]){
        int n=arr.length;
        if (n==0) return 0;
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for (int element : set){
            if (!set.contains(element-1)){
                int counter = 1;
                int x = element;
                while (set.contains(x+1)){
                    x = x+1;
                    counter += 1;
                }
                longest = Math.max(longest,counter);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = {102,4,100,1,101,3,2,1,1};
        System.out.print(longestConsecutiveSequence(arr));
    }
}
