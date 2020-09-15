/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A == null) return B;
        if(B == null) return A;
        ListNode head = new ListNode(0);
        ListNode curr = head;
        
        while(A != null && B != null){
            if(A.val < B.val){
                curr.next = A;
                 A = A.next;
            }else{
                curr.next = B;
                B = B.next;
            }
            curr = curr.next;
        }
        if(A != null) curr.next = A;
        if(B != null) curr.next = B;
        
        return head.next;
    }
}
