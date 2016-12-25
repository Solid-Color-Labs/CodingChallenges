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
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    
    private String convertIntToReverseString(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i));
        if (!Character.isDigit(sb.charAt(0))) {
            char c = sb.charAt(0);
            sb = sb.deleteCharAt(0);
            StringBuilder reverse = sb.reverse();
            reverse.insert(0, c);
            return reverse.toString();
        }
        return sb.reverse().toString();
    }
    
}
