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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp=head;
        int count=1;
        while(head==null||head.next==null) return head;
        ListNode os=null;
        ListNode es=null;
        ListNode oe=null;
        ListNode ee=null;
        while(temp!=null){
            if(count%2==1){
                if(os==null){
                    os=oe=temp;
                }
                else{
                    oe.next=temp;
                    oe=temp;
                }
            }
            else{
                if(es==null){
                    es=ee=temp;
                }
                else{
                    ee.next=temp;
                    ee=temp;
                }
            }
            temp=temp.next;
            count++;
        }
        if(os==null){
            es=head;
        }
        head=os;
        oe.next=es;
        ee.next=null;
        return head;
    }
}