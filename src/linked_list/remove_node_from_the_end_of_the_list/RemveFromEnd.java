package linked_list.remove_node_from_the_end_of_the_list;

public class RemveFromEnd {
    public static void main(String[] args) {

        ListNode head = new ListNode(5);
        LinkedList l = new LinkedList(head);
        l.add(4);
        l.add(3);
        l.add(2);
        l.add(1);
        ListNode n;
        n=removeNthFromEnd(l.head,2);
       System.out.println(n);
        head = new ListNode(1);
        l = new LinkedList(head);


        n = removeNthFromEnd(l.head, 1);
        System.out.println(n);

        head = new ListNode(2);
        l = new LinkedList(head);
        l.add(1);

        n = removeNthFromEnd(l.head, 2);
        System.out.println(n);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode previous = new ListNode(0);
        previous.next=head;
            ListNode currentNode = head;
            int nodeLength =1;
            while (currentNode.next != null) {
                nodeLength++;
                currentNode = currentNode.next;
            }
            if (nodeLength == 0)
                return previous.next;
            currentNode = previous;
                for (int i = 0; i < nodeLength - n; i++)
                    currentNode = currentNode.next;
                currentNode.next = currentNode.next.next;

        return previous.next;
    }


}
