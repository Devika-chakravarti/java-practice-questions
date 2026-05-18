/*Check for the prime number
input: 17
output: true
*/

import java.util.Scanner;

public class CheckPrimeNumber {
    
    public boolean checkForPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check whether its a prime number or not: ");
        int n = sc.nextInt();

        CheckPrimeNumber obj = new CheckPrimeNumber();

        System.out.println(obj.checkForPrime(n));

        sc.close();
    }
}
