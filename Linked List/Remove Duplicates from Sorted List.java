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
        if(A==null || A.next == null)
	        return A;
	    ListNode curr = A;
	    
	    while(curr!=null && curr.next!=null)
	    {
	        ListNode next = curr.next;
	        if(next.val == curr.val)
	        {
	            curr.next = next.next;
	        }else
	            curr = next;
	    }
	    return A;
    }
}
