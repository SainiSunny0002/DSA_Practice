package BinarySearchOnAnswers;

public class KokoEatingBananas {
    // return the min integer k such that koko can eat all bananas within h hours, whereas k = bananas/h
    // TC O(log2(max element of array)*O(n)) SC O(1)
    public static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    public static int calculateTotalHours(int arr[],int mid){
        int totalHours = 0;
        int n = arr.length;
        for (int i=0;i<n;i++){
            totalHours += Math.ceil((double) arr[i]/(double) mid);
        }
        return totalHours;
    }
    public static int kokoEatBananas(int arr[],int h){
        int low = 0,high = findMax(arr);
        while (low <= high){
            int mid = (low+high)/2;
            int totalHours = calculateTotalHours(arr,mid);
            if (totalHours <= h) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[] = {3,6,7,11};
        int h = 8;
        System.out.print(kokoEatBananas(arr,h));
    }
}
