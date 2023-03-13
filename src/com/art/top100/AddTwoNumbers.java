package com.art.top100;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3,new ListNode(5,new ListNode(4,null)));
        ListNode l2 = new ListNode(4,new ListNode(2,new ListNode(6,null)));
        System.out.println(addTwoNumbers(l1,l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current =result;
        int carry = 0;
        while(l1!=null||l2!=null){
            int curr=0;
            if(l1!=null&&l2!=null){
                curr=l1.val+l2.val;
            }else if(l1!=null&& l2==null){
                curr=l1.val;
            }else if(l2!=null){
                curr=l2.val;
            }
            ListNode cur = new ListNode(curr%10);
            carry=curr/10;
            current.next=cur;
            current=current.next;
            l1=l1.next;
            l2=l2.next;
        }
        if(carry!=0){
            current.next=new ListNode(carry);
        }
        return result.next;

    }
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode result = new ListNode(0);
//        int v1 = 0;
//        int v2 = 0;
//        int hi = 0;
//        ListNode tmp = new ListNode();
//        tmp = result;
//        while (l1 != null || l2 != null) {
//            if (l1 == null) {
//                v1 = 0;
//            } else {
//                v1 = l1.val;
//            }
//            if (l2 == null) {
//                v2 = 0;
//            } else {
//                v2 = l2.val;
//            }
//            int sum = v1 + v2 + hi;
//            hi = sum > 9 ? 1 : 0;
//            sum = sum > 9 ? (sum - 10) : sum;
//            tmp.next = new ListNode(sum);
//            tmp = tmp.next;
//            if (l1 != null) {
//                l1 = l1.next;
//            }
//            if (l2 != null) {
//                l2 = l2.next;
//            }
//        }
//        if (hi == 1) {
//            tmp.next = new ListNode(hi);
//        }
//        return result.next;
//    }

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

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("ListNode{");
            sb.append("val=").append(val);
            sb.append(", next=").append(next);
            sb.append('}');
            return sb.toString();
        }
    }

}
