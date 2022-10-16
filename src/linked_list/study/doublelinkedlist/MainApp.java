package linked_list.study.doublelinkedlist;

public class MainApp {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node node = new Node(1,null);
        list.head = node;
        list.printLinkedList(list);

        list.Add(list, 2);
       list.Add(list, 3);
        list.Add(list, 4);
        list.printLinkedList(list);

       list.search(list, 5);
        list.removeAtPosition(list, 4);
  //     list.remove(list, 4);
       list.printLinkedList(list);


    }
}
