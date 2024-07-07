package BasicArrays;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSorted {
    //brute force approach
//    public static Set<Integer> union(int[] arr1,int[] arr2){
//        Set<Integer> union = new HashSet<>();
//        for (int i=0;i<arr1.length;i++){
//            union.add(arr1[i]);
//        }
//        for (int i=0;i<arr2.length;i++){
//            union.add(arr2[i]);
//        }
//        return union;
//    }
    //optimal approach
    public static List<Integer> union(int arr1[], int arr2[]){
        List<Integer> union = new ArrayList<>();
        int size1 = arr1.length,size2 = arr2.length,i=0,j=0;
        while (i<size1 && j<size2){
            if (arr1[i] <= arr2[j]){
                if (union.isEmpty() || !union.contains(arr1[i])){
                    union.add(arr1[i]);
                }
                i++;
            }else {
                if (union.isEmpty() || !union.contains(arr2[j])){
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while (j<size2){
            if (union.isEmpty() || !union.contains(arr2[j])){
                union.add(arr2[j]);
            }
            j++;
        }
        while (i<size1){
            if (union.isEmpty() || !union.contains(arr1[i])){
                union.add(arr1[i]);
            }
            i++;
        }
        return union;
    }
    public static void main(String[] args) {
        int arr1[] = {1,1,2,3,4,5};
        int arr2[] = {2,3,4,4,5,6};
//        Set<Integer> union = union(arr1,arr2);
        List<Integer> union = union(arr1,arr2);
        for (int element : union) System.out.print(element + " ");
    }
}
