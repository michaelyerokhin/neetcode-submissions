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
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = head;
        if (head == null){
            return null;
        }
        while (newHead.val == val){
            newHead = newHead.next;
            if (newHead == null){
                return null;
            }
        }
        if (newHead == null) {
            return null;
        }
        ListNode future = newHead.next;
        ListNode prev = newHead;
        while (future != null){
            if (future.val == val){
                future = future.next;
            } else {
                prev.next = future;
                prev = future;
                future = future.next;
            }
        }
        prev.next = future;
        return newHead;
    }
}