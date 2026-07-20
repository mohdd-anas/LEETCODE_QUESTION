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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right||head.next==null||head==null)
        {
            return head;
        }
        ListNode bs=null;
        ListNode start=head;
        ListNode end=head;
        ListNode ae=null;
        int i=1;
        if(left>1)
        {
        while(i<left)
        {
            bs=start;
           start=start.next;
            i++;
        }
        }
        int j=1;
        while(j<right)
        {
            end=end.next;
            j++;
        }
        ae=end.next;
        if(bs==null)
        {
            ListNode dummy=new ListNode(0);
            dummy.next=reverse(start,end,ae);
            return dummy.next;
        }
        bs.next=reverse(start,end,ae);
        return head;


    }
    public ListNode reverse(ListNode start,ListNode end,ListNode ae)
    {
        ListNode prev=null;
        ListNode curr=start;
        ListNode next=start.next;
        while(curr!=end)
        {
            curr.next=prev;
            prev=curr;
            curr=next;
            next=curr.next;
        }
        end.next=prev;
        start.next=ae;
        return end;
    }
}