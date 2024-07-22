package HardArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingSubintervals {
    //brute force approach TC O(nlogn)+O(2n) SC O(n)
//    public static List<List<Integer>> mergeOverlappingSubinvervals(int arr[][]){
//        int n = arr.length;
//        Arrays.sort(arr, new Comparator<int[]>() {
//            public int compare(int[] a, int[] b) {
//                return a[0] - b[0];
//            }
//        });
//        List<List<Integer>> ans = new ArrayList<>();
//        for (int i=0;i<n;i++){
//            int start = arr[i][0];
//            int end = arr[i][1];
//            if (!ans.isEmpty() && end <= ans.get(ans.size()-1).get(1)) continue;
//            for (int j=i+1;j<n;j++){
//                if (arr[j][0] <= end){
//                    end = Math.max(end,arr[j][1]);
//                }
//                else break;
//            }
//            ans.add(Arrays.asList(start,end));
//        }
//        return ans;
//    }

    //optimal approach TC O(nlogn)+O(n) SC O(n)
    public static List<List<Integer>> mergeOverlappingSubinvervals(int arr[][]){
        int n = arr.length;
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0;i<n;i++){
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(arr[i][0],arr[i][1]));
            }else{
                ans.get(ans.size() - 1).set(1,Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,3},{2,4},{3,5},{6,7}};
        System.out.print(mergeOverlappingSubinvervals(arr));
    }
}
