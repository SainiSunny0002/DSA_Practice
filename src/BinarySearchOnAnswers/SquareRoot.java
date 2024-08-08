package BinarySearchOnAnswers;

public class SquareRoot {
    // TC O(log2n) SC O(1)
    public static int squareRoot(int num){
        int low = 1,high = num;
        int ans = 1;
        while (low <= high){
            int mid = (low+high)/2;
            if((mid*mid) <= num){
                ans = mid;
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int num = 28;
        System.out.print(squareRoot(num));
    }
}
