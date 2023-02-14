package com.ik.top100.d0213;

import java.util.ArrayList;
import java.util.List;

public class L2 {

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode curr = head;
        boolean overflow = false;
        boolean first = true;
        while (true) {
            if (l1 == null && l2 == null && !overflow) {
                break;
            }
            int v1 = 0;
            if (l1 != null) {
                v1 = l1.val;
                l1 = l1.next;
            }
            int v2 = 0;
            if (l2 != null) {
                v2 = l2.val;
                l2 = l2.next;
            }
            if (!first) {
                curr.next = new ListNode();
                curr = curr.next;
            }
            if (first) {
                first = false;
            }
            int val = v1 + v2 + (overflow ? 1 : 0);
            if (val >= 10) {
                overflow = true;
                val = val - 10;
            } else {
                overflow = false;
            }
            curr.val = val;
        }
        return head;
    }
}
