/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode A, int B) {
        if(A == null || A.next == null) return A;
        
        int len = 1;
        ListNode curr = A;
        while(curr.next != null){
            len++;
            curr = curr.next;
        }
        B %= len;
        if (B == 0) 
        return A;
        int stepsToNewHead = len - B;
        curr.next = A;
        while(stepsToNewHead-- > 0){
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        return newHead;
    }
}
