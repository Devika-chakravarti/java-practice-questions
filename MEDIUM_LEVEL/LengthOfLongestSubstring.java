/*Problem: Given a string s, find the length of the longest substring without repeating characters.
Input: s = "abcabcbb"
Output: 3 (substring "abc")
Input: s = "bbbbb"
Output: 1 (substring "b")
Input: s = "pwwkew"
Output: 3 (substring "wke")*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LengthOfLongestSubstring {
    
    public int lengthOfLongestSubstring(String s){
        Set<Character> window = new HashSet<>();
        
        int left = 0;
        int maxLen = 0;

        for(int right = 0; right<s.length(); right++){
            char c = s.charAt(right);

            //STEP 2: SHRINK - WHILE DUPLICATE EXISTS IN WINDOW
            while(window.contains(c)){
                window.remove(s.charAt(left));  // REMOVE LEFTMOST CHARACTER 
                left++;
            }

            //STEP 1: EXPAND - ADD RIGHT CHARACTER TO WINDOW
            window.add(c);

            //STEP 3: UPDATE RESULT - WINDOW IS VALID HERE
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.next();

        LengthOfLongestSubstring obj = new LengthOfLongestSubstring();

        System.out.println("Length of longest substring without repeating characters: " + obj.lengthOfLongestSubstring(s));
    }
}
