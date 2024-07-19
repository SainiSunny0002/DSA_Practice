package HardArrays;

import java.util.*;

public class FourSum {
    //brute force approach TC O(n^4 * log(no of quads)) SC 2*O(no of quads)
//    public static List<List<Integer>> fourSum(int arr[],int target){
//        List<List<Integer>> ans = new ArrayList<>();
//        Set<List<Integer>> set = new HashSet<>();
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                for (int k=j+1;k<arr.length;k++){
//                    for (int l=k+1;l<arr.length;l++){
//                        if (arr[i]+arr[j]+arr[k]+arr[l]==0){
//                            List<Integer> list = new ArrayList<>();
//                            list.add(arr[i]);list.add(arr[j]);list.add(arr[k]);list.add(arr[l]);
//                            Collections.sort(list);
//                            set.add(list);
//                        }
//                    }
//                }
//            }
//        }
//        ans.addAll(set);
//        return ans;
//    }

    //better approach TC O(n^3 * log(no of quads)) SC O(n)+2*O(no of quads)
//    public static List<List<Integer>> fourSum(int arr[],int target){
//        List<List<Integer>> ans = new ArrayList<>();
//        Set<List<Integer>> set = new HashSet<>();
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                Set<Integer> hashSet = new HashSet<>();
//                for (int k=j+1;k<arr.length;k++){
//                    int fourth = -(arr[i]+arr[j]+arr[k]);
//                    if (hashSet.contains(fourth)){
//                        List<Integer> list = Arrays.asList(arr[i],arr[j],arr[k],fourth);
//                        Collections.sort(list);
//                        set.add(list);
//                    }
//                    hashSet.add(arr[k]);
//                }
//            }
//        }
//        ans.addAll(set);
//        return ans;
//    }

    //optimal approach TC O(n^2*n) SC O(no of quads)
    public static List<List<Integer>> fourSum(int arr[],int target){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if (i>0 && arr[i] == arr[i-1]) continue;
            for (int j=i+1;j<arr.length;j++){
                if (j != i+1 && arr[j] == arr[j-1]) continue;
                int k = j+1;int l = arr.length-1;
                while (k<l){
                    int sum = arr[i];
                    sum += arr[j];
                    sum += arr[k];
                    sum += arr[l];
                    if (sum == target){
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                        ans.add(temp);
                        k++; l--;
                        while (k < l && arr[k] == arr[k-1]) k++;
                        while (k < l && arr[l] == arr[l+1]) l--;
                    } else if (sum < target) k++;
                    else l--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.print(fourSum(arr,target));
    }
}
