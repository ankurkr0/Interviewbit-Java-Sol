/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {
        if(A==null) return A;
        ListNode root = new ListNode(-1);
        ListNode pivot = new ListNode(-1);
        ListNode rootIter = root;
        ListNode pivotIter = pivot;
        ListNode curr = A;
        while(curr!=null){
            if(curr.val==0 ){
                rootIter.next = curr;
                rootIter = curr;
            }else{
                pivotIter.next = curr;
                pivotIter = curr;
            }
            curr = curr.next;
        }
        pivotIter.next = null;
        rootIter.next = pivot.next;
        return root.next;
    }
}
