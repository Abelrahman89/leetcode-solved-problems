package linked_list.study.doublelinkedlist;

public class Node {
    int data;
    Node next;
    Node previous;

    public Node(int data) {
        this.data = data;
        next=null;
        previous=null;
    }

    public Node(int data, Node previous) {
        this.data = data;
        next=null;
        this.previous=previous;
    }
}
