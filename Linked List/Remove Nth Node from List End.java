/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        if(A == null) return A;
        ListNode slow = A;
        ListNode fast = A;
        ListNode prev = null;
        int length = 1;
        while(length <= B && fast != null){
            length++;
            fast = fast.next;
        }
        if(fast == null) return A.next;
        while(fast != null){
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = slow.next;
        return A;
    }
}
