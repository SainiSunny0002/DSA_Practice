package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberHashing_UsingMap {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = cin.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter values of array : ");
        for (int i=0;i<n;i++){
            arr[i] = cin.nextInt();
        }
        //precompute
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.print("Enter value of query : ");
        int query = cin.nextInt();
        System.out.print("Enter numbers to find count in array : ");
        while (query >= 0){
            int number = cin.nextInt();
            query--;
            //fetch method
            System.out.println(map.getOrDefault(number, 0));
        }
    }
}
