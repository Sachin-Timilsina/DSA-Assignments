public class LinkedListEndInsertion {

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

        public LinkedList() {
            this.head = null;
        }

        public void insertAtEnd(int value) {
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

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data );
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.display();
    }
}