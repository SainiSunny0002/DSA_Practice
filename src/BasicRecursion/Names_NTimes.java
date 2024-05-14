package BasicRecursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Names_NTimes {
    public static List<String> printNtimes(int n){
        List<String> list = new ArrayList<>();
        recursiveCall(n,list);
        return list;
    }

    private static void recursiveCall(int n, List<String> list) {
        if (n == 0) return;
        recursiveCall(n-1,list);
        list.add("sunny");
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        List<String> strings = printNtimes(n);
        for (String str : strings){
            System.out.print(str + " ");
        }
    }
}
