/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        
// // Method1:
        ListNode head1 = a;
        ListNode head2 = b;
        int l1=0, l2=0, diff = 0;
        
        while(head1!=null){
            l1++;
            head1= head1.next;
        }
        while(head2!=null){
            l2++;
            head2 = head2.next;
        }
        if(l1>l2){
            diff = l1-l2;
            head1=a;
            head2=b;
        }else{
            diff= l2-l1;
            head1=b;
            head2=a;
        }
        for(int i=0;i<diff;i++){
            head1=head1.next;
        }
        while(head1!=null && head2!=null){
              if(head1 == head2)
            return head2;
            head1 = head1.next;
            head2 = head2.next;
          
        }
        return null;
        
// Method 2:
        ListNode A = a;
        ListNode B = b;

        while(A!=B)
            {
                A = (A!=null) ? A.next : b;
                B = (B!=null) ? B.next : a;
            }
        
        
        return A;
    }
}
