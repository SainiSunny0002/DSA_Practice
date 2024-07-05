package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MovingZerosToEnd {
    //brute force approach
//    public static void movingZeroToEnd(int arr[]){
//        List<Integer> list = new ArrayList<>();
//        for (int i=0;i<arr.length;i++){
//            if (arr[i] != 0) list.add(arr[i]);
//        }
//        for (int i=0;i<list.size();i++){
//            arr[i] = list.get(i);
//        }
//        for (int i=list.size();i<arr.length;i++){
//            arr[i] = 0;
//        }
//    }

    //optimal approach
    public static void movingZeroToEnd(int[] arr){
        int j=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == 0) {
                j=i;
                break;
            }
        }
        for (int i=j+1;i<arr.length;i++){
            if (arr[i] != 0 && j>0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,2,0,0,4,5,1};
        movingZeroToEnd(arr);
        for(int element : arr) System.out.print(element + " ");
    }
}
