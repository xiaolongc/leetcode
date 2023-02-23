package com.art.top100.c0223;

import com.art.top100.ListNode;

public class DeleteDuplicates {
    public static void main(String[] args) {
        DeleteDuplicates deleteDuplicates = new DeleteDuplicates();
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, null))));
        System.out.println(deleteDuplicates.deleteDuplicates(head));

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;


    }


}
