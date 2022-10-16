package linked_list.reverseList;


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode next=null, current=head,prev=null;
        while(current !=null)
        {
            next=prev;
            prev=current;

            current=current.next;
            prev.next=next;
        }

        return prev;
    }
}