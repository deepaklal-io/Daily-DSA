/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
       ListNode prev;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next,ListNode prev) { this.val = val; this.next = next; this.prev=prev  }
 * }
 */
class Day10 {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode newnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newnode;
        }

        return prev;
    }
}