package BasicJava;

import java.util.*;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> al=new ArrayList<>();
        if (matrix == null || matrix.length == 0) return al;
        int rowStart = 0; // upper limit (row start)
        int rowEnd = matrix.length - 1; // lower limit (row end)
        int columnStart = 0; // left limit (column start)
        int columnEnd = matrix[0].length - 1; // right limit (column end)
        while(columnStart<=columnEnd && rowStart<=rowEnd){
            for(int i=columnStart;i<=columnEnd;i++){
                al.add(matrix[rowStart][i]);
            }
            rowStart++;
            for(int i=rowStart;i<=rowEnd;i++){
                al.add(matrix[i][columnEnd]);
            }
            columnEnd--;
            if(rowStart<=rowEnd){
                for(int i=columnEnd;i>=columnStart;i--){
                    al.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }
            if(columnStart<=columnEnd){
                for(int i=rowEnd;i>=rowStart;i--){
                    al.add(matrix[i][columnStart]);
                }
                columnStart++;
            }
        }
        return al;
    }
    public static void main(String[] args) {
        //Outhput: 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10.
        Scanner cin = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        for(int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix.length;j++){
                matrix[i][j] = cin.nextInt();
            }
        }
//                {{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }}
        System.out.println(spiralOrder(matrix));
    }
}