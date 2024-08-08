package BinarySearchOnAnswers;

public class NthRootOfGivenInteger {
    // TC O(log2n)*log2n SC O(1)
    public static int nthRoot(int num,int n){
        int low = 1,high = num;
        while (low <= high){
            int mid = (low+high)/2;
            if (func(mid,n,num) == 1) return mid;
            else if (func(mid,n,num) == 0) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    public static int func(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }
    public static void main(String[] args) {
        int num = 27;
        int n = 3;
        System.out.print(nthRoot(num,n));
    }
}
