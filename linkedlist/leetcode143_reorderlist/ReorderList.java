package linkedlist.leetcode143_reorderlist;
import linkedlist.ListNodeUtils;

import static linkedlist.ListNodeUtils.ListNode;

public class ReorderList {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        ListNode prev = slow.next = null;
        while (second != null) {
            ListNode tmp = second.next;
            second.next = prev;
            prev = second;
            second = tmp;
        }

        ListNode first = head;
        second = prev;
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
    }



    public static void main(String[] args) {
        ReorderList reorderList = new ReorderList();
        ListNode list1 = ListNodeUtils.fromArray(new int[]{2,4,6,8});
        reorderList.reorderList(list1);
        ListNodeUtils.printList(list1);
    }
}
