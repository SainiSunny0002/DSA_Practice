package Arrays;

public class LargestELement {
    //brute force approach is when we sort an array an find the largest
//    public static void sort(int[] arr,int n){
//        boolean swapped;
//        do{
//            swapped = false;
//            for (int i=0;i<n;i++){
//                if (arr[i] > arr[i+1]){
//                    int temp = arr[i+1];
//                    arr[i+1] = arr[i];
//                    arr[i] = temp;
//                    swapped = true;
//                }
//            }
//        }while (swapped);
//    }
    public static void main(String[] args) {
        int arr[] = {1,8,7,56,90};
        int n = arr.length-1;
//        sort(arr,n);
//        System.out.print("Largest : "+arr[n]);

        //optimal approach
        int largest = arr[0];
        for (int i=0;i<=n;i++){
            if (largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.print(largest);
    }
}
