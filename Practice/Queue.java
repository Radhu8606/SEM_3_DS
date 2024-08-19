public class Queue {
    class Node {
    int info;
    Node link;

    public Node(int data) {
        this.info = data;
        this.link = null;
    }
}
    private Node front, rear;
    private int size;

    public Queue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    // Method to add an element to the queue (enqueue operation)
    public void enqueue(int info) {
        Node newNode = new Node(info);
        
        if (this.rear == null) {
            this.front = this.rear = newNode;
            size++;
            return;
        }

        this.rear.link = newNode;
        this.rear = newNode;
        size++;
    }

    // Method to remove an element from the queue (dequeue operation)
    public int dequeue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int info = this.front.info;
        this.link = this.front.link;

        if (this.front == null) {
            this.rear = null;
        }

        size--;
        return info;
    }

    // Method to get the front element of the queue
    public int front() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return this.front.info;
    }

    // Method to get the size of the queue
    public int size() {
        return size;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return this.front == null;
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeued element: " + q.dequeue());
        System.out.println("Front element: " + q.front());
        System.out.println("Queue size: " + q.size());
        System.out.println("Is queue empty? " + q.isEmpty());
    }
}
