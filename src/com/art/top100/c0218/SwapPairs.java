package com.art.top100.c0218;

public class SwapPairs {

    public static void main(String[] args) {
        SwapPairs pairs = new SwapPairs();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        ListNode node = pairs.swapPairs(head);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cun = head.next;
        if (head.next.next == null) {
            head.next = null;
            cun.next = head;
        } else {
            head.next = swapPairs(cun.next);
            cun.next = head;
        }
        return cun;
    }

    public static class ListNode {
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
}
