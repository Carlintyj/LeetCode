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
    public int pairSum(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;
        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }
        int length = stack.size();
        int largest = -9999999;
        curr = head;
        for (int i = 0; i < length/2; i++) {
            ListNode twin = stack.pop();
            largest = Math.max(largest, curr.val + twin.val);
            curr = curr.next;
        }
        return largest;
    }
}