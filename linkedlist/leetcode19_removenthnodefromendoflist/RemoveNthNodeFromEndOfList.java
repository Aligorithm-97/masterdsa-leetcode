package linkedlist.leetcode19_removenthnodefromendoflist;
import linkedlist.ListNodeUtils;

import static linkedlist.ListNodeUtils.ListNode;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;
        while (n>0){
            right = right.next;
            n--;
        }
        while (right != null){
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return dummy.next;
    }


    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList rm = new RemoveNthNodeFromEndOfList();
        ListNode list1 = ListNodeUtils.fromArray(new int[]{1,2,3,4});
        ListNode l = rm.removeNthFromEnd(list1, 2);
        ListNodeUtils.printList(l);
    }
}
