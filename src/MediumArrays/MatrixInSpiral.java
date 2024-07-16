package MediumArrays;

import java.util.ArrayList;
import java.util.List;

public class MatrixInSpiral {
    //TC O(n*m) SC O(n*m)
    public static List<Integer> spiralMatrix(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int left=0,right=m-1,top=0,bottom=n-1;
        List<Integer> list = new ArrayList<>();
        while(top<=bottom && left<=right) {
            for (int i = left; i <= right; i++) {
               list.add(arr[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(arr[i][right]);
            }
            right--;
            if(top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},
                       {10,11,16,20},
                       {23,30,34,60}};
       List<Integer> ans =  spiralMatrix(arr);
       for (int element : ans) System.out.print(element + " ");
    }
}
