package HardArrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    // 1st problem Given row and column number, find the element at that place
    //TC O(c) SC O(1)
    public static int pascalTriangle1st(int r, int c){
        int element = nCr(r,c);
        return element;
    }
    public static int nCr(int n, int r){
        int res = 1;
        for (int i=0;i<r;i++){
            res = res*(n-i);
            res = res/(i+1);
        }
        return res;
    }
    //2nd problem print the nth row
    //brute force approach TC O(n*r) SC O(1)
//    public static void  pascalTriangle2nd(int n){
//        for (int c=1;c<=n;c++){
//            System.out.print(nCr(n-1,c-1));
//        }
//        System.out.println();
//    }

    //optimal appraoch TC O(n) SC O(1)
    public static void pascalTriangle2nd(int n){
        int ans = 1;
        System.out.print("2nd problem : "+ans + " ");
        for (int i=1;i<n;i++){
            ans = ans*(n-i);
            ans = ans/i;
            System.out.print(ans + " ");
        }
    }

    //3rd problem print entire pascal triangle
    //brute force approach TC O(n^3) SC O(1)
//    public static void pascalTriangle3rd(int n){
//        List<List<Integer>> ans = new ArrayList<>();
//        for (int row=1;row<n;row++){
//            List<Integer> tempList = new ArrayList<>();
//            for (int col=1;col<=row;col++){
//                tempList.add(nCr(row-1,col-1));
//            }
//            ans.add(tempList);
//        }
//        System.out.print(ans);
//    }

    //optimal approach O(n^2) SC O(1)
    public static void pascalTriangle3rd(int n){
        List<List<Integer>> ans = new ArrayList<>();
        for (int row=1;row<n;row++){
            ans.add(generateRow(row));
        }
        System.out.print(ans);
    }
    public static List<Integer> generateRow(int row){
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for (int col=1;col<row;col++){
            ans = ans*(row-col);
            ans = ans/col;
            ansRow.add(ans);
        }
        return ansRow;
    }

    public static void main(String[] args) {
        int r = 5;
        int c = 3;
        int element = pascalTriangle1st(r,c);
        System.out.print("1st problem : "+element);
        System.out.println();
        pascalTriangle2nd(r);
        System.out.println();
        pascalTriangle3rd(r);
    }
}
