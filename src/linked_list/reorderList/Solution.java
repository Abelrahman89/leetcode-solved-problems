package linked_list.reorderList;

class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode newNode = new ListNode(2);
        head.next = newNode;
        newNode = new ListNode(3);
        head.next.next = newNode;
        newNode = new ListNode(4);
        head.next.next.next = newNode;
        newNode = new ListNode(5);
        head.next.next.next = newNode;

        reorderList(head);

    }

    //it can done by divide the linked list to two arrays and reverse the escond one then
    // put one from here and one from here

    public static void reorderList(ListNode head) {
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
}