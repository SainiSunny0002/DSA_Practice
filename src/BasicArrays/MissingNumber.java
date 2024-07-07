package BasicArrays;

public class MissingNumber {
    //brute force approach TC O(n^2) SC O(1)
//    public static int missingNumber(int arr[],int n){
//        int notPresent = 0;
//        for (int i=1;i<=n;i++){
//            int flag = 0;
//            for (int j=0;j< n-1;j++){
//                if (arr[j] == i) {
//                    flag = 1;
//                    break;
//                }
//            }
//            if (flag == 0) notPresent=i;
//        }
//        return notPresent;
//    }

    //better approach using hashing TC O(n)+O(n) SC O(n)
//    public static int missingNumber(int[] arr,int n){
//        int[] hash = new int[n+1];
//        int notPresent = 0;
//        for (int i=0;i<n-1;i++){
//            hash[arr[i]] +=1;
//        }
//        for (int j=1;j<hash.length;j++){
//            if (hash[j] ==0){
//                notPresent = j;
//            }
//        }
//        return notPresent;
//    }

    //optimal approach using sum TC O(n) SC O(1)
//    public static int missingNumber(int arr[], int n){
//        int sum = n*(n+1)/2,arrSum = 0;
//        for (int i=0;i<n-1;i++){
//            arrSum += arr[i];
//        }
//        return sum-arrSum;
//    }

    //Most optimal solution TC O(n) SC O(1)
    public static int missingNumber(int arr[], int n){
        int xor1 = 0,xor2 = 0;
//        for (int i=1;i<=n;i++){
//            xor1 = xor1^i;
//        }
        for (int i=0;i<n-1;i++){
            xor2 = xor2^arr[i];
            xor1 = xor1^(i+1);
        }
        xor1 = xor1^n;
        return xor1^xor2;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        int n = 5;
        int number = missingNumber(arr,n);
        System.out.print(number);
    }
}
