
//By Suhail Tailor
// Reverses a singly linked list by iteratively re-pointing each node's next reference.
// Uses three pointers: prev (initially null), curr (traverses the list), and next (stores the next node).
// At each step, reverses the link so curr points to prev, then advances both prev and curr forward.
// Returns the new head (prev) which links to the fully reversed list.
/**
 * Definition for singly-linked list.
 */


class Solution {
    private class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
    public ListNode reverseList(ListNode head) {
        
        ListNode prev= null;
        ListNode curr=head;

        while(curr!=null){

            ListNode next=curr.next;

            curr.next=prev;
            prev=curr;
            curr=next;

        }

        head=prev;

        return head;
    }
}