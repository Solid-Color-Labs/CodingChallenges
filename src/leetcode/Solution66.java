package leetcode;

/*
66. Plus One
https://leetcode.com/problems/plus-one/
--------------------------------------
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
 */
public class Solution66 {
    
    public int[] plusOne(int[] digits) {
        // if last element not 9, we can just increase last element by 1
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        } else {
            // if array contains 1 element and element is 9, we manually returns correct answer, because
            // my iterating solution requires at least 2 elements in the array.
            if (digits.length == 1 && digits[0] == 9) return new int[]{1, 0};
            
            // Add one to the last element, so that it becomes 10
            // if element is 10, set it to 0 and increment next element. If next element becomes 10 after
            // being incremented, repeat.
            else {
                digits[digits.length - 1]++;
                for (int i = digits.length - 1; i > 0 && digits[i] > 9; i--) {
                    digits[i] = 0;
                    digits[i - 1]++;
                }
                // since the loop never reaches the last element, we need to check if element is 10.
                // if element is 10, this means that all other elements must be 0.
                // java initializes integer array to 0 by default, so we can just create new array that is 1 size
                // bigger that original array and set first element to 1.
                if (digits[0] > 9) {
                    int[] temp = new int[digits.length + 1];
                    temp[0] = 1;
                    return temp;
                }
                return digits;
            }
        }
    }
    
}
