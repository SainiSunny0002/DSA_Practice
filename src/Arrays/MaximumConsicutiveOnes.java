package Arrays;

public class MaximumConsicutiveOnes {
    public static int maxConsicutiveOnes(int[] arr){
        int count=0,maxConsicutive=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == 1){
                count++;
                maxConsicutive = Math.max(maxConsicutive,count);
            }else count=0;
//            if (maxConsicutive < count) maxConsicutive = count;
        }
        return maxConsicutive;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0,1,1};
        System.out.print(maxConsicutiveOnes(arr));
    }
}
