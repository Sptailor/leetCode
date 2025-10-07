//By Suhail Tailor
// Recursively reverses a singly linked list.
// Base case: if the list is empty or has one node, return head.
// Recursive step: reverse the rest of the list, then make head.next point back to head.
// Set head.next to null to avoid cycles and return the new head of the reversed list.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)return head;
        
          ListNode newHead = reverseList(head.next);// Reverse the rest of the list
          head.next.next = head;// Make the next node point to the current head
          head.next = null;// Set head.next to null to avoid cycles

    return newHead;

    }
}