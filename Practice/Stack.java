
class Stack {
    class Node {
    int info;
    Node link;

    Node(int data) {
        this.info = data;
        this.link = null;
    }
} 
    private Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int info) {
        Node newNode = new Node(info);
        newNode.link = top;
        top = newNode;
        System.out.println("Pushed " + info + " onto the stack.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Using -1 as a sentinel value for empty stack
        }
        int poppedValue = top.info;
        top = top.link;
        System.out.println("Popped " + poppedValue + " from the stack.");
        return poppedValue;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node current = top;
        System.out.print("Stack elements: ");
        while (current != null) {
            System.out.print(current.info + " -> ");
            current = current.link;
        }
        System.out.println("None");
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();
}
}
