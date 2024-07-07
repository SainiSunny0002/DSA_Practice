package BasicArrays;

public class CheckArraySorted {
    public static boolean checkArraySorted(int arr[]){
//        boolean flag = false;
//        for (int i=0;i<arr.length-1;i++){
//            if (arr[i] <= arr[i+1]) flag = true;
//            else {
//                flag = false;
//                break;
//            }
//        }
//        return flag;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] <= arr[i+1]);
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4};
        System.out.print(checkArraySorted(arr));
    }
}
