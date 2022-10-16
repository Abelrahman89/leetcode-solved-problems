package linked_list.study.doublelinkedlist;

public class LinkedList {
    Node head;

    public LinkedList Add(LinkedList list, int data) {
        Node node = new Node(data);
        Node currentNode = list.head;
        if (currentNode.next == null) {
            currentNode.next = node;
            currentNode.next.previous = currentNode;
        } else {
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = node;
            currentNode.next.previous = currentNode;
        }
        return list;
    }

    public LinkedList remove(LinkedList list, int data) {
        Node currentNode = list.head;
        if (currentNode.data == data) {
            currentNode = currentNode.next;
            currentNode.previous = null;
            System.out.println("data found and deleted");
            return list;
        } else {
            while (currentNode.next != null) {
                if (currentNode.next.data == data) {
                    System.out.println("data found and deleted");
                    currentNode.next = currentNode.next.next;
                    currentNode.previous.previous = currentNode;
                    return list;
                }
                currentNode = currentNode.next;
            }
        }
        System.out.println("data not found ");
        return list;
    }

    public LinkedList removeAtPosition(LinkedList list, int position) {

        Node currentNode = list.head;
        if (position > 0) {
            int counter = 0;
            while (currentNode.next != null && counter + 1 != position) {
                currentNode = currentNode.next;
                counter++;
            }
            if (counter + 1 == position) {
                if (currentNode.next == null) {
                    System.out.println("data not found ");
                    return list;
                }

                else
                    currentNode.next = currentNode.next.next;
                currentNode.previous.previous = currentNode;
                System.out.println("data found and deleted");
                return list;
            }
        }
        System.out.println("data not found ");
        return list;
    }

    public void search(LinkedList list, int data) {
        Node currentNode = list.head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;

        }
        if (currentNode.data == data) {
            System.out.println("data found ");
        } else
            System.out.println("data not found ");
    }

    public void printLinkedList(LinkedList list) {
        Node node = list.head;
        while (node != null) {
            System.out.println(node.data + (node.previous != null ? "  previous  " + node.previous.data : ""));

            node = node.next;
        }

    }
}
