package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: solve problem and commit to github
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        return removeNthFromEnd(head, n, 0);
    }
    
    private ListNode removeNthFromEnd(ListNode head, int n, int pos) {
        if (head.next == null) {
            return null;
        }
        if (n == pos) {
            head.next = head.next.next;
            return head;
        }
        return removeNthFromEnd(head.next, n, ++pos);
    }
    
}
