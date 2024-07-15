package MediumArrays;

import java.util.Arrays;

public class SetMatrixZeroes {
    // brute force approach TC O(n*m)*O(n+m)+O(n*m) SC O(1)
//    public static void markRow(int arr[][] ,int i){
//        for (int j=0;j<arr.length;j++){
//            if (arr[i][j] !=0){
//                arr[i][j] = -1;
//            }
//        }
//    }
//    public static void markColumn(int arr[][] ,int j){
//        for (int i=0;i<arr.length;i++){
//            if (arr[i][j] !=0){
//                arr[i][j] = -1;
//            }
//        }
//    }
//    public static int[][] setMatrixZeroes(int arr[][]){
//       for (int i=0;i<arr.length;i++){
//           for (int j=0;j<arr.length;j++){
//               if (arr[i][j] == 0){
//                   markRow(arr,i);
//                   markColumn(arr,j);
//               }
//           }
//       }
//       for (int i=0;i<arr.length;i++){
//           for (int j=0;j<arr.length;j++){
//               if (arr[i][j] == -1){
//                   arr[i][j] = 0;
//               }
//           }
//       }
//       return arr;
//    }

    //better approach TC O(n*m)+O(n*m) SC O(n)+O(m)
//    public static int[][] setMatrixZeroes(int[][] arr){
//        int[] row = new int[arr.length];
//        int[] column = new int[arr.length];
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr.length;j++){
//                if (arr[i][j] == 0){
//                    row[i] = 1;
//                    column[j] = 1;
//                }
//            }
//        }
//        for (int i=0;i<row.length;i++){
//            for (int j=0;j<column.length;j++){
//                if (row[i] == 1 || column[j] == 1){
//                    arr[i][j] = 0;
//                }
//            }
//        }
//        return arr;
//    }

    //optimal approach TC O(2*n*m) SC O(1)
    public static int[][] setMatrixZeroes(int arr[][]){
        int col0 = 1;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i][j] == 0){
                    arr[i][0] = 0;
                    if (j != 0) arr[0][j] = 0;
                    else col0=0;
                }
            }
        }
        for (int i=1;i<arr.length;i++){
            for (int j=1;j<arr.length;j++){
                if (arr[i][j] != 0){
                    if (arr[i][0] == 0 || arr[0][j] == 0){
                        arr[i][j] = 0;
                    }
                }
            }
        }
        if (arr[0][0] == 0){
            for (int j=0;j<arr.length;j++) arr[0][j] = 0;
        }
        if (col0 == 0){
            for (int i=0;i<arr.length;i++) arr[i][0] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,1,1,1},
                       {1,0,0,1},
                       {1,1,0,1},
                       {1,1,1,1}};
        setMatrixZeroes(arr);
        System.out.print(Arrays.deepToString(arr));
    }
}
