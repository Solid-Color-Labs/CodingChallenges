package leetcode;

/**
 * Created by oklesing on 9/17/16.
 */
public class Solution21 {
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        if (l1.val < l2.val) {
            mergeTwoLists(l1.next, l2);
        }
        return null;
    }
    
}
