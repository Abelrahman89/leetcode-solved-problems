package linked_list.delete_node;

public class DeleteNode {


    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode newNode = new ListNode(5);
        head.next = newNode;
    }

    public static void deleteNode(ListNode node) {
        ListNode currentNode = node;
        ListNode previous=null;
        while (currentNode.next!=null)
        {
            currentNode.val=currentNode.next.val;
            previous=currentNode;
            currentNode=currentNode.next;
        }
        previous.next=null;
    }
}
