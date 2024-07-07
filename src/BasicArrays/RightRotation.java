package BasicArrays;

public class RightRotation {
    //right rotation by k position
    //right rotation with new array
//    public static int[] rightRotation(int[] arr,int k){
//        int[] newArr = new int[arr.length];
//        int j = 0;
//        for (int i=arr.length-k;i< arr.length;i++){
//            newArr[j] = arr[i];
//            j++;
//        }
//        for (int i=0;i<=arr.length-k+1;i++){
//            newArr[k] = arr[i];
//            k++;
//        }
//        return newArr;
//    }

    // right rotation with mod
//    public static int[] rightRotation(int[] arr,int k){
//        int size = arr.length;
//        k = k%size;
//        for (int i=0;i<size;i++){
//            if (i<k){
//                System.out.print(arr[size+i-k] + " ");
//            }else System.out.print(arr[i-k] + " ");
//        }
//        System.out.println();
//        return arr;
//    }

    //reversal algorithm
//    public static int[] rightRotation(int[] arr,int k){
//        int size = arr.length;
//        int iStart = 0;
//        arr = reverseArray(arr,size,iStart);
//        arr = reverseArray(arr,size-k-1,iStart);
//        arr = reverseArray(arr,size,iStart+k);
//        return arr;
//    }
//    public static int[] reverseArray(int[] arr,int size,int iStart){
//        for (int i = iStart;i<size/2;i++){
//            swap(arr,i,size);
//            size--;
//        }
//        while (iStart>=size/2){
//            swap(arr,iStart,size);
//            iStart--;
//        }
//        return arr;
//    }
//    public static void swap(int[] arr,int iStart,int size){
//        int temp = arr[iStart];
//        arr[iStart] = arr[size-1];
//        arr[size-1] = temp;
//    }

    //recursive approach
    public static int[] rightRotation(int[] arr,int k){
        int size = arr.length;
        if (k == 0) return arr;
        int temp = arr[size-1];
        for (int i=size-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return rightRotation(arr,k-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int k = 2;
        int rotatedArray[] = rightRotation(arr,k);
        for (int element : rotatedArray){
            System.out.print(element + " ");
        }
    }
}
