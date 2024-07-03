package Sorting;

public class BubbleSort {
    //with two for loops
//    public static void bubbleSort(int[] arr){
//        boolean swapped;
//        for (int i=0;i< arr.length;){
//            swapped = false;
//            for (int j=0;j<arr.length-i-1;j++){
//                if (arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    swapped = true;
//                }
//            }
//            if (swapped == false) break;
//        }
//    }

    //with do while and for loop
//    public static void bubbleSort(int[] arr){
//        boolean swapped;
//        do {
//            swapped = false;
//            for (int i = 0; i < arr.length-1; i++) {
//                if (arr[i] > arr[i+1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                    swapped = true;
//                }
//            }
//        } while (swapped);
//    }

    //recursive approach
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        recursiveSort(arr,n);
    }

    public static void recursiveSort(int[] arr,int n){
        if (n == 1) return;
        boolean swapped = false;
        for (int i=0;i<n-1;i++){
            if (arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swapped = true;
            }
        }
        if (swapped == false) return;
        recursiveSort(arr,n-1);
    }
    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90};
        bubbleSort(arr);
        for (int element : arr){
            System.out.print(element + " ");
        }
    }
}
