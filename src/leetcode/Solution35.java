package leetcode;

/*
35. Search Insert Position
https://leetcode.com/problems/search-insert-position/
-----------------------------------------------------

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
 */
public class Solution35 {
    
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] > target || nums[0] == target) return 0;
            else return 1;
        }
        if (target < nums[0]) return 0;
        if (target > nums[nums.length - 1]) return nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            if (target < nums[i + 1] && target > nums[i]) {
                return i + 1;
            } else if (target == nums[i + 1]){
                return i + 1;
            } else if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }
    
}
