package MediumArrays;

import java.util.Arrays;

public class RotateMatrixBy90 {
    //brute force approach TC O(n^2) SC O(n^2)
//    public static int[][] rotateMatrixBy90(int arr[][]){
//        int n = arr.length;
//        int matrix[][] = new int[n][n];
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                matrix[j][n-1-i] = arr[i][j];
//            }
//        }
//        return matrix;
//    }

    //optimal approach TC O(n/2*n/2)+O(n*n/2) SC O(1)
    public static int[][] rotateMatrixBy90(int arr[][]){
        //transpose the matrix (row becomes column and vice versa)
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //reverse every row
        for (int i=0;i<arr.length;i++){
            for (int j = 0; j < arr.length / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        int matrix[][] = rotateMatrixBy90(arr);
        System.out.print(Arrays.deepToString(matrix));
    }
}
