package BinarySearchOnAnswers;

public class LeastCapacity_ShipPackages_Ddays {
    //brute force approach TC O((sum-max)+1 * O(n)) SC O(1)
//    public static int leastCapacityShipPackages(int weights[], int days){
//        int max = Integer.MIN_VALUE, sum = 0;
//        for (int i=0;i<weights.length;i++){
//            sum += weights[i];
//            max = Math.max(max,weights[i]);
//        }
//        for (int capacity = max; capacity <= sum; capacity++){
//            if (findDay(weights,capacity) <= days){
//                return capacity;
//            }
//        }
//        return -1;
//    }
    public static int findDay(int weights[], int capacity){
        int days = 1, load = 0;
        for (int i=0;i<weights.length;i++){
            if (load + weights[i] > capacity){
                days += 1;
                load = weights[i];
            }else {
                load += weights[i];
            }
        }
        return days;
    }

    //optimal approach O((log2(sum-max)+1)*O(n)) SC O(1)
    public static int leastCapacityShipPackages(int weights[], int days){
        int max = Integer.MIN_VALUE, n = weights.length, sum = 0;
        for (int i=0;i<n;i++){
            sum += weights[i];
            max = Math.max(max,weights[i]);
        }
        int low = max, high = sum;
        while (low <= high){
            int mid = (low+high)/2;
            int noOfDays = findDay(weights,mid);
            if (noOfDays <= days) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        int weights[] = {5,4,5,2,3,4,5,6};
        int days = 5;
        System.out.print(leastCapacityShipPackages(weights,days));
    }
}
