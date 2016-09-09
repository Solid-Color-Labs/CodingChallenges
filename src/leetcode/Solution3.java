package leetcode;

import java.util.HashMap;
import java.util.Map;

/*
3. Longest Substring Without Repeating Characters
https://leetcode.com/problems/longest-substring-without-repeating-characters/
------------------------------------------------------------------------------
Given a string, find the length of the longest substring without repeating characters.

Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> indices = new HashMap<>();
        int length = 0;
        int start = -1;
        
        for(int end = 0; end < s.length(); end++){
            char c = s.charAt(end);
            if(indices.containsKey(c)){
                int newstart = indices.get(c);
                start = Math.max(start,newstart);
            }
            length = Math.max(length,end-start);
            indices.put(c,end);
        }
        return length;
    }
}