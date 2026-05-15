/*Problem: Given a string, find the first non-repeating character and return its index. If none exists, return -1.
Input: s = "loveleetcode" → Output: 2 (character 'v')*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstUniqueCharacter{

    public int firstUniqChar(String s){

        // PASS 1: BUILD FREQUENCY MAP
        Map<Character,Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c,freq.getOrDefault(c, 0)+1);
        }

        // PASS 2: FIND FIRST CHARACTER WITH FREQUENCY 1
        for(int i=0;i<s.length();i++){
            if(freq.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        FirstUniqueCharacter obj = new FirstUniqueCharacter();
        System.out.println(obj.firstUniqChar(s));
        
        sc.close();
    }
}