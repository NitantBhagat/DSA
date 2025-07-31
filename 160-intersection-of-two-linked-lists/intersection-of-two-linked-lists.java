/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = size(headA);
        int sizeB = size(headB);

        if(sizeA<sizeB){
            return intersection(headA,headB,sizeB-sizeA);
        }
        else{
            return intersection(headB,headA,sizeA-sizeB);
        }
    }

    public static int size(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        return count;
    }

    public static ListNode intersection(ListNode small,ListNode large, int n){

        while(n!=0){
            large=large.next;
            n--;
        }
        while(small!=null){
            if(small==large)return small;
            small=small.next;
            large= large.next;
        }

        return null;
    }
}