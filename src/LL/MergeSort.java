package LL;

public class MergeSort {
    public class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }
    }
    public ListNode sortList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2){
        ListNode dummyhead = new ListNode();
        ListNode tail = dummyhead;
        while(list1 != null && list2 != null){
             if (list1.val < list2.val){
                 tail.next = list1;
                 list1 = list1.next;
                 tail = tail.next;
             }else{
                 tail.next = list2;
                 list2 = list2.next;
                 tail = tail.next;
             }
        }
        while(list1 != null){
            tail.next = list1;
            list1 = list1.next;
            tail = tail.next;
        }
        while (list2 != null){
            tail.next = list2;
            list2 = list2.next;
            tail = tail.next;
        }
        return dummyhead;
    }
    ListNode getMid(ListNode head){
        ListNode midPrev = null;
        while (head != null && head.next != null){
            midPrev  = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

}
