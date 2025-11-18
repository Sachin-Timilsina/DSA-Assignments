public class LinkedListInsertion {

    // Node class structure
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
        Node tail;

        public void insertAtPosition(int value, int position) {
            Node newNode = new Node(value);

            if (position == 0) {
                newNode.next = head;
                
                head = newNode;
                if (tail == null) {
                    tail = newNode;
                }

                return; 
            }

            Node current = head;
            int currentPos = 0;

            while (current != null && currentPos < position - 1) {
                current = current.next;
                currentPos++;
            }

            if (current == null) {
                System.out.println("Error: Invalid position " + position);
                return;
            }

            newNode.next = current.next;
            current.next = newNode;

            if (newNode.next == null) {
                tail = newNode;
            }
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
        
        list.insertAtPosition(10, 0); 
        list.display();

        list.insertAtPosition(20, 1); 
        list.display();

        list.insertAtPosition(40, 2); 
        list.display();

        list.insertAtPosition(30, 2); 
        list.display();

        System.out.println("Inserting at invalid position 10:");
        list.insertAtPosition(99, 10); 
    }
}