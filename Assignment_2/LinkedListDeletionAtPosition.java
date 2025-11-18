public class LinkedListDeletionAtPosition {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        public void insert(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        public void deleteAtPosition(int position) {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }

            if (position == 0) {
                System.out.println("Deleting head node: " + head.data);
                head = head.next;
                return;
            }

            Node prev = head;
            int count = 0;

            while (prev != null && count < position - 1) {
                prev = prev.next;
                count++;
            }

            if (prev == null || prev.next == null) {
                System.out.println("Invalid position " + position);
                return;
            }

            Node current = prev.next; 
            System.out.println("Deleting node at pos " + position + " with value: " + current.data);

            prev.next = current.next;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10); 
        list.insert(20); 
        list.insert(30); 
        list.insert(40); 
        list.display();

        list.deleteAtPosition(2); 
        list.display();

        list.deleteAtPosition(0); 
        list.display();

        // Invalid position
        list.deleteAtPosition(10); 
    }
}
