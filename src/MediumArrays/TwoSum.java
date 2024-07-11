package MediumArrays;

import java.util.*;

public class TwoSum {
    //brute force approach TC O(n^2) SC O(n)
//    public static List<Integer> twoSum(int arr[], int target){
//        List<Integer> list = new ArrayList<>();
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[i] + arr[j] == target){
//                    list.add(i);
//                    list.add(j);
//                }
//            }
//        }
//        return list;
//    }

    //better approach using hashing TC O(nlogn) or O(n) SC O(n)
    // this is optimal for two sum if we need to return indexes
//    public static List<Integer> twoSum(int arr[], int target){
//        List<Integer> list = new ArrayList<>();
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i=0;i<arr.length;i++){
//            int num = arr[i],moreRequired = target-num;
//            if (map.containsKey(moreRequired)){
//                Collections.addAll(list,map.get(moreRequired),i);
//                break;
//            }
//            map.put(arr[i],i);
//        }
//        return list;
//    }

    //optimal approach if we need to return yes or no TC O(n)+O(nlogn) SC O(1)
    public static String twoSum(int arr[],int target){
        int left = 0;int right = arr.length-1;
        Arrays.sort(arr);
        while(left < right){
            int sum = arr[left]+arr[right];
            if (sum == target) {
                return "YES";
            }else if(sum > target) right--;
            else left++;
        }
        return "NO";
    }
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int target = 14;
        System.out.print(twoSum(arr,target));
    }
}
