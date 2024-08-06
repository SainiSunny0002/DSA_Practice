package BinarySearch1DArray;

public class FirstLastOccurance {
    //using lower bound and upper bound TC 2*O(log2n) SC O(1)
//    public static int lowerBound(int arr[],int n,int x){
//        int low = 0,high = n-1;
//        int ans = n;
//        while (low <= high){
//            int mid = (low+high)/2;
//            if (arr[mid] >= x) {
//                ans = mid;
//                high = mid-1;
//            }else {
//                low = mid+1;
//            }
//        }
//        return ans;
//    }
//
//    public static int upperBound(int arr[],int n,int x){
//        int low = 0,high = n-1;
//        int ans = n;
//        while (low <= high){
//            int mid = (low+high)/2;
//            if (arr[mid] > x){
//                ans = mid;
//                high = mid-1;
//            }else {
//                low = mid+1;
//            }
//        }
//        return ans;
//    }
//    public static int[] firstLastOccurance(int arr[],int x){
//        int n = arr.length;
//        int lowerBound = lowerBound(arr,n,x);
//        if (lowerBound == n || arr[lowerBound] != x) return new int[]{-1,-1};
//        return new int[]{lowerBound,upperBound(arr,n,x)-1};
//    }

    //using binary search
    public static int getFirst(int arr[],int n,int x){
        int low = 0,high = n-1;
        int first = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if (arr[mid] == x) {
                first = mid;
                high = mid-1;
            }else if(arr[mid] < x){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return first;
    }
    public static int getLast(int arr[],int n,int x){
        int low = 0,high = n-1;
        int last = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if (arr[mid] == x) {
                last = mid;
                low = mid+1;
            }else if(arr[mid] < x){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return last;
    }
    public static int[] firstLastOccurance(int arr[],int x){
        int n = arr.length;
        int first = getFirst(arr,n,x);
        int last = getLast(arr,n,x);
        return new int[]{first,last};
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,8,8,11,13};
        int x = 8;
        int ans[] = firstLastOccurance(arr,x);
        System.out.print(ans[0] + " " + ans[1]);
    }
}
