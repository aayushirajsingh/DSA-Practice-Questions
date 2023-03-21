// 1480. Running Sum of 1d Array

class Solution {
    public int[] runningSum(int[] nums) {
        // int[] results = new int[nums.length];
        // results[0] = nums[0];
        for(int i=1; i < nums.length; i++)
        {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
    // time complexity = O(n)
    // space complexity = O(1)
}