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
        String contents = "";
        while (head != null){
            contents += head.val;
            head = head.next;
        }
        StringBuilder sb = new StringBuilder(contents);
        return contents.equals(sb.reverse().toString());   
    }
}