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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = 0;
        int digit = 0;
        while (l1 != null){
            num1 += l1.val * Math.pow(10, digit);
            digit += 1;
            l1 = l1.next;
        }
        int num2 = 0;
        digit = 0;
        while (l2 != null){
            num2 += l2.val * Math.pow(10, digit);
            digit += 1;
            l2 = l2.next;
        }
        String result = "" + (num1 + num2);
        StringBuilder sb = new StringBuilder(result);
        result = sb.reverse().toString();
        ListNode head = new ListNode(Character.getNumericValue(result.charAt(0)));
        ListNode curr = head;
        for (int i = 1; i < result.length(); i++){
            curr.next = new ListNode(Character.getNumericValue(result.charAt(i)));
            curr = curr.next;
        }
        return head;
    }
}
