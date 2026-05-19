/*Count vowels in a string
input: education
output: 5
*/

import java.util.Scanner;

public class VowelsCount {
    
    public int countVowel(String s){
        int count = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U'){
                count++;
            }
        }

        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.next();

        VowelsCount obj = new VowelsCount();
        System.out.print("Number of vowels in " + s + " : " + obj.countVowel(s));
    }
}
