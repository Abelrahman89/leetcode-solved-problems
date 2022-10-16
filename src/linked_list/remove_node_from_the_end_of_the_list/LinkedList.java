package linked_list.remove_node_from_the_end_of_the_list;

public class LinkedList {
    ListNode head;

    public LinkedList(ListNode head) {
        this.head = head;
    }
    public void add(int data )
    {
        ListNode node =new ListNode(data);
        node.next=head;
        head=node;


    }
}
