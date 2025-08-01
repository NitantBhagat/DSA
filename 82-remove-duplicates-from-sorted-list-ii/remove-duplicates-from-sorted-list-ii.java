/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        dummy.next = head;

        while(prev.next!=null && prev.next.next!=null){
            if(prev.next.val == prev.next.next.val){
                int duplicate = prev.next.val;
                while(prev.next!=null && prev.next.val==duplicate){
                    prev.next=prev.next.next;
                }
            }else{
                prev = prev.next;
            }
        }
        return dummy.next;
    }
}