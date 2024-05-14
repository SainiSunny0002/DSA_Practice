package Hashing;

import java.util.Scanner;

public class CharacterHashing_UsingArray {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = cin.nextLine();
        //precompute
//        int hash[] = new int[26];//only has lower case and upper case
        int hash[] = new int[256];//if string contains any character
        for (int i=0;i<s.length();i++){
            //if string has only lower case characters and upper case
//            hash[s.charAt(i)-'a']++;
            //if string contains any character
            hash[s.charAt(i)]++;
        }
        System.out.print("Enter number of query : ");
        int query = cin.nextInt();
        System.out.print("Enter character to find count in array : ");
        while (query >= 0){
            char c = cin.next().charAt(0);
            query--;
            //fetch
            //if string contains only lower case char and upper case
//            System.out.print(c+" appear : "+hash[c-'a'] +", ");
            //string contains any char
            System.out.print(c+" appear : "+hash[c] +", ");
        }
    }
}
