package HardArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement_nby3times {
    //brute force approach TC O(n^2) SC O(2)
//    public static List<Integer> majorityElement_nby3(int arr[],int n){
//        List<Integer> list = new ArrayList<>();
//        int nFloor = Math.floorDiv(n,3);
//        for(int i=0;i<arr.length;i++){
//            if (list.size()==0 || !list.contains(arr[i])){
//                int count = 0;
//                for (int j=0;j<arr.length;j++){
//                    if (arr[j]==arr[i]) count++;
//                }
//                if (count>nFloor) list.add(arr[i]);
//            }
//            if (list.size()==2) break;
//        }
//        return list;
//    }

    //better approach TC O(nlogn) SC O(n)
//    public static List<Integer> majorityElement_nby3(int arr[],int n){
//        Map<Integer,Integer> map = new HashMap<>();
//        List<Integer> list = new ArrayList<>();
//        int nFloor = Math.floorDiv(n,3);
//        for (int i=0;i<arr.length;i++){
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//            if (map.get(arr[i]) >nFloor) list.add(arr[i]);
//            if (list.size()==2) break;
//        }
//        return list;
//    }

    //optimal approach TC O(2n) SC O(1)
    public static List<Integer> majorityElement_nby3(int arr[],int n){
        int count1=0,count2=0;
        int element1=Integer.MIN_VALUE,element2=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (count1==0 && element2 != arr[i]){
                count1 = 1;
                element1 = arr[i];
            }else if (count2==0 && element1 != arr[i]){
                count2 = 1;
                element2 = arr[i];
            }else if (arr[i] == element1) count1++;
            else if (arr[i] == element2) count2++;
            else {
                count1--;
                count2--;
            }
        }
        List<Integer> list = new ArrayList<>();
        count1=0; count2=0;
        for (int i=0;i<arr.length;i++){
            if (element1==arr[i]) count1++;
            if (element2==arr[i]) count2++;
        }
        int mini = Math.floorDiv(n,3);
        if (count1>mini) list.add(element1);
        if (count2>mini) list.add(element2);
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,3,3,2,2,2};
        int n = 8;
        System.out.print(majorityElement_nby3(arr,n));
    }
}
