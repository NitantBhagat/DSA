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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode currNode = head;
        ListNode prevNode = null;
        ListNode nextNode = null;

        while(currNode != null){
            nextNode = currNode.next;
            currNode.next =prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
        
    }
}