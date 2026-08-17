class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverse(ListNode list) {
        ListNode prev = null;
        ListNode curr = list;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        // Find the end of the first half
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half
        fast = reverse(slow.next);
        slow.next = null;

        // Merge the two halves alternately
        slow = head;

        while (fast != null) {
            ListNode nextSlow = slow.next;
            ListNode nextFast = fast.next;

            slow.next = fast;
            fast.next = nextSlow;

            slow = nextSlow;
            fast = nextFast;
        }
    }
}