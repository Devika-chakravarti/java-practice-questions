/*Problem: Given an unsorted array nums and a target integer target, return true if any two numbers in the array add up to target, otherwise return false.
Input: nums = [2, 7, 11, 15], target = 9
Output: true (2 + 7 = 9)
Input: nums = [1, 4, 6, 8], target = 5
Output: false*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoSum {
    
    public boolean twoSum(int[] nums, int target){
        Set<Integer> seen = new HashSet<>();

        for(int num : nums){
            int complement = target - num;

            if(seen.contains(complement)){
                return true;    // PAIR FOUND
            }

            seen.add(num);  // MARK CURRENT NUMBER AS SEEN
        }

        return false;   // NO PAIR FOUND
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        TwoSum obj = new TwoSum();
        System.out.println(obj.twoSum(nums, target));

        sc.close();
    }
}
