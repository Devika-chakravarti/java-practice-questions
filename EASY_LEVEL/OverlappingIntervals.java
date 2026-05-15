/*Problem: Given an array of intervals where intervals[i] = [start, end], merge all overlapping intervals and return the result.
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
[1,3] and [2,6] overlap → merge to [1,6]
[8,10] and [15,18] don't overlap → keep as is
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
[1,4] and [4,5] touch at 4 → merge to [1,5]*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OverlappingIntervals {
    
    public int[][] merge(int[][] intervals){
        
        // STEP 1: SORT BY START TIME
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);

        List<int[]> result = new ArrayList<>();

        // STEP 2: START WITH FIRST INTERVAL
        int[] current = intervals[0];

        for(int i=1;i<intervals.length;i++){
            int[] next = intervals[i];
            if(next[0]<=current[1]){
                //OVERLAP, MERGE BY EXTENDING END IF NEEDED
                current[1] = Math.max(current[1], next[1]);
            }else{
                //NO OVERLAP, SAVE CURRENT, MOVE TO NEXT
                result.add(current);
                current = next;
            }
        }
        // ADD THE LAST INTERVAL
        result.add(current);

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] intervals = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                intervals[i][j] = sc.nextInt();
            }
        }

        OverlappingIntervals obj = new OverlappingIntervals();
        System.out.println(Arrays.deepToString(obj.merge(intervals)));

        sc.close();
    }
}
