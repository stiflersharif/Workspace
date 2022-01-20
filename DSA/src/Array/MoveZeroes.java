
/*

Given an integer array, move all zeros present in it to the end. The solution should maintain the relative order of items in the array and should not use constant space.

Input : [6, 0, 8, 2, 3, 0, 4, 0, 1]
Output: [6, 8, 2, 3, 4, 1, 0, 0, 0]

*/
package Array;

public class MoveZeroes {
    public static void rearrange(int[] nums)
    {
        // Write your code here...
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k++]=nums[i];
            }
        }
        for(int i=k;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
