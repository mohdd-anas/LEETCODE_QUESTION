/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         if (head == null) {
            return null;
        }
        HashMap<ListNode,Integer> map=new HashMap<>();
        map.put(head,head.val);
        ListNode temp=head.next;

        while(temp!=null)
        {
            if(map.containsKey(temp))
            {
                return temp;
            }
            map.put(temp,temp.val);
            temp=temp.next;
            
        }
        return null;
        
    }
}