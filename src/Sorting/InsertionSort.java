package Sorting;

public class InsertionSort {

//    public static void insert(int arr[],int i)
//    {
//        int j = i;
//        while(j>0 && arr[j-1] > arr[j]){
//            int temp = arr[j-1];
//            arr[j-1] = arr[j];
//            arr[j] = temp;
//            j--;
//        }
//    }
//    public static void insertionSort(int arr[], int n)
//    {
//        //code here
//        for(int i=0;i<=n-1;i++){
//            insert(arr,i);
//        }
//    }

    //recursive approach
    public static void insertionSort(int[] arr,int n){
        int i=0;
        recursiveSort(arr,n,i);
    }
    public static void recursiveSort(int[] arr,int n,int i){
        if (n == i) return;
        int j = i;
        while (j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        recursiveSort(arr,n,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {14,9,15,12,6,8,13};
//        for (int i=0;i<=arr.length-1;i++){
//            int j=i;
//            while (j>0 && arr[j-1] > arr[j]){
//                int temp = arr[j-1];
//                arr[j-1] = arr[j];
//                arr[j] = temp;
//                j--;
//            }
//        }
        insertionSort(arr,arr.length);
        for (int element : arr) System.out.print(element + " ");
    }
}
