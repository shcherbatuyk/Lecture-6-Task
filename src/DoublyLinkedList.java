public class DoublyLinkedList {
    static class Node {
        public int data;
        public DoublyLinkedList.Node next;
        public DoublyLinkedList.Node prev;

    }

    public DoublyLinkedList.Node head;
    public DoublyLinkedList.Node tail;
    public int size;

    public void addFirst(int data) {  // add first item
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        newNode.prev = null;
        if (head != null)
            head.prev = newNode;
        head = newNode;
        if (tail == null)
            tail = newNode;
        size++;
    }

    public void addLast(int data) { //add last item
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        newNode.prev = tail;
        if (tail != null)
            tail.next = newNode;
        tail = newNode;
        if (head == null)
            head = newNode;
        size++;
    }

    public void addByIndex(int index, int data) // add after item by index
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        newNode.prev = null;

        if (index == 0) {               // if index == 0 ==> addFirst()
            addFirst(data);
        } else if (index == 1) {         // if index == 1 ==> adding a head
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            Node tempNode = new Node();
            tempNode = head;
            for (int i = 1; i < index - 1; i++) {
                if (tempNode != null) {
                    tempNode = tempNode.next;
                }
            }

            if (tempNode != null) {
                newNode.next = tempNode.next;
                newNode.prev = tempNode;
                tempNode.next = newNode;
                if (newNode.next != null)
                    newNode.next.prev = newNode;
            } else {
                System.out.println("The previous node is null!");
            }

            size++;
        }
    }

    public void display() {         // print node-by-node values
        DoublyLinkedList.Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public boolean isEmpty() { // checking if empty
        if (size == 0) {
            return true;
        }
            return false;
        
    }
}
