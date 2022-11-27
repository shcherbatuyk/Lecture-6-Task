public class DoublyLinkedListQueue extends DoublyLinkedList {

    public void enqueue(int data) { // enqueue method
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

    public Node dequeue() { // dequeue method
        if (size == 0) {
            throw new RuntimeException("List is empty");
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        size--;
        return temp;
    }


    public boolean isEmpty() { // check if list is empty
        if (size == 0) {
            return true;
        }
            return false;

    }

    public void display() {  // print node-by-node values
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
