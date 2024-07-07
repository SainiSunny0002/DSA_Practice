package BasicArrays;

public class LinearSearch {
    public static int linearSearch(int[] arr,int key){
        int index = -1;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == key){
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {6,7,8,4,1};
        int key = 4;
        int index = linearSearch(arr,key);
        System.out.print(index);
    }
}
