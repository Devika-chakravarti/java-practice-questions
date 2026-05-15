/*Problem: Given a string s, determine if it is a valid palindrome, considering only alphanumeric characters and ignoring cases.
Input: s = "A man, a plan, a canal: Panama"
Output: true
Input: s = "race a car"
Output: false*/

import java.util.Scanner;

public class PalindromicString {
    
    public boolean isPalindrome(String s){
        int left = 0, right = s.length()-1;
        
        while(left<right){

            // SKIP NON-ALPHANUMERIC FROM LEFT
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
        
            // SKIP NON-ALPHANUMERIC FROM RIGHT
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
        
            // COMPARE IGNORING CASE
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
        
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        
        PalindromicString obj = new PalindromicString();
        System.out.println(obj.isPalindrome(s));
    }
}
