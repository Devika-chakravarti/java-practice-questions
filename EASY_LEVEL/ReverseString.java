/*Reverse a string
input: devika
output: akived
*/

import java.util.Scanner;

public class ReverseString {
    
    public String reverseString(String s){
        StringBuilder reversedString = new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){
            reversedString.append(s.charAt(i));
        }
        
        return reversedString.toString();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        ReverseString obj = new ReverseString();

        System.out.println(obj.reverseString(s));
    }
}
