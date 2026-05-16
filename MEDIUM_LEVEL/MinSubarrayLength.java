/*Problem: Given an array of positive integers nums and a positive integer target, find the minimum length subarray whose sum is greater than or equal to target. Return 0 if no such subarray exists.
Input: nums = [2,3,1,2,4,3], target = 7
Output: 2 (subarray [4,3] has sum 7, length 2)*/

import java.util.Scanner;

public class MinSubarrayLength{

    public int minSubarryLen(int target, int[] nums){
        int left = 0, windowSum = 0, minLen = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right++){
            //STEP 1: EXPAND - ADD RIGHT ELEMENT
            windowSum += nums[right];

            //STEP 2: SHRINK - WHILE WINDOW IS VALID, TRY TO MINIMIZE
            while(windowSum>=target){
                minLen = Math.min(minLen, right-left+1);
                windowSum -= nums[left];    //REMOVE LEFT ELEMENT
                left++;
            } 
        }
        // IF NEVER UPDATED, NO VALID SUBARRAY EXISTS
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the element " + i + ": ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        MinSubarrayLength obj = new MinSubarrayLength();

        System.out.println("Minimum subarray length: " + obj.minSubarryLen(target, nums));
    }
}