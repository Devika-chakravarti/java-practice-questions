/*Problem: Given an unsorted array nums, find the kth largest element.
Input: nums = [3, 2, 1, 5, 6, 4], k = 2
Output: 5 (second largest)
Input: nums = [3, 2, 3, 1, 2, 4, 5, 5, 6], k = 4
Output: 4*/

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElement {
    
    public int findKthLargest(int[] nums, int k){
        // SORT IN ASCENDING ORDER
        Arrays.sort(nums);

        // Kth LARGEST IS AT INDEX n-k
        return nums[nums.length - k];
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        KthLargestElement obj = new KthLargestElement();
        System.out.println(obj.findKthLargest(nums, k));
    }
}
