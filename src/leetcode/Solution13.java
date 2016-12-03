package leetcode;

/*
13. Roman to Integer
https://leetcode.com/problems/roman-to-integer/
-----------------------------------------------

Given a roman numeral, convert it to an integer.
Input is guaranteed to be within the range from 1 to 3999.
 */
public class Solution13 {
    
    public int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (romanCharToInt(s.charAt(i)) < romanCharToInt(s.charAt(i + 1))) {
                num -= romanCharToInt(s.charAt(i));
            } else {
                num += romanCharToInt(s.charAt(i));
            }
        }
        num += romanCharToInt(s.charAt(s.length() - 1));
        return num;
    }
    
    private int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    
}
