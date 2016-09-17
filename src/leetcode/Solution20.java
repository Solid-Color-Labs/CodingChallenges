package leetcode;

import java.util.Stack;

/*
20. Valid Parentheses
https://leetcode.com/problems/valid-parentheses/
------------------------------------------------
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class Solution20 {
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty()) {
                switch (c) {
                    case '}':
                        if (stack.pop() != '{') return false;
                        break;
                    case ')':
                        if (stack.pop() != '(') return false;
                        break;
                    case ']':
                        if (stack.pop() != '[') return false;
                        break;
                    default:
                        stack.push(c);
                        break;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
