package com.ik.top100.d0214;

public class L19 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int l = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            l++;
        }
        if (l == n) {
            return head.next;
        }
        int c = 0;
        curr = head;
        ListNode prev = null;
        while (curr != null) {
            if (c == l - n) {
                prev.next = curr.next;
                return head;
            }
            prev = curr;
            curr = curr.next;
            c++;
        }
        return head;
    }
}
