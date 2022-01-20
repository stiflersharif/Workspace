/*

Given an integer array, find a pair with the maximum product in it.

Each input can have multiple solutions. The output should match with either one of them.

Input : [-10, -3, 5, 6, -2]
Output: (-10, -3) or (-3, -10) or (5, 6) or (6, 5)

Input : [-4, 3, 2, 7, -5]
Output: (3, 7) or (7, 3)

If no pair exists, the solution should return null.

Input : [1]
Output: null

*/

package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumProdPair {
    public List<Integer> findSum(int nums[], int target){
        if(nums.length<=1){
                return null;
            }
                Arrays.sort(nums);
            int low=0;
            int g_ans=Integer.MIN_VALUE;
            int local=0;
            int index=0;
                for(int i=1;i<nums.length;i++){
                local = nums[low]*nums[i];
                if(local>g_ans){
                    g_ans=local;
                    index=low;
                }
                low++;
            }
            List<Integer> list = new ArrayList<Integer>();
            list.add(nums[index]);
            list.add(nums[index+1]);
                return list;
        }
}
