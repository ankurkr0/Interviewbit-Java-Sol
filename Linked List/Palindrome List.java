/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {
        ListNode slow = A;
        ListNode fast = A;
        ListNode prev = null;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            
            ListNode temp = slow;
            slow = slow.next;
            temp.next = prev;
            prev = temp;
        }
        if(fast != null) slow = slow.next;
        
        while(prev != null && slow != null){
            if(prev.val != slow.val){
            return 0;
            }
            prev = prev.next;
            slow = slow.next;
        }
        
        return (slow == null && prev == null) ? 1 : 0;
    }
}
