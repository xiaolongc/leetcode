package com.ik.top100.d0215;

public class L21 {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr = null;
        ListNode head = null;
        boolean first = true;
        while (list1 != null || list2 != null) {
            if (first) {
                curr = new ListNode();
                head = curr;
            } else {
                curr.next = new ListNode();
                curr = curr.next;
            }
            int v1 = list1 == null ? 1000 : list1.val;
            int v2 = list2 == null ? 1000 : list2.val;
            if (v1 > v2) {
                curr.val = v2;
                list2 = list2.next;
            } else {
                curr.val = v1;
                list1 = list1.next;
            }
            if (first) {
                first = false;
            }
        }
        return head;
    }
}
