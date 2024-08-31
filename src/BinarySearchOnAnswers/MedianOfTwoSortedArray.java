package BinarySearchOnAnswers;

public class MedianOfTwoSortedArray {
    //brute force approach TC O(n1+n2) SC O(n1+n2)
//    public static double median(int arr1[], int arr2[]){
//        int n = arr1.length, m =arr2.length;
//        int i = 0, j = 0, index = 0;
//        int arr3[] = new int[n+m];
//        while(i < n && j < m){
//            if (arr1[i] < arr2[j]){
//                arr3[index] = arr1[i++];
//                index++;
//            }else {
//                arr3[index] = arr2[j++];
//                index++;
//            }
//        }
//        while (i < n){
//            arr3[index] = arr1[i++];
//            index++;
//        }
//        while (j < m){
//            arr3[index] = arr2[j++];
//            index++;
//        }
//        if (arr3.length % 2 == 1) return arr3[arr3.length/2];
//        else return arr3[arr3.length/2] + arr3[arr3.length/2 + 1];
//    }

    //better approach TC O(n1+n2) SC O(1)
//    public static double median(int arr1[], int arr2[]){
//        // Size of two given arrays
//        int n1 = arr1.length;
//        int n2 = arr2.length;
//
//        int n = n1 + n2; //total size
//        //required indices:
//        int ind2 = n / 2;
//        int ind1 = ind2 - 1;
//        int cnt = 0;
//        int ind1el = -1, ind2el = -1;
//
//        //apply the merge step:
//        int i = 0, j = 0;
//        while (i < n1 && j < n2) {
//            if (arr1[i] < arr2[j]) {
//                if (cnt == ind1) ind1el = arr1[i];
//                if (cnt == ind2) ind2el = arr1[i];
//                cnt++;
//                i++;
//            } else {
//                if (cnt == ind1) ind1el = arr2[j];
//                if (cnt == ind2) ind2el = arr2[j];
//                cnt++;
//                j++;
//            }
//        }
//
//        //copy the left-out elements:
//        while (i < n1) {
//            if (cnt == ind1) ind1el = arr1[i];
//            if (cnt == ind2) ind2el = arr1[i];
//            cnt++;
//            i++;
//        }
//        while (j < n2) {
//            if (cnt == ind1) ind1el = arr2[j];
//            if (cnt == ind2) ind2el = arr2[j];
//            cnt++;
//            j++;
//        }
//
//        //Find the median:
//        if (n % 2 == 1) {
//            return (double)ind2el;
//        }
//
//        return (double)((double)(ind1el + ind2el)) / 2.0;
//    }

    //optimal approach TC O(log(min(n1,n2))) SC O(1)
    public static double median(int arr1[], int arr2[]){
        int n1 = arr1.length, n2 = arr2.length;
        //if n1 is bigger swap the arrays:
        if (n1 > n2) return median(arr2, arr1);

        int n = n1 + n2; //total length
        int left = (n1 + n2 + 1) / 2; //length of left half
        //apply binary search:
        int low = 0, high = n1;
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;
            //calculate l1, l2, r1 and r2;
            int l1 = (mid1 > 0) ? arr1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? arr2[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? arr1[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? arr2[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);
                else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr1[] = {2,3,4};
        int arr2[] = {1,3};
        System.out.print(median(arr1,arr2));
    }
}
