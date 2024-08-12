package BinarySearchOnAnswers;

public class MinDaysMake_MBouquets {
    // TC O(log(max(arr[])-min(arr[])+1) * N) SC O(1)
    public static int roseGarden(int arr[],int m,int k){
        int value = m*k;
        int n = arr.length;
        if (value > n) return -1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        int low = min, high = max;
        while (low <= high){
            int mid = (low+high)/2;
            if (possible(arr,mid,m,k)){
                high = mid-1;
            }else low = mid+1;
        }
        return low;
    }
    public static boolean possible(int arr[],int day,int m,int k){
        int n = arr.length;
        int count = 0;
        int noOfBouquets = 0;
        for (int i=0;i<n;i++){
            if (arr[i] <= day) count++;
            else {
                noOfBouquets += (count/k);
                count = 0;
            }
        }
        noOfBouquets += (count/k);
        return noOfBouquets >= m;
    }
    public static void main(String[] args) {
        int arr[] = {7,7,7,7,13,12,11,7};
        int m = 2; //No of bouquets
        int k = 3; //adjacent flowers required
        System.out.print(roseGarden(arr,m,k));
    }
}
