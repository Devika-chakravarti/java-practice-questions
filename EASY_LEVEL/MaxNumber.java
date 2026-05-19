/*Find maximum number in an array
input: [3,7,1,9,4]
output: 9
*/

import java.util.Scanner;

public class MaxNumber {
    
    public int maxNumber(int arr[]){
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        MaxNumber obj = new MaxNumber();
        System.out.print("Maximum number in the give array is : " + obj.maxNumber(arr));

        sc.close();
    }
}
