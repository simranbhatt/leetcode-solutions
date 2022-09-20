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
        ListNode newList = new ListNode();
        ListNode newHead = newList;
        //merge sort approach
        while(list1 != null && list2 != null) {
          if(list1.val < list2.val) {
              newList.next = list1;
              list1 = list1.next;
              newList = newList.next;
          } else {
              newList.next = list2;
              list2 = list2.next;
              newList = newList.next;
          }  
        }
        while(list1 != null) {
            newList.next = list1;
            list1 = list1.next;
            newList = newList.next;
        }
        while(list2 != null) {
            newList.next = list2;
            list2 = list2.next;
            newList = newList.next;
        }
        return newHead.next;
    }
}