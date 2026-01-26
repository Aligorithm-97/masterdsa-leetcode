package linkedlist.leetcode206_reverselinkedlist;
import linkedlist.ListNodeUtils;

import static linkedlist.ListNodeUtils.ListNode;
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        ListNode head = ListNodeUtils.fromArray(new int[]{1,2,3,4});

        ListNodeUtils.printList(head);

        ListNode reversed = list.reverseList(head);

        ListNodeUtils.printList(reversed);
    }
}
