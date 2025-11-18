public class StackUsingLinkedList {
    Node top;

    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Constructor for the Stack. Sets top to null (empty).
    public StackUsingLinkedList() {
        top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;

        top = newNode;
        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty. Nothing to pop.");
            return Integer.MIN_VALUE;
        }

        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty. Nothing to peek.");
            return Integer.MIN_VALUE; 
        }

        return top.data;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element is (peek): " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        stack.display();
    }
}