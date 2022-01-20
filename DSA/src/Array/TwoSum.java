/*

Given an unsorted integer array, find a pair with the given sum in it.

• Each input can have multiple solutions. The output should match with either one of them.

Input : nums[] = [8, 7, 2, 5, 3, 1], target = 10
Output: (8, 2) or (7, 3)

• The solution can return pair in any order. If no pair with the given sum exists, the solution should return null.

Input : nums[] = [5, 2, 6, 8, 1, 9], target = 12
Output: null

*/

package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public List<Integer> findSum(int nums[], int target){
        // Write your code here...
        Arrays.sort(nums);
        int low=0;
        int high=nums.length -1;

        while(low<high){
            if(nums[low]+nums[high]== target){
                List<Integer> list = new ArrayList<Integer>();
                list.add(nums[low]);
                list.add(nums[high]);
                return list;
            }

            if(nums[low]+nums[high]<target){
                low++;
            }
            else{
                high--;
            }
        }

        return null;
    }
}
