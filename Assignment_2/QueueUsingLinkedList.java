public class QueueUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node front;
        Node rear;

        public Queue() {
            this.front = null;
            this.rear = null;
        }

        public void enqueue(int value) {
            Node newNode = new Node(value);

            if (front == null) {
                front = newNode;
                rear = newNode;
                // Stop
                return;
            }

            rear.next = newNode;
            
            rear = newNode;
        }

        public int dequeue() {
            if (front == null) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int storedValue = front.data;

            front = front.next;

            if (front == null) {
                rear = null;
            }

            return storedValue;
        }

        public void display() {
            if (front == null) {
                System.out.println("Queue is Empty");
                return;
            }
            Node temp = front;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);

        q.enqueue(20);

        q.enqueue(30);
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        System.out.println("Attempting to dequeue from empty queue:");
        q.dequeue();
    }
}