/*Sum of digits of a number
input: 1234
output: 10
*/

import java.util.Scanner;

public class DigitSum {
    
    public int digitSum(int n){
        int ans = 0;

        while(n>0){
            int rem = n%10;
            ans += rem;
            n /= 10;
        }

        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        DigitSum obj = new DigitSum();

        System.out.println("Sum of all digits of " + n + " : " + obj.digitSum(n));
    }
}
