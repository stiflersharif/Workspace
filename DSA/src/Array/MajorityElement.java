/*

Given an integer array of size `n`, return the element which appears more than `n/2` times. Assume that the input always contain the majority element.

Input : [2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2]
Output: 2

Input : [1, 3, 1, 1]
Output: 1

*/

package Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int findMajorityElement(int[] nums)
    {
        int n = nums.length;
        int ans=0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        System.out.println(map);
        for(int i=0;i<n;i++){
      //      System.out.println(map.get(nums[i]));
            if(map.get(nums[i])>n/2){
                ans = nums[i];
            }
        }

        return ans;
    }

    public static void main(String[] args){
        int[] nums ={2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2};
        System.out.println(MajorityElement.findMajorityElement(nums));
    }
}
