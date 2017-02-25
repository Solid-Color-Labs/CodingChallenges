package leetcode;

/*
34. Search for a Range
https://leetcode.com/problems/search-for-a-range/
-------------------------------------------------

Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].
 */
public class Solution34 {
    
    public int[] searchRange(int[] nums, int target) {
        int lo = -1;
        int hi = -1;
        boolean hasLo = false;
        for (int i = 0; i < nums.length; i++) {
            if (!hasLo && nums[i] == target) {
                lo = i;
                hasLo = true;
            } if (nums[i] == target) {
                hi = i;
            } if (nums[i] != target && hasLo) {
                break;
            }
        }
        return new int[]{lo, hi};
    }
    
}
