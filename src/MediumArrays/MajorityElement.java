package MediumArrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    //brute force approach TC O(n^2) SC O(1)
//    public static int majorityElement(int arr[]){
//        for (int i=0;i<arr.length;i++){
//            int counter = 0;
//            for (int j=0;j<arr.length;j++){
//                if (arr[i] == arr[j]) counter++;
//            }
//            if (counter > arr.length/2) return arr[i];
//        }
//        return -1;
//    }

    //better approach using hashing TC O(nlogn)+O(n) SC O(n)
//    public static int majorityElement(int arr[]){
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i=0;i< arr.length;i++){
//            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
//        }
//        for (Map.Entry<Integer,Integer> key : map.entrySet()){
//            if (key.getValue() > arr.length/2) return key.getKey();
//        }
//        return -1;
//    }

    //optimal solution using moore's voting algorithm TC O(n) SC O(1)
    public static int majorityElement(int arr[]){
        int count = 0,element = 0;
        for (int i=0;i<arr.length;i++){
            if (count == 0){
                count = 1;
                element = arr[i];
            }
            else if (arr[i] == element){
                count++;
            }else {
                count--;
            }
        }
        return element;
    }
    public static void main(String[] args) {
        int arr[] = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.print(majorityElement(arr));
    }
}
