package HardArrays;

public class MaximumProductSubArray {
    //brute force approach TC O(n^3) SC O(1)
//    public static int maximumProductArray(int arr[]){
//        int max = Integer.MIN_VALUE;
////        for (int i=0;i<arr.length;i++){
////            for (int j=i;j<arr.length;j++){
////                int product = 1;
////                for (int k=i;k<=j;k++){
////                    product = product*arr[k];
////                }
////                max = Math.max(max,product);
////            }
////        }
//
//        //TC O(n^2)
//        for (int i=0;i<arr.length;i++){
//            int product = 1;
//            for (int j=i;j<arr.length;j++){
//                product = product*arr[j];
//                max = Math.max(max,product);
//            }
//        }
//        return max;
//    }

    //optimal approach TC O(n) SC O(1)
    public static int maximumProductArray(int arr[]){
        int prefix = 1,suffix = 1;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
            prefix = prefix*arr[i];
            suffix = suffix*arr[arr.length-i-1];
            max = Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,-2,4};
        System.out.print(maximumProductArray(arr));
    }
}
