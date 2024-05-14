package Hashing;

import java.util.Scanner;

public class NumberHashing_UsingArray {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = cin.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter values of array : ");
        for (int i=0;i<n;i++){
            arr[i] = cin.nextInt();
        }

        //precompute
        int hash[] = new int[13];
        for (int i=0;i<n;i++){
            hash[arr[i]] += 1;
        }
        System.out.print("Enter value of query : ");
        int query = cin.nextInt();
        System.out.print("Enter numbers to find count in array : ");
        while (query >= 0){
            int number = cin.nextInt();
            query--;
            //fetch method
            System.out.print("Number appear "+number +" : "+hash[number]+", ");
        }
    }
}
