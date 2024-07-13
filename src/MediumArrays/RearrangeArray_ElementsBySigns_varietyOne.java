package MediumArrays;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArray_ElementsBySigns_varietyOne {
    //brute force approach TC O(n)+O(n/2) SC O(n)
//    public static int[] rearrangeArray_elementsBySigns_varietyOne(int arr[]){
//        List<Integer> positive = new ArrayList<>();
//        List<Integer> negative = new ArrayList<>();
//        for (int i=0;i<arr.length;i++){
//            if (arr[i] > 0){
//                positive.add(arr[i]);
//            }else negative.add(arr[i]);
//        }
//        for (int i=0;i<arr.length/2;i++){
//            arr[2*i] = positive.get(i);
//            arr[2*i+1] = negative.get(i);
//        }
//        return arr;
//    }

    //optimal approach TC O(n) SC O(n)
    public static int[] rearrangeArray_elementsBySigns_varietyOne(int arr[]){
        int newArray[] = new int[arr.length];
        int positiveIndex=0,negativeIndex=1;
        for (int i=0;i<arr.length;i++){
            if (arr[i] > 0){
                newArray[positiveIndex] = arr[i];
                positiveIndex += 2;
            }else{
               newArray[negativeIndex] = arr[i];
               negativeIndex += 2;
            }
        }
        return newArray;
  }
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
       int newArray[] =  rearrangeArray_elementsBySigns_varietyOne(arr);
        for (int element : newArray) System.out.print(element + " ");
    }
}
