public class SinglyLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }
    private Node head;

    void addLast(int value) {
        Node node = new Node(value);
        if (head == null) { head = node; return; }
        Node current = head;
        while (current.next != null) current = current.next;
        current.next = node;
    }

    void display() {
        for (Node current = head; current != null; current = current.next)
            System.out.print(current.data + (current.next == null ? "" : " -> "));
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(10); list.addLast(20); list.addLast(30);
        list.display();
    }
}
