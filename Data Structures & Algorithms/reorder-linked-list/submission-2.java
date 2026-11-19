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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode middle = slow;
        ListNode future = middle;
        ListNode prev = null;
        while (future != null){
            future = middle.next;
            middle.next = prev;
            prev = middle;
            middle = future;
        }
        ListNode temp1, temp2 = null;
        while (head.next != prev && head != prev ){
            temp1 = head.next;
            temp2 = prev.next;
            head.next = prev;
            head = temp1;
            prev.next = head;
            prev = temp2;
        }
    }
}
