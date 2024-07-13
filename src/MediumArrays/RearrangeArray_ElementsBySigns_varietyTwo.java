package MediumArrays;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArray_ElementsBySigns_varietyTwo {
    // TC O(n)+O(n) SC O(n)
    public static int[] rearrangeArray_elementsBySigns_varietyTwo(int arr[]){
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0) positive.add(arr[i]);
            else negative.add(arr[i]);
        }
        if (positive.size() > negative.size()){
            for (int i=0;i<negative.size();i++){
                arr[2*i] = positive.get(i);
                arr[2*i+1] = negative.get(i);
            }
            int index = 2*negative.size();
            for (int i=negative.size();i<positive.size();i++){
                arr[index] = positive.get(i);
                index++;
            }
        }else {
            for (int i=0;i<positive.size();i++){
                arr[2*i] = positive.get(i);
                arr[2*i+1] = negative.get(i);
            }
            int index = 2*positive.size();
            for (int i=positive.size();i<negative.size();i++){
                arr[index] = negative.get(i);
                index++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,-4,-5,3,6};
        int newArray[] = rearrangeArray_elementsBySigns_varietyTwo(arr);
        for (int element : newArray) System.out.print(element + " ");
    }
}