package com.art.top100;

public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int v1 = 0;
        int v2 = 0;
        int hi = 0;
        ListNode tmp = new ListNode();
        tmp = result;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                v1 = 0;
            } else {
                v1 = l1.val;
            }
            if (l2 == null) {
                v2 = 0;
            } else {
                v2 = l2.val;
            }
            int sum = v1 + v2 + hi;
            hi = sum > 9 ? 1 : 0;
            sum = sum > 9 ? (sum - 10) : sum;
            tmp.next = new ListNode(sum);
            tmp = tmp.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (hi == 1) {
            tmp.next = new ListNode(hi);
        }
        return result.next;
    }

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

}
