package HardArrays;

import java.util.*;

public class ThreeSum {
    //brute force approach TC O(n^3 * log(no of triplets)) SC 2*O(no of triplets)
//    public static List<List<Integer>> threeSum(int arr[]){
//        List<List<Integer>> list = new ArrayList<>();
//        Set<List<Integer>> set = new HashSet<>();
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                for (int k=j+1;k<arr.length;k++){
//                    if (arr[i]+arr[j]+arr[k]==0){
//                        List<Integer> temp = new ArrayList<>();
//                        temp.add(arr[i]);
//                        temp.add(arr[j]);
//                        temp.add(arr[k]);
//                        Collections.sort(temp);
//                        set.add(temp);
//                    }
//                }
//            }
//        }
//        list.addAll(set);
//        return list;
//    }

    //better approach TC O(n^2 * log(no of triplets)) SC O(2*no of triplects)+O(n)
//    public static List<List<Integer>> threeSum(int arr[]){
//        List<List<Integer>> list = new ArrayList<>();
//        Set<List<Integer>> set = new HashSet<>();
//        for (int i=0;i<arr.length;i++){
//            Set<Integer> hashSet = new HashSet<>();
//            for (int j=i+1;j<arr.length;j++){
//                int third = -(arr[i]+arr[j]);
//                if (hashSet.contains(third)){
//                    List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
//                    temp.sort(null);
//                    set.add(temp);
//                }
//                hashSet.add(arr[j]);
//            }
//        }
//        list.addAll(set);
//        return list;
//    }

    //optimal approach TC O(nlogn) + O(n^n) SC O(no of triplets)
    public static List<List<Integer>> threeSum(int arr[]){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            if (i>0 && arr[i] == arr[i-1]) continue;
            int j=i+1,k=arr.length-1;
            while (j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if (sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else {
                    List<Integer> list = Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(list);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j-1]) j++;
                    while (j < k && arr[k] == arr[k+1]) k--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(arr);
        System.out.print(list);
    }
}
