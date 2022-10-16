package linked_list.hasCycle;

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

    public void setVal(int val) {
        this.val = val;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    ListNode() {}
     ListNode(int val) { this.val = val; this.next=null; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
