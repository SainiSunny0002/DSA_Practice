package MediumArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    //brute force approach ~O(n^2) SC O(n)
//    public static List<Integer> leaderInArray(int arr[]){
//        List<Integer> list = new ArrayList<>();
//        for (int i=0;i<arr.length;i++){
//            boolean leader = true;
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[i] < arr[j]){
//                    leader = false;
//                    break;
//                }
//            }
//            if (leader) list.add(arr[i]);
//        }
//        return list;
//    }

    //optimal approach TC O(n)+O(nlogn) SC O(n)
    public static List<Integer> leaderInArray(int arr[]){
        List<Integer> list = new ArrayList<>();
        int maximum = 0;
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i] > maximum) list.add(arr[i]);
            maximum = Math.max(arr[i],maximum);
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {10,22,12,3,0,6};
        List<Integer> list = leaderInArray(arr);
        System.out.print(list);
    }
}
