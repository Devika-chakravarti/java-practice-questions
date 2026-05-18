/* Factorial of a number
input: 5
output: 120
*/

import java.util.Scanner;

public class FactorialOfANumber{

    public int findFactorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        FactorialOfANumber obj = new FactorialOfANumber();

        System.out.println("Factorial of " + n + " : " + obj.findFactorial(n));

        sc.close();
    }
}