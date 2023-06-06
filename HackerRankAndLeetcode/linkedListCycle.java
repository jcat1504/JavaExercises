public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head, fast=head;
        while(head != null && head.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) return true;
        }
        return false;
    }
}