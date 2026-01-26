package linkedlist.leetcode21_mergetwosortedlists;


import linkedlist.ListNodeUtils;

import static linkedlist.ListNodeUtils.ListNode;
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        while (list1!=null&&list2!=null){
            if (list1.val<list2.val){
                node.next=list1;
                list1 = list1.next;
            } else {
                node.next=list2;
                list2 = list2.next;
            }
            node=node.next;
        }
        if (list1!=null){
            node.next=list1;
        }else {
            node.next=list2;
        }
        return dummy.next;
    }


    public static void main(String[] args) {
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        ListNode list1 = ListNodeUtils.fromArray(new int[]{1,2,4});
        ListNode list2 = ListNodeUtils.fromArray(new int[]{1,3,5});
        ListNode list = m.mergeTwoLists(list1, list2);
        ListNodeUtils.printList(list);
    }
}
