/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = 
next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        /*
        For each node in the list:
        - update prev node
        - update next node
        - set current->next to prev
        - set current to next

        1 -> 2 -> 3 -> 4 -> 5
    ^   ^   ^
         */



        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;
        while (current != null) {
            // System.out.println(current.val);
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }
        return prev; 
    }
}
