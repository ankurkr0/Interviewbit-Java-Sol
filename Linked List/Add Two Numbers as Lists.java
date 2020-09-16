/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode dummy = new ListNode(0);
        ListNode c = dummy;
        int carry =0;
        while(A!=null || B!=null){
            int A_val = (A != null) ? A.val : 0;
            int B_val = (B != null) ? B.val : 0;
            
            int sum = A_val + B_val + carry;
            carry = sum / 10;
            int lastDigit = sum% 10;
            
            ListNode newNode = new ListNode(lastDigit);
            c.next = newNode;
            
            if(A!=null) A = A.next;
            if(B!=null) B = B.next;
            c = c.next;
        }
        if(carry!=0){
            ListNode newNode = new ListNode(carry);
            c.next = newNode;
            c = c.next;
        }
        return dummy.next;
    }
}
