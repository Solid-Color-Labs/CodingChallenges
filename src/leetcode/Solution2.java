package leetcode;

import java.util.Stack;

/**
 * Created by oklesing on 11/24/16.
 */
public class Solution2 {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(l1.next != null || l2.next != null) {
            if (l1 != null) {
                s1.push(l1.val);
                l1 = l1.next;
            }
            if (s2 != null) {
                s1.push(l2.val);
                l2 = l2.next;
            }
        }
        String temp1 = "";
        String temp2 = "";
        while (!s1.empty() || !s2.empty()) {
            if (!s1.empty()) {
                temp1 += s1.pop();
            }
            if (!s2.empty()) {
                temp2 += s2.pop();
            }
        }
        return null;
    }
    
}
