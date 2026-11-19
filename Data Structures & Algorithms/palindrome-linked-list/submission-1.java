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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        } 
        ListNode middle = slow.next;
        ListNode prev = slow;
        ListNode future = middle;
        while (future != null){
            future = middle.next;
            middle.next = prev;
            prev = middle;
            middle = future;
        }
        while (head != prev && head.next != prev){
            if (head.val != prev.val){
                return false;
            } else {
                head = head.next;
                prev = prev.next;
            }
        }
        if (head.next == prev){
            return head.val == prev.val;
        }
        return true;
    }
}