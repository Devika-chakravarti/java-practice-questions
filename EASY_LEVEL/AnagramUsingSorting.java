/*Anagram Check Using Sorting*/

import java.util.Arrays;
import java.util.Scanner;

public class AnagramUsingSorting {
    
    // Alternative to frequency array — sort both strings and compare
    // Clean and simple — but O(n log n) vs O(n) for frequency array
    public boolean isAnagram(String s, String t){
        if(s.length()!=t.length())  return false;
        char[] sc = s.toCharArray();
        char[] st = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(st);
        return Arrays.equals(sc, st);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        AnagramUsingSorting obj = new AnagramUsingSorting();

        System.out.println(obj.isAnagram(s, t));

        sc.close();
    }
}
