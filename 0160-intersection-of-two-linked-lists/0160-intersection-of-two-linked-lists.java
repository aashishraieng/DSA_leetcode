/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // int la=0;
        // int lb=0;
        // ListNode temA=headA;
        // ListNode temB=headB;
        // while(temA!=null){
        //     la++;
        //     temA=temA.next;           

        // }
        // while(temB!=null){
        //     lb++;
        //     temB=temB.next;           

        // }
        // temA=headA;
        // temB=headB;

        // if(lb>la){
        //     int d=lb-la;
        //     for(int i=0;i<d;i++){
        //         temB=temB.next;
        //     }
        // }else{
        //     int d=la-lb;
        //     for(int i=0;i<d;i++){
        //         temA=temA.next;
        //     }

        // }

        // while(temA!=null){
        //     if(temA==temB){
        //         return temA;
        //     }
        //     temA=temA.next;
        //     temB=temB.next;
        // }

        // return null;

        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=tempB){
            if(tempA==null){
                tempA=headB;
            }else{
                tempA=tempA.next;
            }
            if(tempB==null){
                tempB=headA;
            }else{
                tempB=tempB.next;
            }
        }

        return tempA;
        
    }
}