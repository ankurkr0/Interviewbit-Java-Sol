/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        ListNode curr = A;
        ListNode prevCurr = A;
        ListNode prevTail = null;
        
        while(curr != null){
            int count = B;
            ListNode prev = null;
            while(curr != null && count >0){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count--;
            }
            if(prevTail != null){
                prevTail.next = prev;
            }else 
                A = prev;
            prevTail = prevCurr;
            prevCurr = curr;
            
        }
        return A;
    }
}
