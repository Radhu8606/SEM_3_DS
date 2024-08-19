import java.util.Scanner;

public class Doubly_Linked_List {
    Scanner sc = new Scanner(System.in);

    static class Node {
        int info;
        Node lptr;
        Node rptr;

        Node(int data) {
            info = data;
            lptr = null;
            rptr = null;
        }
    }

    Node first = null;
    Node last = null;

    public void insertAtFirst(int data) {
        Node newnode = new Node(data);
        if (first == null) {
            first = last = newnode;
        } else {
            newnode.rptr = first;
            first.lptr = newnode;
            first = newnode;
        }
    }
    public void insertAtEnd(int data){
       Node newnode = new Node(data);
       if(last == null){
       	first = last = newnode;
       }
       else{
       	newnode.lptr = last;
       	last.rptr = newnode;
       	last = newnode;
       }
    }

    public void delete(int old) {
    if (first == null) {
        System.out.println("Underflow");
        return;
    }

    Node temp = first;
    while (temp != null && temp.info != old) {
        temp = temp.rptr;
    }

    if (temp == null) {
        System.out.println("Element not found");
        return;
    }

    // If node to be deleted is the only node
    if (first == last && temp == first) {
        first = last = null;
    } else if (temp == first) { // If node to be deleted is the first node
        first = first.rptr;
        first.lptr = null;
    } else if (temp == last) { // If node to be deleted is the last node
        last = last.lptr;
        last.rptr = null;
    } else { // If node to be deleted is a middle node
        temp.lptr.rptr = temp.rptr;
        temp.rptr.lptr = temp.lptr;
    }
}


    void display() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.info);
            temp = temp.rptr;
        }
    }

    public static void main(String[] args) {
        Doubly_Linked_List a = new Doubly_Linked_List();
        a.insertAtFirst(25);
        a.insertAtFirst(34);
        a.insertAtFirst(56);
        a.delete(56);
        a.display();
    }
}
