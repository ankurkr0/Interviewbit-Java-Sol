/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A, int B) {
        ListNode curr = A;
        ListNode prevCurr = A;
        ListNode tail = null;
        
        while(curr != null){
            int count = B;
            ListNode prev = null;
            prevCurr = curr;
            while(curr != null && count >0){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count--;
            }
            if(tail != null){
                tail.next = prev;
            }else 
                A = prev;
            tail = prevCurr;
            tail.next = curr;
            count = 0;
            while(count < B && curr != null){
                prev = curr;
                curr = curr.next;
                count++;
            }
            tail = prev;
        }
        return A;
        
    }
}
