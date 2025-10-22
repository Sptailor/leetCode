//By Suhail Tailor
//Merge two linked lists.
//Uses a temp node to store list and tail pointer to track final node.
//Compares each list value and adds smaller value to merged list
//if a list is null , tail.next points to the rest of the remaining list.


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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=new ListNode(-1);
        ListNode tail=temp;
        
        while(list1!=null&&list2!=null){// While both lists have nodes

            if(list1.val<list2.val){// Compare values

                tail.next=list1;// Append smaller node to merged list
                list1=list1.next;// Move to next node in list1

            }else{// If list2's value is smaller or equal

                tail.next=list2;// Append smaller node to merged list
                list2=list2.next;// Move to next node in list2

            }

            tail=tail.next;// Move tail to the end of merged list

        }

        if(list1==null){// If list1 is exhausted

            tail.next=list2;// Append remaining nodes from list2

        }else{

            tail.next=list1;// Append remaining nodes from list1

        }

        return temp.next;
    }
}