/*Problem: Given two strings s and t, check if t is an anagram of s.
Input: s = "anagram", t = "nagaram"
Output: true
Input: s = "rat", t = "car"
Output: false*/

import java.util.Scanner;

public class AnagramString {
    
    public boolean isAnagram(String s, String t){

        //FIRST CHECK: LENGTHS MUST MATCH
        if(s.length()!=t.length())  return false;

        int[] freq = new int[26];

        // INCREMENT FOR s, DECREMENT FOR t
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        // IF ANY COUNT IS NON-ZERO, NOT AN ANAGRAM
        for(int count : freq){
            if(count != 0)  return false;
        }

        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        AnagramString obj = new AnagramString();
        System.out.println(obj.isAnagram(s, t));

        sc.close();
    }
}
