public class SinglyLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;

    public void push(int data) { // push an item in list
        Node newHeadNode = new Node(data);
        newHeadNode.next = head;
        head = newHeadNode;
    }

    public int pop() { // pop first item
        int val = head.data;
        head = head.next;
        return val;
    }

    public int top() { // get data of first item
        return head.data;
    }

    public int size() { // calculate and return size of list

        int size = 0;

        Node current = head;

        if (head == null) {
            return 0;
        }

        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public boolean isEmpty() { // check if list is empty
        if (head == null) {
            return true;
        }
            return false;
    }

    public void display() { // printing nodes values node-by-node
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}

