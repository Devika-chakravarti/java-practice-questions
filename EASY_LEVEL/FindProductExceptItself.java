/*Problem: Given an integer array nums, return an array answer such that answer[i] is the product of all elements except nums[i].
You must solve it without using division.
Input: nums = [1, 2, 3, 4]
Output: [24, 12, 8, 6]
answer[0] = 2×3×4 = 24
answer[1] = 1×3×4 = 12
answer[2] = 1×2×4 = 8
answer[3] = 1×2×3 = 6*/

import java.util.Arrays;
import java.util.Scanner;

public class FindProductExceptItself{
    
    public int[] productExceptItself(int[] nums){
        int n= nums.length;
        int[] answer = new int[n];

        //PASS 1: FILL answer[i] WITH PRODUCT OF EVERYTHING TO THE LEFT OF i 
        answer[0] = 1;  // NOTHING TO THE LEFT OF INDEX 0
        for(int i=1;i<n;i++){
            answer[i] = answer[i-1]*nums[i-1];
        }

        //PASS 2: MULTIPLY EACH answer[i] WITH THE PRODUCT OF EVERYTHING TO THE RIGHT OF i
        int rightProduct = 1;   // NOTHING TO THE RIGHT OF LAST INDEX
        for(int i=n-1;i>=0;i--){
            answer[i] = answer[i]*rightProduct;
            rightProduct *= nums[i];    // EXPAND RIGHT PRODUCT LEFTWARD
        }

        return answer;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        FindProductExceptItself obj = new FindProductExceptItself();
        System.out.println(Arrays.toString(obj.productExceptItself(nums)));

        sc.close();
    }
}