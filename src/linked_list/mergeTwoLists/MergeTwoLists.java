package linked_list.mergeTwoLists;

import java.util.LinkedList;

public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list3 = new ListNode(3);
        list1.next = list3;
        ListNode list2 = new ListNode(2);
        ListNode list4 = new ListNode(4);
        list2.next = list4;
        System.out.println(mergeTwoLists(list1, list2));



    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        else if (list2 == null)
            return list1;

        else if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
