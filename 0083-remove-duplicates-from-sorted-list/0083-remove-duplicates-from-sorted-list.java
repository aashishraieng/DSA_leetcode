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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode();
        ListNode temp=head;
        ListNode tdump=dummy;
        int v=-1000;
        while(temp!=null){
            if(temp.val!=v){
                tdump.next=new ListNode(temp.val);
                tdump=tdump.next;
                v=temp.val;                                
            }
            temp=temp.next;

        }  
        return dummy.next;
    }
}