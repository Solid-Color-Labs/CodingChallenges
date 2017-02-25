package leetcode;

import java.util.Arrays;

/**
 * Created by oklesing on 9/21/16.
 */
public class Solution189 {
    
    public void rotate(int[] nums, int k) {
        if (k > nums.length) return;
        int[] temp = new int[nums.length];
        System.arraycopy(nums, 0, temp, k, nums.length - k);
        System.arraycopy(nums, nums.length - k, temp, 0, k);
        nums = temp;
    }
    
}
