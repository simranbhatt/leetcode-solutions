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
        ListNode current = head;
        ListNode newPrev = null;
        ListNode newNext = null;
        
        while(current != null) {
            //pointing the current value in the opposite direction
            newPrev = current.next;
            current.next = newNext;
            //setting up for the next iteration of the reversal
            newNext = current;
            current = newPrev;
        }
        return newNext;
    }
}