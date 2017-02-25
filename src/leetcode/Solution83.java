package leetcode;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class Solution83 {
    
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        while (head.next != null) {
            if (set.contains(head.val)) {
                head.next = head.next.next;
            } else {
                set.add(head.val);
            }
        }
        return null;
    }
    
}
