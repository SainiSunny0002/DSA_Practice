package Sorting;

public class SelectionSort {
    public static int select(int[] arr, int i){
        int min = i;
        for (int j=i;j<=arr.length-1;j++){
            if (arr[j] < arr[min]) min = j;
        }
        return min;
    }
    public static void selectionSort(int[] arr,int n){
        for (int i=0;i<=n-2;i++){
            int min = select(arr,i);
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
//        for (int i=0;i<=n-2;i++){
//            int min = i;
//            for (int j=i;j<=n-1;j++){
//                if (arr[j] < arr[min]) min = j;
//            }
//            int temp = arr[min];
//            arr[min] = arr[i];
//            arr[i] = temp;
//        }
        selectionSort(arr,n);
        for (int element : arr) System.out.print(element + " ");
    }
}
