package BasicArrays;

public class LeftRotation {
    //left rotation by d position
    //left rotation with new array
//    public static int[] leftRotation(int[] arr,int d){
//        int size = arr.length;
//        int[] newArr = new int[size];
//        for (int i=d-1;i>=0;i--){
//            size--;
//            newArr[size] = arr[i];
//        }
//        for (int i=0;i<size;i++){
//            newArr[i] = arr[d];
//            d++;
//        }
//        return newArr;
//    }

    //left rotation with rotate one by one
//    public static int[] leftRotation(int[] arr,int d){
//        int i=0;
//        while (i<d){
//            int temp = arr[0];
//            for (int j=0;j< arr.length-1;j++) {
//                arr[j] = arr[j + 1];
//            }
//            arr[arr.length-1] = temp;
//            i++;
//        }
//        return arr;
//    }

    //left rotation with juggling algorithm
//    public static int[] leftRotation(int[] arr,int d){
//        int n = arr.length;
//        d = d%n;
//        int i,j,k,temp;
//        int g_c_d = gcd(d,n);
//        for (i=0;i<g_c_d;i++){
//            temp = arr[i];
//            j = i;
//            while (true){
//                k = j+d;
//                if (k>=n) k=k-n;
//                if (k == i) break;
//                arr[j] = arr[k];
//                j=k;
//            }
//            arr[j] = temp;
//        }
//        return arr;
//    }
//    public static int gcd(int d, int n){
//        if (n == 0) return d;
//        else return gcd(n,d%n);
//    }

    //Reversal algorithm
    public static int[] leftRotation(int[] arr,int d){
        int size = arr.length;
        // Reverse the first d elements
        arr = reverseArray(arr, 0, d - 1);
        // Reverse the remaining elements
        arr = reverseArray(arr, d, size - 1);
        // Reverse the whole array
        arr = reverseArray(arr, 0, size - 1);
        return arr;
    }
    public static int[] reverseArray(int[] arr,int start,int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 4;
        int[] rotatedArray = leftRotation(arr,d);
        for (int element : rotatedArray){
            System.out.print(element + " ");
        }
    }
}
