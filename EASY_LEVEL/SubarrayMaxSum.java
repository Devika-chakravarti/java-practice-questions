/*Problem: Given an integer array nums and integer k, find the maximum sum of any contiguous subarray of size k.
Input: nums = [2, 1, 5, 1, 3, 2], k = 3
Output: 9
Subarrays of size 3:
[2,1,5] → 8
[1,5,1] → 7
[5,1,3] → 9  maximum
[1,3,2] → 6*/

import java.util.Scanner;

public class SubarrayMaxSum {
    
    public int maxSumSubarray(int[] nums, int k){
        int n = nums.length;

        // STEP 1: FIRST WINDOW SUM
        int windowSum = 0;
        for(int i=0;i<k;i++){
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // STEP 2: SLIDE WINDOW ACROSS REST OF ARRAY
        for (int i=k;i<n;i++){
            windowSum += nums[i];
            windowSum -= nums[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        SubarrayMaxSum obj = new SubarrayMaxSum();

        System.out.println(obj.maxSumSubarray(nums, k));

        sc.close();
    }
}
