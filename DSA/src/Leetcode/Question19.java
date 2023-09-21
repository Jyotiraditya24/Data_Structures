package Leetcode;

import java.util.List;

public class Question19 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        removeNthFromEnd(node1,2);

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode tempHead = head;

        if(head == null){
            return head;
        }

        // finding the size of the linked list
        while(tempHead!=null){
            size+=1;
            tempHead = tempHead.next;
        }
        // resetting it
        tempHead = head;
        int tempCount = 1;

        while(tempCount!=size && tempHead!=null){
            tempHead = tempHead.next;
        }

        if(tempHead.next!=null){
            tempHead.next = tempHead.next.next;
        }


        return head;

    }
}

  class ListNode {
     int val;
     ListNode next;
     ListNode() {}ListNode(int val) { this.val = val; }ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
