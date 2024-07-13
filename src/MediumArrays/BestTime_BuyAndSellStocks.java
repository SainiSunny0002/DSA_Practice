package MediumArrays;

public class BestTime_BuyAndSellStocks {
    //TC O(n) SC O(1)
    public static int bestTime_buySellStocks(int arr[]){
        int minimum = arr[0],maxProfit = 0;
        for (int i=1;i<arr.length;i++){
            int cost = arr[i] - minimum;
            maxProfit = Math.max(maxProfit,cost);
            minimum = Math.min(minimum,arr[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.print(bestTime_buySellStocks(arr));
    }
}
