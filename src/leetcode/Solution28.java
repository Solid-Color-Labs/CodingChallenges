package leetcode;

/*
28. Implement strStr()
https://leetcode.com/problems/implement-strstr/
-----------------------------------------------

Implement strStr().
Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class Solution28 {
    public int strStr(String haystack, String needle) {
        
        int len = needle.length();
        for (int i = 0; i <= haystack.length() - len; i++) {
            if (haystack.substring(i, i + len).equals(needle)) return i;
        }
        return -1;
    }
}