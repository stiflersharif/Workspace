/*

Given an array of positive and negative integers, segregate them in linear time and constant space. The output should contain all negative numbers, followed by all positive numbers.

Input : [9, -3, 5, -2, -8, -6, 1, 3]
Output: [-3, -2, -8, -6, 9, 5, 1, 3] or [-3, -2, -8, -6, 9, 5, 1, 3] or any other valid combination.

Input : [-4, -2, -7, -9]
Output: [-4, -2, -7, -9] or any other valid combination.

Input : [2, 4, 3, 1, 5]
Output: [2, 4, 3, 1, 5] or any other valid combination.

*/
package Array;

public class RearrangeArray4 {
    public static void rearrange(int[] nums)
    {

        // Write your code here...
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int t= nums[k];
                nums[k++]= nums[i];
                nums[i]=t;
            }
        }
    }
}
