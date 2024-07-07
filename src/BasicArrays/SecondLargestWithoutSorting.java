package BasicArrays;

public class SecondLargestWithoutSorting {
    //https://www.naukri.com/code360/problems/ninja-and-the-second-order-elements_6581960?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

    //brute force approach
//    public static void sort(int[] arr){
//        boolean swapped;
//        do{
//            swapped = false;
//            for (int i=0;i<arr.length-1;i++){
//                if (arr[i] > arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                    swapped = true;
//                }
//            }
//        }while (swapped);
//        if (swapped == true) return;
//    }

    //better approach
//    public static int secondLargets(int arr[]){
//        int largest = arr[0];
//        int secondLargest = -1;
//        for (int i=0;i< arr.length;i++){
//            if (arr[i] > largest){
//                largest = arr[i];
//            }
//        }
//        for (int i=0;i< arr.length;i++){
//            if (arr[i] > secondLargest && arr[i] != largest){
//                secondLargest = arr[i];
//            }
//        }
//        return secondLargest;
//    }

    //optimal solution
    public static int secondLargets(int arr[]){
        int largest = arr[0],secondLargest = -1;
        for (int i=1;i<arr.length;i++){
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] <largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,7,5};
//        sort(arr);
//        int largest = arr[arr.length-1];
//        int sLargest = -1;
//        for (int i=arr.length-2;i>=0;i--){
//            if (largest != arr[i]){
//                sLargest = arr[i];
//                break;
//            }
//        }
//        System.out.print(largest + " " + sLargest);
        int secondLargest = secondLargets(arr);
        System.out.print(secondLargest);
    }
}
