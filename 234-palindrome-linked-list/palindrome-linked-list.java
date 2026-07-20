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
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
        {
            return true;
        }
        ListNode mid=mid(head);
        ListNode ans=reverse(mid.next);
        ListNode temp=head;
        while(ans!=null)
        {
            if(temp.val!=ans.val)
            {
                return false;
            }
            temp=temp.next;
            ans=ans.next;

        }
        return true;
    }
    public static ListNode reverse(ListNode temp)
    {
        ListNode prev=null;
        ListNode curr=temp;
        
        while(curr!=null)
        {
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        return prev;
        
    }
    public static ListNode mid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}