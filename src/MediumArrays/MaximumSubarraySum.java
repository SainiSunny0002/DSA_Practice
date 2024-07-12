package MediumArrays;

public class MaximumSubarraySum {
    //brute force approach TC O(n^3) SC O(1)
//    public static int maximumSubarraySum(int arr[]){
//        int maximumSum=0;
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr.length;j++){
//                int sum=0;
//                for (int k=i;k<=j;k++){
//                    sum+=arr[k];
//                }
//                maximumSum = Math.max(sum,maximumSum);
//            }
//        }
//        return maximumSum;
//    }

    //better approach TC O(n^2) SC O(1)
//    public static int maximumSubarraySum(int arr[]){
//        int maximumSum=0;
//        for(int i=0;i<arr.length;i++){
//            int sum=0;
//            for (int j=i;j<arr.length;j++){
//                sum += arr[j];
//                maximumSum = Math.max(sum,maximumSum);
//            }
//        }
//        return maximumSum;
//    }

    //optimal approach Kadane's algorithm TC O(n) SC O(1)
    public static int maximumSubarraySum(int arr[]){
        int maximumSum=arr[0],sum=0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
            maximumSum = Math.max(sum,maximumSum);
            if (sum<0) sum=0;
        }
        return maximumSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.print(maximumSubarraySum(arr));
    }
}
