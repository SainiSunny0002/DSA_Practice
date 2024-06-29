package BasicJava;

import java.util.ArrayList;
import java.util.Arrays;

public class PickFromBothSide {
    public static int solve(ArrayList<Integer> A, int B) {
        int sum = Integer.MIN_VALUE;
        int first_B_Sum = 0;
        for(int i=0; i<B; i++){
            first_B_Sum = first_B_Sum + A.get(i);
        }
        int index = B;
        int curr_sum;
        while(index>0){
            curr_sum = first_B_Sum - A.get(index-1) + A.get(A.size() - (B - index + 1));
            sum = Math.max(curr_sum, sum);
            first_B_Sum = curr_sum;
            index--;
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, -2, 3 , 1, 2));
        int b = 3;
        System.out.println(solve(list,b));
    }
}
