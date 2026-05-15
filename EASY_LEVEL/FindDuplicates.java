/*Problem: Given an integer array nums, find all elements that appear more than once. Return them in any order.
Input: nums = [4, 3, 2, 7, 8, 2, 3, 1]
Output: [2, 3]*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicates {

    public List<Integer> findDuplicates(int nums[]){
        List<Integer> result = new ArrayList<>();

        // PASS 1: BUILD FREQUENCY MAP
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num, 0)+1);
        }

        // PASS 2: COLLECT ELEMENTS WITH FREQUENCY > 1
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue()>1){
                result.add(entry.getKey());
            }
        } 
        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i=0;i<N;i++){
            nums[i] = sc.nextInt();
        }
        
        FindDuplicates obj = new FindDuplicates();
        System.out.println(obj.findDuplicates(nums));
        
        sc.close();
    }
}
