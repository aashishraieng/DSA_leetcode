class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        // Find length
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        k = k % len;
        if (k == 0)
            return head;

        while (k-- > 0) {

            ListNode prev = null;
            ListNode curr = head;

            // Reach last node
            while (curr.next != null) {
                prev = curr;
                curr = curr.next;
            }

            // Remove last node
            prev.next = null;

            // Move it to front
            curr.next = head;
            head = curr;
        }

        return head;
    }
}