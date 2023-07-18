package Leetcode;

import java.time.temporal.JulianFields;

public class Question21 {

    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(10);
        ListNode value1 = new ListNode(20);
        head1.next = value1;
        value1.next = null;

        ListNode head2 = new ListNode(0);
        ListNode value2 = new ListNode(20);
//        head2.next = value2;
//        value2.next = null;

        ListNode answerHead = mergeTwoLists(null,head2);
        while (answerHead!=null){
            System.out.print(answerHead.val+"->");
            answerHead = answerHead.next;
        }
        System.out.print("END");

    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first  = list1;
        ListNode second = list2;
        ListNode head = null;

        if (first == null)
            return second;
        if (second == null)
            return first;

        while(first!=null && second!=null){

            if(first.val<second.val){
                if(head==null){
                    ListNode node = new ListNode(first.val,null);
                    head = node;
                }else {
                    ListNode node = new ListNode(first.val,null);
                    ListNode temp = head;
                    while(temp.next!=null){
                        temp = temp.next;
                    }
                    temp.next = node;
                }
                first = first.next;
            }else {
                if(head==null){
                    ListNode node = new ListNode(second.val,null);
                    head = node;
                }else {
                    ListNode node = new ListNode(second.val,null);
                    ListNode temp = head;
                    while(temp.next!=null){
                        temp = temp.next;
                    }
                    temp.next = node;
                }
                second = second.next;
            }
        }

        while(first!=null){
            ListNode node = new ListNode(first.val,null);
            ListNode temp;
            if(head == null){
                head = new ListNode(first.val,null);
            }
            temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
            first = first.next;
        }
        while(second!=null){
            ListNode node = new ListNode(second.val,null);
            ListNode temp;
            if(head == null){
                head = new ListNode(second.val,null);
            }
            temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
            second = second.next;
        }
        return head;
    }
}
