//Suhail Tailor
// Detects if a linked list has a cycle using a HashSet.
// Iterates through each node and stores it in the set.
// If a node is seen again, a cycle exists and returns true.
// Returns false if the end of the list is reached without repeats.

import java.util.HashSet;

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
public class Solution {
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode>set=new HashSet<>();
        
        while(head!=null){

            if(!set.contains(head)){

                set.add(head);
                head=head.next;

            }else{

                return true;

            }

        }
        return false;
        
    }
}