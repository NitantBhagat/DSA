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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp =  head;
        ListNode dummy =  new ListNode(0);
        dummy.next = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }

        if(n>length) return head;

        int count = length - n ;

        temp = dummy;
        while(count > 0){
            count -- ;
            temp=temp.next;
        }

        temp.next = temp.next.next;

        return dummy.next;


    }
}