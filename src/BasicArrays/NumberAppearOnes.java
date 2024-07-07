package BasicArrays;

public class NumberAppearOnes {
    //brute force approach TC O(n^2) SC O(1)
//    public static int numberAppearOnes(int arr[]){
//        int num=0,count=0;
//        for (int i=0;i<arr.length;i++){ // 4 1 2 1 2
//            num = arr[i];
//            for (int j=0;j<arr.length;j++){
//                if (arr[j] == num) count++;
//            }
//            if (count == 1){
//                num = arr[i];
//                break;
//            }
//        }
//        return num;
//    }

    // better approach TC O(3n) SC O(maximumElement)
//    public static int numberAppearOnes(int arr[]){
//        int maxElement = arr[0],num=0;
//        for (int i=0;i<arr.length;i++){
//            maxElement = Math.max(maxElement,arr[i]);
//        }
//        int hash[] = new int[maxElement+1];
//        for (int i=0;i<arr.length;i++){
//            hash[arr[i]] += 1;
//        }
////        for (int i=0;i<hash.length;i++){ // maximum is greater than hash length
////            if (hash[i] == 1) num = i;
////        }
//        for (int i=0;i<arr.length;i++){ // maximum is less than hash length
//            if (hash[arr[i]] == 1) num = arr[i];
//        }
//        return num;
//    }

    //optimal approach TC O(N*logM) + O(M) SC O(M) as M is size of map
//    public static int numberAppearOnes(int arr[]){
//        Map<Integer,Integer> map = new HashMap<>();
//        int num=0;
//        for (int i=0;i<arr.length;i++){
//            map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
//        }
//        for (Map.Entry<Integer,Integer> ans : map.entrySet()){
//            if (ans.getValue() == 1) num = ans.getKey();
//        }
//        return num;
//    }

    //optimal approach with xor TC O(n) SC O(1)
    public static int numberAppearOnes(int arr[]){
        int xor=0;
        for (int i=0;i<arr.length;i++){
            xor = xor^arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};
        System.out.print(numberAppearOnes(arr));
    }
}
