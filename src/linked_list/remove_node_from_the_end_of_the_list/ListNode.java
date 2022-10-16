package linked_list.remove_node_from_the_end_of_the_list;

public class ListNode {
    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; this.next=null; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
