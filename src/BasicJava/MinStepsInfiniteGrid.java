package BasicJava;

import java.util.ArrayList;
import java.util.Arrays;

public class MinStepsInfiniteGrid {
    public static int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int dist= 0;
        for(int i = 1; i<A.size(); i++){
            int a = Math.abs(A.get(i) - A.get(i-1));
            int b = Math.abs(B.get(i) - B.get(i-1));
            dist += Math.max(a,b);
        }
        return dist;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(0,1,1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(0,1,2));
        System.out.println(coverPoints(list1,list2));
    }
}
