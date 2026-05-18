/*Fibonacci series upto N terms
input: 7
output: 0 1 1 2 3 5 8
*/

import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms upto which you want to print Fibonacci series ?");
        int N = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Here is your Fibonacci series :");
        if(N>=1){
            System.out.print(a);
        }

        if(N>=2){
            System.out.print(" " + b);
        }

        for(int i=3;i<=N;i++){
            int c = a+b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

        sc.close();
    }
}