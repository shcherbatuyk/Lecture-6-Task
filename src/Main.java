public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList(); // Singly Linked List demonstration

        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        sList.display();

        sList.push(12);
        sList.display();

        sList.pop();
        sList.display();

        System.out.println("sList top: " + sList.top());
        System.out.println("sList size: " + sList.size() + " Nodes");
        System.out.println("sList is empty: " + sList.isEmpty());
        System.out.println("********************************************");

        DoublyLinkedListQueue dListQ = new DoublyLinkedListQueue();// Doubly Linked List Queue demonstration

        dListQ.enqueue(1);
        dListQ.enqueue(2);
        dListQ.enqueue(3);
        dListQ.enqueue(4);

        dListQ.display();

        System.out.println("Dequeue: " + dListQ.dequeue().data);
        dListQ.display();
        System.out.println("dListQ size: " + dListQ.size);
        System.out.println("dListQ is empty:" + dListQ.isEmpty());
        System.out.println("********************************************");

        DoublyLinkedList dList = new DoublyLinkedList(); // Doubly Linked List demonstration

        dList.addLast(2);
        dList.addLast(3);
        dList.addLast(4);
        dList.addLast(5);
        dList.addFirst(1);

        dList.display();

        dList.add(2, 9);
        dList.display();

        System.out.println("dList size: " + dList.size);
        System.out.println("dList is empty:" + dList.isEmpty());
    }
}