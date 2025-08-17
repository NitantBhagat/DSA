/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int idx=0;
        ListNode temp = head;
        Map<ListNode,Integer> map = new HashMap<>();

        while(temp!=null){
            if(map.containsKey(temp)){
                return temp;
            }
            map.put(temp,1);
            temp=temp.next;
        }

        return null;
    }
}