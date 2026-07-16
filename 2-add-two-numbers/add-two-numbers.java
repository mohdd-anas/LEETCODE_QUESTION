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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = l1;
        ListNode prev1=null;
        int res = 0;
        int value = 0;
        while (l1 != null && l2 != null) {
            value = l1.val + l2.val + res;
            if (value > 9) {
                res = value / 10;

                l1.val = value % 10;
            } else {
                l1.val = l1.val + l2.val + res;
                res = value / 10;
            }
            prev1=l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null) {
            prev1.next=l2;
            while (l2 != null) {
                value = l2.val  + res;
                if (value > 9) {
                    res = value / 10;

                    l2.val = value % 10;
                } else {
                    l2.val = l2.val + res;
                    res = value / 10;
                }
                if(l2.next==null)
                {
                    prev1=l2;
                }
                l2 = l2.next;
            }

        }
        if (l2 == null) {
            while (l1 != null) {
                value = l1.val  + res;
                if (value > 9) {
                    res = value / 10;

                    l1.val = value % 10;
                } else {
                    l1.val = l1.val  + res;
                    res = value / 10;
                }
                if(l1.next==null)
                {
                    prev1=l1;
                }
                l1 = l1.next;
            }
        }
        if(res!=0)
        {
            ListNode node=new ListNode();
            node.val=res;
            prev1.next=node;
        }
        return ans;

    }
}