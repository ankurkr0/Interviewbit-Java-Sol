/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        prev.next = A;
        while(A!=null){
            while(A.next !=null && A.val == A.next.val)
            A = A.next;
            if(prev.next==A){
                prev=prev.next;
            }
            else{
                prev.next=A.next;
            }
            A=A.next;
        }
        return dummy.next;
    }
}
