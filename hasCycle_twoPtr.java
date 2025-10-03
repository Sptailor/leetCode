/** By Suhail Tailor
 * Detects if a linked list has a cycle using two pointers (Floyd’s algorithm).
 * Slow pointer moves one step at a time, fast pointer moves two steps.
 * If the list has a cycle, the fast pointer will eventually meet the slow pointer.
 * Returns false if the fast pointer reaches the end of the list (no cycle).
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class hasCycle_twoPtr {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}