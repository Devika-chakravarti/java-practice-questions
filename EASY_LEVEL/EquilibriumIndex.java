/*Problem: Given an array nums, return the index where the left sum equals the right sum (equilibrium index). If no such index exists, return -1.
Left sum = sum of all elements to the LEFT of index i (not including i)
Right sum = sum of all elements to the RIGHT of index i (not including i)
Input: nums = [1, 7, 3, 6, 5, 6]
Output: 3 (left sum = 1+7+3 = 11, right sum = 5+6 = 11)*/

import java.util.Scanner;

public class EquilibriumIndex {
    
    public int privotIndex(int[] nums){
        int totalSum = 0;

        //PASS 1: GET TOTAL SUM
        for(int num:nums){
            totalSum += num;
        }

        int leftSum = 0;

        //PASS 2: WALK AND CHECK BALANCE
        for(int i=0;i<nums.length;i++){
            int rightSum = totalSum - leftSum - nums[i];
            if(leftSum==rightSum){
                return i;   //EQUILIBRIUM FOUND
            }

            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        EquilibriumIndex obj = new EquilibriumIndex();
        System.out.println(obj.privotIndex(nums));
    }
}
