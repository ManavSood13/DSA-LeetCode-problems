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
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //create a dummy node before head
        ListNode dummy =new ListNode(0,head);
        ListNode slow=dummy;
        ListNode fast=dummy;
        // keep fast n nodes ahead of slow
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        //move fast and slow
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        //after moving slow will always be one step before the node we have to delete
        slow.next=slow.next.next;
        return dummy.next;
    }
}
