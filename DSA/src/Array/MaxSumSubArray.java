/*

Given an integer array, find the maximum sum among all its subarrays.

Input : [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
Explanation: The maximum sum subarray is [4, -1, 2, 1]

Input : [-7, -3, -2, -4]
Output: -2
Explanation: The maximum sum subarray is [-2]

Input : [-2, 2, -1, 2, 1, 6, -10, 6, 4, -8]
Output: 10
Explanation: The maximum sum subarray is [2, -1, 2, 1, 6] or [6, 4] or [2, -1, 2, 1, 6, -10, 6, 4]

*/

// Note:- Kadane's Algorithm


package Array;

public class MaxSumSubArray {
    public static int findMaxSubarraySum(int[] nums)
    {
        // Write your code here...
        int loc_sum=0;
        int g_sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            loc_sum = loc_sum+nums[i];
            if(g_sum<loc_sum){
                g_sum = loc_sum;
            }

            if(loc_sum<0){
                loc_sum =0;
            }
        }

        return g_sum;
    }
}
