package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
//    public static int removeDuplicates(int arr[]){
//        List<Integer> list = new ArrayList<>();
//        for (int i=0;i< arr.length;i++){
//            if (list.isEmpty()){
//                list.add(arr[i]);
//            } else if (!list.contains(arr[i])) {
//                list.add(arr[i]);
//            }
//        }
//        return list.size();
//    }

    //brute force approach with set Time complaxity = o(NlogN+N) space complaxity = O(N)
//    public static int removeDuplicates(int arr[]){
//        Set<Integer> set = new HashSet<>();
//        for (int i=0;i<arr.length;i++){
//            set.add(arr[i]);
//        }
//        int index = 0;
//        for (int element : set) {
//            arr[index] = element;
//            index++;
//        }
//        return index;
//    }

    //optimal solution with two pointer
    public static int removeDuplicates(int[] arr){
        int i=0;
        for (int j=1;j<arr.length;j++){
            if (arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        System.out.print(removeDuplicates(arr));
    }
}
