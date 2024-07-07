package BasicArrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSorted {
    //brute force approach
//    public static List<Integer> intersection(int[] arr1, int[] arr2){
//        int[] visited = new int[arr2.length];
//        List<Integer> intersection = new ArrayList<>();
//        for (int i=0;i< arr1.length;i++){
//            for (int j=0;j< arr2.length;j++){
//                if (arr1[i] == arr2[j] && visited[j] == 0){
//                    intersection.add(arr1[i]);
//                    visited[j] = 1;
//                    break;
//                }
//                if (arr2[j] > arr1[i]) break;
//            }
//        }
//        return intersection;
//    }

    //optimal approah
    public static List<Integer> intersection(int arr1[],int arr2[]){
        int i=0,j=0;
        List<Integer> intersection = new ArrayList<>();
        while (i<arr1.length && j<arr2.length){
            if (arr1[i] < arr2[j]) i++;
            else if(arr2[j] < arr1[i]) j++;
            else{
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        return intersection;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,2,3,3,4,5,6};
        int arr2[] = {2,3,3,5,6,6,7};
        List<Integer> intersection = intersection(arr1,arr2);
        for (int element : intersection) System.out.print(element + " ");
    }
}
