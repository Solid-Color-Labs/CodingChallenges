package leetcode;

/*
7. Reverse Integer
https://leetcode.com/problems/reverse-integer/
----------------------------------------------
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
 */
public class Solution7 {
    public int reverse(int x) {
        String s = convertIntToReverseString(x);
        long l = Long.parseLong(s);
        if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) return 0;
        return (int) l;
    }
    
    private String convertIntToReverseString(int i) {
        String reverse = reverseString(String.valueOf(i));
        char c = reverse.charAt(reverse.length() - 1);
        if (!Character.isDigit(c)) {
            reverse = c + reverse.substring(0, reverse.length() - 1);
        }
        return reverse;
    }
    
    private String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reverse = sb.reverse();
        return reverse.toString();
    }
}
