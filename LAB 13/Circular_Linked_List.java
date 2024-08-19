import java.util.Scanner;

public class Circular_Linked_List {

    class Node {
        int info;
        Node link;

        Node(int x) {
            info = x;
            link = null;
        }
    }

    Node first = null;
    Node last = null;

    public void insertAtFirst(int data) {
        Node newnode = new Node(data);
        if (first == null) {
            newnode.link = newnode;
            first = last = newnode;
        } else {
            newnode.link = first;
            last.link = newnode;
            first = newnode;
        }
    }

    public void insertAtEnd(int data) {
        Node newnode = new Node(data);
        if (first == null) {
            newnode.link = newnode;
            first = last = newnode;
        } else {
            newnode.link = first;
            last.link = newnode;
            last = newnode;
        }
    }

    public void delete(int x) {
        if (first == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node save = first;
        Node pred = null;

        while (save.info != x && save.link != first) {
            pred = save;
            save = save.link;
        }

        if (save.info != x) {
            System.out.println("Not found");
            return;
        }

        if (first == last) { // Only one element
            first = last = null;
        } else if (save == first) { // Deleting the first element
            first = first.link;
            last.link = first;
        } else { // Deleting any other element
            pred.link = save.link;
            if (save == last) {
                last = pred;
            }
        }
    }

    void display() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = first;
        do {
            System.out.println(temp.info);
            temp = temp.link;
        } while (temp != first);
    }

    public static void main(String args[]) {
        Circular_Linked_List c = new Circular_Linked_List();
        c.insertAtFirst(23);
        c.insertAtFirst(34);
        c.insertAtEnd(54);
        c.delete(23);
        c.display();
    }
}
