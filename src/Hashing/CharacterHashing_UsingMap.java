package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterHashing_UsingMap {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = cin.nextLine();
        //precompute
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.print("Enter number of query : ");
        int query = cin.nextInt();
        System.out.print("Enter character to find count in map : ");
        while (query >= 0){
            char c = cin.next().charAt(0);
            query--;
            //fetch
            System.out.print(map.getOrDefault(c, 0));
        }
    }
}
