/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int solve(ListNode A, int B) {
        if (A == null || A.next ==null)
            return -1;
        int length = 0;
        ListNode curr = A;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        if ((length / 2) + 1 < B)
            return -1;
       for(int i =1; i <(length / 2) + 1 - B ; i++ ) {
            A = A.next;
        }
        return A.val;
    }
}
