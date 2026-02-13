
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
    ListNode next;// Pointer to the next node
    ListNode() {}
    ListNode(int val) { this.val = val; }// Constructor to initialize the node with a value
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }// Constructor to initialize the node with a value and a reference to the next node
}
    public ListNode reverseList(ListNode head) {
        
        ListNode prev= null;// Previous node starts as null
        ListNode curr=head;// Current node starts at the head of the list

        while(curr!=null){

            ListNode next=curr.next;// Store the next node

            curr.next=prev;// Reverse the link
            prev=curr;// Move prev to current
            curr=next;// Move curr to next

        }

        head=prev;// New head is the previous node (new front of the reversed list)

        return head;// Return the new head of the reversed list
    }
}