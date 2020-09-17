/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        if(A == null) return null;
    ListNode dummy = new ListNode(0);
        dummy.next = A;
        ListNode cur1 = dummy;
        ListNode pre1 = null;
        for(int i=0;i<B;i++){
            pre1 = cur1;
            cur1 = cur1.next;
        }
        ListNode cur2 = cur1;
        ListNode pre2 = pre1;
        ListNode next;
        for(int i=B;i<=C;i++){
            next = cur2.next;
            cur2.next = pre2;
            pre2 = cur2;
            cur2 = next;
        }
        pre1.next = pre2;
        cur1.next = cur2;
        
        return dummy.next;
    }
}
