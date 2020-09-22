/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A) {
        if(A==null || A.next == null) return A;
        
        ListNode rest = reverseList(A.next);
        
        A.next.next = A;
        A.next = null;
        
        return rest;
    }
}
