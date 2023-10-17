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
    public ListNode middleNode(ListNode head) {
        ListNode n = head;
        int size = 0;
        while (n.next != null) {
            n = n.next;
            size++;
        }
        size++;
        for (int i = 0; i < size / 2; i++) {
            head = head.next;
        }
        return head;
    }
}