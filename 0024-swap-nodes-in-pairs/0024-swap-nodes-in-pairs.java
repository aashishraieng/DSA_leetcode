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
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        
        if(len==0 || len==1){
            return head;
        }

        temp=head;
       while(temp != null && temp.next != null){
            int l=temp.val;
            int r=temp.next.val;
            temp.val=r;
            temp.next.val=l;
            temp=temp.next.next;

        }

        return head;

    }
}