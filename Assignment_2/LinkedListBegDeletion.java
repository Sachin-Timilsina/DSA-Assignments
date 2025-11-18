public class LinkedListBegDeletion {
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

        public void insert(int value) {
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        public void deleteFromBeginning() {
            if (head == null) {
                System.out.println("List is empty, nothing to delete.");
                return;
            }

            System.out.println("Deleting head node with value: " + head.data);

            head = head.next;
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

        list.insert(30);
        list.insert(20);
        list.insert(10);
        
        list.display();

        list.deleteFromBeginning();
        list.display();

        list.deleteFromBeginning();
        list.deleteFromBeginning();
        list.display();

        // Try to delete from empty list
        list.deleteFromBeginning(); 
    }
}
