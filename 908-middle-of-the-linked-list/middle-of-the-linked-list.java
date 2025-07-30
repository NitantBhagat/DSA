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

    private static int LLSize(ListNode head){
        int count = 0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public ListNode middleNode(ListNode head) {

        if(head == null) return head;
        int size = LLSize(head);
        int middle =(size/2);
        ListNode temp = head;
        while(middle != 0){
            middle--;
            temp=temp.next;
        }
        return temp;
    }
}