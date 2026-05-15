/*Problem: Given an integer array nums, return true if the array contains any duplicate value, otherwise return false.
Input: nums = [1, 2, 3, 1]
Output: true (1 appears twice)
Input: nums = [1, 2, 3, 4]
Output: false (all unique)*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainDuplicates {
    
    public boolean containsDuplicate(int[] nums){
        Set<Integer> seen = new HashSet<>();

        for(int num : nums){
            if(seen.contains(num)){
                return true;    // SEEN BEFORE THAT MEANS DUPLICATE
            }
            seen.add(num);  // MARK AS SEEN
        }
        return false;   // NO DUPLICATES FOUND
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        ContainDuplicates obj = new ContainDuplicates();

        System.out.println(obj.containsDuplicate(nums));

        sc.close();
    }
}
