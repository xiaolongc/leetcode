package com.ik.top100.d0215;

import com.ik.top100.ListNode;

public class L24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        ListNode curr = head;
        curr.next = newHead.next;
        newHead.next = curr;
        while (true) {
            if (curr.next == null || curr.next.next == null) {
                break;
            }
            ListNode next = curr.next;
            ListNode nextNext = curr.next.next;
            curr.next = nextNext;
            next.next = nextNext.next;
            nextNext.next = next;
            curr = next;
        }
        return newHead;
    }

}
