package leetcode;

/*
303. Range Sum Query - Immutable
https://leetcode.com/problems/range-sum-query-immutable/
--------------------------------------------------------

Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
Note:
1. You may assume that the array does not change.
2. There are many calls to sumRange function.
 */
public class NumArray {
    
    private int[] nums;
    
    public NumArray(int[] nums) {
        this.nums = nums;
        // pre-calculate sum
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
    }
    
    public int sumRange(int i, int j) {
        if (i == 0) return nums[j];
        return nums[j] - nums[i - 1];
    }
}
