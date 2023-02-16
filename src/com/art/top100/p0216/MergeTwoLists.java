package com.art.top100.p0216;

public class MergeTwoLists {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null){
            if (list2==null){
                return null;
            }else {
                return list2;
            }
        }else {
            if (list2==null){
                return list1;
            }else {
                if (list1.val< list2.val){
                    list1.next=mergeTwoLists(list1.next,list2);
                    return list1;
                }else {
                    list2.next=mergeTwoLists(list1,list2.next);
                    return list2;
                }
            }
        }
    }



}
