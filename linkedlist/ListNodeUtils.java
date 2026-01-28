package linkedlist;

public final class ListNodeUtils {
    private ListNodeUtils() {}
    public static class ListNode {
        public int val;
        public ListNodeUtils.ListNode next;
        ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNodeUtils.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode fromArray(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int v : arr) {
            cur.next = new ListNode(v);
            cur = cur.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val);
            if (cur.next != null) System.out.print(" -> ");
            cur = cur.next;
        }
        System.out.println();
    }
}