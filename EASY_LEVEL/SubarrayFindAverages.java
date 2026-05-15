/*Problem: Given an array of integers nums and an integer k, find the average of each contiguous subarray of size k and return all averages in a result array.
Input: nums = [1, 3, 2, 6, -1, 4, 1, 8, 2], k = 5
Output: [2.2, 2.8, 2.4, 3.6, 2.8]
[1,3,2,6,-1]  → 11/5 = 2.2
[3,2,6,-1,4]  → 14/5 = 2.8
[2,6,-1,4,1]  → 12/5 = 2.4
[6,-1,4,1,8]  → 18/5 = 3.6
[-1,4,1,8,2]  → 14/5 = 2.8*/

import java.util.Arrays;
import java.util.Scanner;

public class SubarrayFindAverages {
    
    public double[] findAverages(int[] nums, int k){
        int n = nums.length;
        double[] result = new double[n-k+1];    // EXACTLY THIS MANY WINDOWS

        // STEP 1: FIRST WINDOW SUM
        double windowSum = 0;
        for(int i=0;i<k;i++){
            windowSum += nums[i];
        }
        result[0] = windowSum/k;    // FIRST AVERAGE

        // STEP 2: SLIDE THE WINDOW
        for(int i=k;i<n;i++){
            windowSum += nums[i];   // BRING IN RIGHT ELEMENT
            windowSum -= nums[i-k]; // THROW OUT LEFT ELEMENT
            result[i-k+1] = windowSum/k;    // STORE AVERAGE
        }

        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        SubarrayFindAverages obj = new SubarrayFindAverages();

        System.out.println(Arrays.toString(obj.findAverages(nums, k)));

        sc.close();
    }
}
